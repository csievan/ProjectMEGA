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

public class ExercisesFive extends Fragment {
    private static final String TAG = "ExercisesFive";

    //variable declare
    private VideoView v5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises_five,container,false);

        v5 = (VideoView) view.findViewById(R.id.exDemo5);

        String path = "android.resource://" + "com.example.weitan.projectmega" + "/" + R.raw.v5;
        v5.setVideoURI(Uri.parse(path));

        v5.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
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



        return view;
    }
}
