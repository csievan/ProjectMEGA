package com.example.weitan.projectmega.activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.weitan.projectmega.R;

import java.net.URL;

public class video_demo extends AppCompatActivity {

    VideoView v1;
    VideoView v2;
    VideoView v3;
    VideoView v4;
    VideoView v5;
    VideoView v6;
    VideoView v7;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_demo);
        v1 = (VideoView) findViewById(R.id.exDemo1);
        v2 = (VideoView) findViewById(R.id.exDemo2);
        v3 = (VideoView) findViewById(R.id.exDemo3);
        v4 = (VideoView) findViewById(R.id.exDemo4);
        v5 = (VideoView) findViewById(R.id.exDemo5);
        v6 = (VideoView) findViewById(R.id.exDemo6);
        v7 = (VideoView) findViewById(R.id.exDemo7);

        mediaC = new MediaController(this);
    }

    public void videoplay1(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v1;
        Uri uri = Uri.parse(path);
        v1.setVideoURI(uri);
        v1.setMediaController(mediaC);
        mediaC.setAnchorView(v1);

        v1.start();
    }

    public void videoplay2(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v2;
        Uri uri = Uri.parse(path);
        v2.setVideoURI(uri);
        v2.setMediaController(mediaC);
        mediaC.setAnchorView(v2);
        v2.start();
    }

    public void videoplay3(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v3;
        Uri uri = Uri.parse(path);
        v3.setVideoURI(uri);
        v3.setMediaController(mediaC);
        mediaC.setAnchorView(v3);
        v3.start();
    }

    public void videoplay4(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v4;
        Uri uri = Uri.parse(path);
        v4.setVideoURI(uri);
        v4.setMediaController(mediaC);
        mediaC.setAnchorView(v4);
        v4.start();
    }

    public void videoplay5(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v5;
        Uri uri = Uri.parse(path);
        v5.setVideoURI(uri);
        v5.setMediaController(mediaC);
        mediaC.setAnchorView(v5);
        v5.start();
    }

    public void videoplay6(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v6;
        Uri uri = Uri.parse(path);
        v6.setVideoURI(uri);
        v6.setMediaController(mediaC);
        mediaC.setAnchorView(v6);
        v6.start();
    }

    public void videoplay7(View v){
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v7;
        Uri uri = Uri.parse(path);
        v7.setVideoURI(uri);
        v7.setMediaController(mediaC);
        mediaC.setAnchorView(v7);
        v7.start();
    }
}
