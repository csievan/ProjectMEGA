package com.example.weitan.projectmega.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.weitan.projectmega.R;
import com.google.firebase.database.DatabaseReference;

public class Reminder extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

    }
}
