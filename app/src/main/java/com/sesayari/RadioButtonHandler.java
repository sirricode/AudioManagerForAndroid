package com.sesayari;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by win7 on 07.11.2017.
 */

public class RadioButtonHandler extends AppCompatActivity {
    public TextView tV3;
    public RadioGroup rb;
    public int day = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tV3 = (TextView) findViewById(R.id.tv4);
        rb = (RadioGroup) findViewById(R.id.radioGroup);
        rb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                if (checkedId == R.id.radioButton) {
                    day = 1;
                    tV3.setText("" + day);
                } else if (checkedId == R.id.radioButton2) {
                    day = 2;
                    tV3.setText("" + day);
                } else if (checkedId == R.id.radioButton3) {
                    day = 3;
                    tV3.setText("" + day);
                } else if (checkedId == R.id.radioButton4) {
                    day = 4;
                    tV3.setText("" + day);
                } else if (checkedId == R.id.radioButton5) {
                    day = 5;
                    tV3.setText("" + day);
                } else if (checkedId == R.id.radioButton6) {
                    day = 1;
                    tV3.setText("" + day);
                } else if (checkedId == R.id.radioButton7) {
                    day = 1;
                    tV3.setText("" + day);
                }
            }
        });
    }
}
