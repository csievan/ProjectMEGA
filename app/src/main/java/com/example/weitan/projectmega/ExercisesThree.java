package com.example.weitan.projectmega;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

/**
 * Created by weitan on 22/09/2017.
 */

public class ExercisesThree extends Fragment {
    private static final String TAG = "ExercisesOne";

    //variable declare
    private VideoView v1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises_one,container,false);

        v1 = (VideoView) view.findViewById(R.id.exDemo1);



        return view;
    }
}
