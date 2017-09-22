package com.example.weitan.projectmega;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

/**
 * Created by weitan on 22/09/2017.
 */

public class ExercisesTwo extends Fragment{
    private static final String TAG = "ExercisesTwo";

    //variable declare
    private VideoView v2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises_two,container,false);

        v2 = (VideoView) view.findViewById(R.id.exDemo2);

        String path = "android.resource://" + "com.example.weitan.projectmega" + "/" + R.raw.v2;
        v2.setVideoURI(Uri.parse(path));

        v2.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
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


        return view;
    }
}
