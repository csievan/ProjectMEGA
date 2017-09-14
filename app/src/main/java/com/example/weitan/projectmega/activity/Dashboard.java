package com.example.weitan.projectmega.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.weitan.projectmega.R;
import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {

    ImageButton plan, exercise, profile;
    Button logoutButton;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Buttons
        //ImageButton ShowPlan = (ImageButton) findViewById(R.id.iconTxt_calendar);
        exercise = (ImageButton) findViewById(R.id.icon_exercises);
        plan = (ImageButton) findViewById(R.id.icon_calendar);
        profile = (ImageButton) findViewById(R.id.icon_profile);
        logoutButton = (Button) findViewById(R.id.sign_out_button);

        mAuth = FirebaseAuth.getInstance();

        //Onclick event Exercise, go to Exercise activity
        exercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Exercise.class));
            }
        });

        //Onclick event plan, go to plan activity
        plan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Plan.class));
            }
        });

        //Onclick event profile, go to profile activity
        profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Profile.class));
            }
        });

        /*ShowPlan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Dashboard.this);
                mBuilder.setMessage("There is no plan at the moment, do you want to create one?");
                mBuilder.setPositiveButton("Create", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                mBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog alertDialog=mBuilder.create();
                alertDialog.show();

            }
        });*/

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null) {
                    startActivity(new Intent(Dashboard.this, GoogleSignInActivity.class));
                }
            }
        };

        logoutButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
            }
        });
    }
}
