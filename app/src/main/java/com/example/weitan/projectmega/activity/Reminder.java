package com.example.weitan.projectmega.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.weitan.projectmega.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Reminder extends AppCompatActivity {
    private static final String TAG = "Plan";

    private CheckBox reminder;
    private Button save;

    private DatabaseReference databaseReminder, databasePlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        reminder = (CheckBox) findViewById(R.id.checkExeWeekend);
        save = (Button) findViewById(R.id.Next);

        databaseReminder = FirebaseDatabase.getInstance().getReference("notification");
//        databasePlan = FirebaseDatabase.getInstance().getReference("plans");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckReminder();
            }
        });


    }

    public void CheckReminder(){

        //get current userId from database relate it to plans
//        String id = databaseReminder.push();
        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        String userId = currentFirebaseUser.getUid();


        if(reminder.isChecked()){
            String noti = "true";
            Log.d(TAG, "Reminder: " + noti);
            ReminderObj reminderObj = new ReminderObj(noti);
            databaseReminder.child(userId).setValue(reminderObj);
        } else {
            String noti = "false";
            Log.d(TAG, "Reminder: " + noti);
            ReminderObj reminderObj = new ReminderObj(noti);
            databaseReminder.child(userId).setValue(reminderObj);
        }
    }
}
