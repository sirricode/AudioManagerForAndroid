package com.sesayari;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by win7 on 05.11.2017.
 */

public class CustomDialogClass extends Dialog {

    public Activity c;
    public Dialog d;
    public int day;

    public CustomDialogClass(Activity a) {
        super(a);
        this.c = a;
        d = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        final RadioGroup rbGroup=(RadioGroup)findViewById(R.id.radioGroup);

        EditText fromHour = findViewById(R.id.fromHour);
        EditText fromMinute = findViewById(R.id.fromMinute);
        EditText toHour = findViewById(R.id.toHour);
        EditText toMinute = findViewById(R.id.toMinute);

        Button SaveButton=(Button)findViewById(R.id.btn_save);
        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int seciliRadio=rbGroup.getCheckedRadioButtonId();
                Log.d("asd", "onClick: "+seciliRadio);
                 switch (seciliRadio){
                     case R.id.radioButton:
                         day = 1;
                         Log.d("asd", "onClick: "+1);
                         break;
                     case R.id.radioButton2:
                         day = 2;
                         Log.d("asd", "onClick: "+2);
                         break;
                     case R.id.radioButton3:
                         day = 3;
                         Log.d("asd", "onClick: "+3);
                         break;
                     case R.id.radioButton4:
                         day = 4;
                         Log.d("asd", "onClick: "+4);
                         break;
                     case R.id.radioButton5:
                         day = 5;
                         Log.d("asd", "onClick: "+5);
                         break;
                     case R.id.radioButton6:
                         day = 6;
                         Log.d("asd", "onClick: "+6);
                         break;
                     case R.id.radioButton7:
                         day = 7;
                         Log.d("asd", "onClick: "+7);
                         break;
                 }

            }
        });

        Button cancelButton = findViewById(R.id.btn_cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.dismiss();
            }
        });
    }


}