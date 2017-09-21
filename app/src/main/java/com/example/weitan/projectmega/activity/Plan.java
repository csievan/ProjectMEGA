package com.example.weitan.projectmega.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weitan.projectmega.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Plan extends AppCompatActivity {

    private static final String TAG = "Plan";

    // Declare variables

    NumberPicker exePerWeek, exeDuration;
    Button nextStep;
    CheckBox weekend;
    TextView display;




    private DatabaseReference databasePlan;


    //private DatabaseReference databaseuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        databasePlan = FirebaseDatabase.getInstance().getReference("plans");

        /*
        if(myRef.equals(true)){
            display.setText(myRef.getKey());
        } else {display.setText("cannot connect");}
        */

        nextStep = (Button) findViewById(R.id.Next);
        weekend = (CheckBox) findViewById(R.id.checkExeWeekend);


        //NumberPickers
        exePerWeek = (NumberPicker) findViewById(R.id.exWeekInput);
        exeDuration = (NumberPicker) findViewById(R.id.durationInput);


        exePerWeek.setMaxValue(50);
        exePerWeek.setMinValue(1);
        exePerWeek.setValue(5);
        exePerWeek.setWrapSelectorWheel(false);

        exeDuration.setMaxValue(240);
        exeDuration.setMinValue(1);
        exeDuration.setValue(20);
        exePerWeek.setWrapSelectorWheel(false);


        // save button listener
        nextStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlan();
            }
        });
    }


    //write to DB
    private void addPlan() {

        //exercises per week and duration
        int weekFrequency = exePerWeek.getValue();
        int duration = exeDuration.getValue();

        Log.d(TAG, "WeekFrequency: " + weekFrequency);
        Log.d(TAG, "duration: " + duration);

        //get current userId from database relate it to plans
        String id = databasePlan.push().getKey();
        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        String userId = currentFirebaseUser.getUid();

        Log.d(TAG, "userID: " + userId);



        if (weekend.isChecked()) {
            String week = "true";
            Log.d(TAG, "ExerciseWeekend: " + week);
            Plans plan = new Plans(id, userId, weekFrequency, duration, week);
            databasePlan.child(id).setValue(plan);
        } else {
            String week = "false";
            Log.d(TAG, "ExerciseWeekend: " + week);
            Plans plan = new Plans(id, userId, weekFrequency, duration, week);
            databasePlan.child(id).setValue(plan);
        }

    // Notify about Update
    Toast.makeText(this, "Plan created", Toast.LENGTH_LONG).show();
    }
}