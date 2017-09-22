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

public class ExercisesFour extends Fragment {
    private static final String TAG = "ExercisesFour";

    //variable declare
    private VideoView v4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises_four,container,false);

        v4 = (VideoView) view.findViewById(R.id.exDemo4);

        String path = "android.resource://" + "com.example.weitan.projectmega" + "/" + R.raw.v4;
        v4.setVideoURI(Uri.parse(path));

        v4.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent)
            {
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



        return view;
    }
}
