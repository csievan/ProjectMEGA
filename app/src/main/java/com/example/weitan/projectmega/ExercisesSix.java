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

public class ExercisesSix extends Fragment {
    private static final String TAG = "ExercisesSix";

    //variable declare
    private VideoView v6;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises_six,container,false);

        v6 = (VideoView) view.findViewById(R.id.exDemo6);

        String path = "android.resource://" + "com.example.weitan.projectmega" + "/" + R.raw.v6;
        v6.setVideoURI(Uri.parse(path));

        v6.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
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



        return view;
    }
}
