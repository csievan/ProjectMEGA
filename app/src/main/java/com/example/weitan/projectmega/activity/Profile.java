package com.example.weitan.projectmega.activity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.weitan.projectmega.R;

import java.util.Calendar;

public class Profile extends AppCompatActivity {

    private static final String TAG = "Profile";

    // Date Picker variables
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    // Number Picker variables
    NumberPicker npHeight = null;
    NumberPicker npWeight = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Number Pickers
        npHeight = (NumberPicker) findViewById(R.id.np_height);
        npHeight.setMaxValue(210);
        npHeight.setMinValue(120);
        npHeight.setValue(165);
        npHeight.setWrapSelectorWheel(false);

        npWeight = (NumberPicker) findViewById(R.id.np_weight);
        npWeight.setMaxValue(200);
        npWeight.setMinValue(40);
        npWeight.setValue(70);
        npWeight.setWrapSelectorWheel(false);

        mDisplayDate = (TextView) findViewById(R.id.tv_birthday);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();



                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Profile.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                // Months range from 0-11
                month = month + 1;

                Log.d(TAG, "onDateSet: mm/dd/yyyy: " + day + "/" + month + "/" + year);

                String date = day + "/" + month + "/" + year;
                mDisplayDate.setText(date);
            }
        };

    }

}
