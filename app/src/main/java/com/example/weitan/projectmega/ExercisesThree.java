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

public class ExercisesThree extends Fragment {
    private static final String TAG = "ExercisesThree";

    //variable declare
    private VideoView v3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises_three,container,false);

        v3 = (VideoView) view.findViewById(R.id.exDemo3);

        String path = "android.resource://" + "com.example.weitan.projectmega" + "/" + R.raw.v3;
        v3.setVideoURI(Uri.parse(path));

        v3.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
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



        return view;
    }
}
