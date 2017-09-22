package com.example.weitan.projectmega.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.weitan.projectmega.R;
import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {

    ImageButton results, profile, plan, exercises;
    Button logoutButton;

    // [START declare_auth]
    private FirebaseAuth mAuth;
    // FirebaseAuth.AuthStateListener mAuthListener;
    // [END declare_auth]


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Buttons
        results = (ImageButton) findViewById(R.id.icon_result);
        profile = (ImageButton) findViewById(R.id.icon_profile);
        plan = (ImageButton) findViewById(R.id.icon_plan);
        exercises = (ImageButton) findViewById(R.id.icon_exercises);
        logoutButton = (Button) findViewById(R.id.sign_out_button);

        // [START initialize_auth]
        mAuth = FirebaseAuth.getInstance();
        // [END initialize_auth]

        // Set OnClickListeners
        results.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Results.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Profile.class));
            }
        });

        plan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Plan.class));
            }
        });

        exercises.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Exercises.class));
            }
        });

        logoutButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // mAuth.signOut();
                startActivity(new Intent(Dashboard.this, GoogleSignInActivity.class));
            }
        });
    }
}