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

        //Exercise #1 video
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

                    return false;
                }
                else if(!v1.isPlaying())
                {
                    v1.seekTo(v1.getCurrentPosition());
                    v1.start();
                    return false;
                }
                return false;
            }
        });


        //Exercise #2 video
        v2.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v2);
        String path2 = "android.resource://"+getPackageName()+"/"+ R.raw.v2;
        Uri uri2 = Uri.parse(path2);
        v2.setVideoURI(uri2);

        v2.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
//                mediaC1.setAnchorView(v1);
                if(v2.isPlaying())
                {
                    v2.pause();

                    return false;
                }
                else if(!v2.isPlaying())
                {
                    v2.seekTo(v2.getCurrentPosition());
                    v2.start();
                    return false;
                }
                return false;
            }
        });



        //Exercise #3 video
        v3.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v3);
        String path3 = "android.resource://"+getPackageName()+"/"+ R.raw.v3;
        Uri uri3 = Uri.parse(path3);
        v3.setVideoURI(uri3);

        v3.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
//                mediaC1.setAnchorView(v1);
                if(v3.isPlaying())
                {
                    v3.pause();

                    return false;
                }
                else if(!v3.isPlaying())
                {
                    v3.seekTo(v3.getCurrentPosition());
                    v3.start();
                    return false;
                }
                return false;
            }
        });


        //Exercise #4 video
        v4.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v4);
        String path4 = "android.resource://"+getPackageName()+"/"+ R.raw.v4;
        Uri uri4 = Uri.parse(path4);
        v4.setVideoURI(uri4);

        v4.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
//                mediaC1.setAnchorView(v1);
                if(v4.isPlaying())
                {
                    v4.pause();

                    return false;
                }
                else if(!v4.isPlaying())
                {
                    v4.seekTo(v4.getCurrentPosition());
                    v4.start();
                    return false;
                }
                return false;
            }
        });


        //Exercise #5 video
        v5.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v5);
        String path5 = "android.resource://"+getPackageName()+"/"+ R.raw.v5;
        Uri uri5 = Uri.parse(path5);
        v5.setVideoURI(uri5);

        v5.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
//                mediaC1.setAnchorView(v1);
                if(v5.isPlaying())
                {
                    v5.pause();

                    return false;
                }
                else if(!v5.isPlaying())
                {
                    v5.seekTo(v5.getCurrentPosition());
                    v5.start();
                    return false;
                }
                return false;
            }
        });


        //Exercise #6 video
        v6.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v6);
        String path6 = "android.resource://"+getPackageName()+"/"+ R.raw.v6;
        Uri uri6 = Uri.parse(path6);
        v6.setVideoURI(uri6);
        v6.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
//                mediaC1.setAnchorView(v1);
                if(v6.isPlaying())
                {
                    v6.pause();

                    return false;
                }
                else if(!v6.isPlaying())
                {
                    v6.seekTo(v6.getCurrentPosition());
                    v6.start();
                    return false;
                }
                return false;
            }
        });


        //Exercise #7 video
        v7.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.v7);
        String path7 = "android.resource://"+getPackageName()+"/"+ R.raw.v7;
        Uri uri7 = Uri.parse(path7);
        v7.setVideoURI(uri7);
        v7.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
//                mediaC1.setAnchorView(v1);
                if(v7.isPlaying())
                {
                    v7.pause();

                    return false;
                }
                else if(!v7.isPlaying())
                {
                    v7.seekTo(v7.getCurrentPosition());
                    v7.start();
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


}
