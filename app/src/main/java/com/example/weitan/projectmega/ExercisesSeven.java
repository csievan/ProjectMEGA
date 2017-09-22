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

public class ExercisesSeven extends Fragment {
    private static final String TAG = "ExercisesSeven";

    //variable declare
    private VideoView v7;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises_seven,container,false);

        v7 = (VideoView) view.findViewById(R.id.exDemo7);

        String path = "android.resource://" + "com.example.weitan.projectmega" + "/" + R.raw.v7;
        v7.setVideoURI(Uri.parse(path));

        v7.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
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



        return view;
    }
}
