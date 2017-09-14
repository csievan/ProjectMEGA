package com.example.weitan.projectmega.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.weitan.projectmega.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

        public class Plan extends AppCompatActivity {

            private DatabaseReference mDatabase;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_plan);
                //mDatabase = FirebaseDatabase.getInstance().getReferenceFromUrl("https://projectmega-5b36b.firebaseio.com/");


                /*FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");

                myRef.setValue("Hello, World!");*/

    }

}
