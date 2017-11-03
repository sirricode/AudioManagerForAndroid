package com.sesayari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar volumeSeekbar1 = (SeekBar)findViewById(R.id.seekBar1);
        SeekBar volumeSeekbar2 = (SeekBar)findViewById(R.id.seekBar1);
        SeekBar volumeSeekbar3 = (SeekBar)findViewById(R.id.seekBar1);
        SeekBar volumeSeekbar4 = (SeekBar)findViewById(R.id.seekBar1);
    }
}
