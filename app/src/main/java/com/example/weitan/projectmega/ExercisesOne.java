package com.example.weitan.projectmega;

import android.support.v4.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

/**
 * Created by weitan on 22/09/2017.
 */

public class ExercisesOne extends Fragment{
    private static final String TAG = "ExercisesOne";

    //variable declare
    private VideoView v1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises_one,container,false);

        v1 = (VideoView) view.findViewById(R.id.exDemo1);
        String path = "android.resource://" + "com.example.weitan.projectmega" + "/" + R.raw.v1;
        v1.setVideoURI(Uri.parse(path));

        /*v1.setVideoPath("android.resource://"++"/"+ R.raw.v1);
        String path = "android.resource://"+getPackageName()+"/"+ R.raw.v1;
        Uri uri = Uri.parse(path);
        v1.setVideoURI(uri);*/


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



        return view;
    }
}

