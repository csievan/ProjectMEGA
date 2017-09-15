package com.example.weitan.projectmega.activity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.wifi.aware.PublishConfig;
import android.renderscript.Element.DataType;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weitan.projectmega.R;
import com.google.android.gms.internal.kx;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;
import java.util.List;

public class Profile extends AppCompatActivity {

    private static final String TAG = "Profile";

    // Declare variables
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private NumberPicker npHeight, npWeight;
    private RadioGroup rg;
    private RadioButton rb;
    private Button buttonAdd;
    private DatabaseReference databaseUsers;

    // [START declare_auth]
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    // [END declare_auth]

    private String date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Setting up the Views
        rg = (RadioGroup) findViewById(R.id.gender);

        npHeight = (NumberPicker) findViewById(R.id.np_height);
        npHeight.setMaxValue(210);
        npHeight.setMinValue(120);
        npHeight.setValue(165);
        npHeight.setWrapSelectorWheel(false);

        npWeight = (NumberPicker) findViewById(R.id.np_weight);
        npWeight.setMaxValue(200);
        npWeight.setMinValue(40);
        npWeight.setValue(70);
        npWeight.setWrapSelectorWheel(false);

        mDisplayDate = (TextView) findViewById(R.id.tv_birthday);
        buttonAdd = (Button) findViewById(R.id.save_button);

        // Getting the Firebase url
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        final String userId = currentUser.getUid();


        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar cal = Calendar.getInstance();

                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Profile.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });


        // Save button listener
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUser();
            }
        });

        // Getting the user input from the date picker
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                // Months range from 0-11
                month = month + 1;

                date = day + "/" + month + "/" + year;
                mDisplayDate.setText(date);
            }
        };

        // Read from the database
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String userBirth = dataSnapshot.child("users").child(userId).child("userBirth").getValue(String.class);
                String userGender = dataSnapshot.child("users").child(userId).child("userGender").getValue(String.class);
                int userHeight = dataSnapshot.child("users").child(userId).child("userHeight").getValue(int.class);
                int userWeight = dataSnapshot.child("users").child(userId).child("userWeight").getValue(int.class);
                Log.d(TAG, "Value is: " + userBirth + " / " + userGender + " / " + userHeight + " / " + userWeight);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }

    public void rbClick(View view) {
        int radioButtonId = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(radioButtonId);
    }

    // Write to DB
    private void addUser() {

        // Gender
        String rbGender = rb.getText().toString();
        Log.d(TAG, "GENDER: " + rbGender);

        // Birth
        String birth = date.toString();
        Log.d(TAG, "BIRTH: " + birth);

        // Height and Weight
        int height = npHeight.getValue();
        int weight = npWeight.getValue();
        Log.d(TAG, "HEIGHT: " + height);
        Log.d(TAG, "WEIGHT: " + weight);


        FirebaseUser currentUser = mAuth.getCurrentUser();
        String userId = currentUser.getUid();

        Log.d(TAG, "userEmail: " + userId);

        Users user = new Users(userId, rbGender, birth, height, weight);
        mDatabase.child("users").child(userId).setValue(user);

        // Notify about Update
        Toast.makeText(this, "User added", Toast.LENGTH_LONG).show();
    }
}
