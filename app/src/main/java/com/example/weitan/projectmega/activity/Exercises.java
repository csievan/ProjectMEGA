package com.example.weitan.projectmega.activity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.weitan.projectmega.R;

public class Exercises extends AppCompatActivity {



    private VideoView v1, v2, v3, v4, v5, v6, v7;
    private MediaController mediaC1, mediaC2, mediaC3, mediaC4, mediaC5, mediaC6, mediaC7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        //Videos
        v1 = (VideoView) findViewById(R.id.exDemo1);
        View v11 = findViewById(R.id.exDemo1);

        //videos
        v2 = (VideoView) findViewById(R.id.exDemo2);
        v3 = (VideoView) findViewById(R.id.exDemo3);
        v4 = (VideoView) findViewById(R.id.exDemo4);
        v5 = (VideoView) findViewById(R.id.exDemo5);
        v6 = (VideoView) findViewById(R.id.exDemo6);
        v7 = (VideoView) findViewById(R.id.exDemo7);


        mediaC1 = new MediaController(this);
        mediaC2 = new MediaController(this);
        mediaC3 = new MediaController(this);
        mediaC4 = new MediaController(this);
        mediaC5 = new MediaController(this);
        mediaC6 = new MediaController(this);
        mediaC7 = new MediaController(this);




        /*v1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                v1.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v1);
                String path = "android.resource://"+getPackageName()+"/"+ R.raw.v1;
                Uri uri = Uri.parse(path);
                v1.setVideoURI(uri);

                v1.setMediaController(mediaC);
                mediaC.setAnchorView(v1);
                switch (motionEvent.getAction()){
                    case MotionEvent.
                }
                v1.start();
                return true;
            }
        });*/


        v1.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v1);
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v1;
        Uri uri = Uri.parse(path);
        v1.setVideoURI(uri);

//        v1.setMediaController(mediaC1);


        v1.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
//                mediaC1.setAnchorView(v1);
                if(v1.isPlaying())
                {
                    v1.pause();
                    if (!mediaC1.isShowing())
                    {
//                        mediaC1.setAnchorView(v1);
                        mediaC1.hide();

                    }
                    return false;
                }
                else if(!v1.isPlaying())
                {

                    if (mediaC1.isShowing())
                    {
                        mediaC1.hide();
                    }
                    v1.seekTo(v1.getCurrentPosition());
                    v1.start();
                    return false;
                }
                return false;
            }
        });
    }




        //play video exercise #1
        /*v1.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v1);

        v1.setMediaController(mediaC);
        v1.requestFocus();
        mediaC.setAnchorView(v1);
        v1.start();*/


        /*v1.setVideoURI(Uri.parse("android.resource://" +getPackageName()+ "/"+R.raw.v1));
        v1.setMediaController(new MediaController(this));
        v1.requestFocus();
        v1.start();

        //play video exercise #2
        v2.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v2);

        v2.setMediaController(mediaC);
        v2.requestFocus();
        mediaC.setAnchorView(v2);
        v2.start();

        v1.setVideoURI(Uri.parse("android.resource://" +getPackageName()+ "/"+R.raw.v1));
        v1.setMediaController(new MediaController(this));
        v1.requestFocus();
        v1.start();*/

    //Onclick event plan, go to plan activity
        /*v1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Dashboard.this, Plan.class));
        }
    });*/


    /*public void videoplay1(View v){
        v1.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v1);
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v1;
        Uri uri = Uri.parse(path);
        v1.setVideoURI(uri);

        v1.setMediaController(mediaC);
        mediaC.setAnchorView(v1);

        v1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                v1.start();
                return true;
            }
        });


    }*/

    public void videoplay2(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v2;
        Uri uri = Uri.parse(path);
        v2.setVideoURI(uri);
        v2.setMediaController(mediaC2);
        mediaC2.setAnchorView(v2);
        v2.start();
    }

    public void videoplay3(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v3;
        Uri uri = Uri.parse(path);
        v3.setVideoURI(uri);
        v3.setMediaController(mediaC3);
        mediaC3.setAnchorView(v3);
        v3.start();
    }

    public void videoplay4(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v4;
        Uri uri = Uri.parse(path);
        v4.setVideoURI(uri);
        v4.setMediaController(mediaC4);
        mediaC4.setAnchorView(v4);
        v4.start();
    }

    public void videoplay5(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v5;
        Uri uri = Uri.parse(path);
        v5.setVideoURI(uri);
        v5.setMediaController(mediaC5);
        mediaC5.setAnchorView(v5);
        v5.start();
    }

    public void videoplay6(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v6;
        Uri uri = Uri.parse(path);
        v6.setVideoURI(uri);
        v6.setMediaController(mediaC6);
        mediaC6.setAnchorView(v6);
        v6.start();
    }

    public void videoplay7(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v7;
        Uri uri = Uri.parse(path);
        v7.setVideoURI(uri);
        v7.setMediaController(mediaC7);
        mediaC7.setAnchorView(v7);
        v7.start();
    }
}
