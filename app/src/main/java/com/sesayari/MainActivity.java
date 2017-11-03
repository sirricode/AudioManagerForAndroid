package com.sesayari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar volumeSeekbar1 = (SeekBar)findViewById(R.id.seekBar2);

        Ayar sesAyari=new Ayar(this);

        sesAyari.degistir(Ayar.Tip.alarm,Ayar.Yon.arti);


    }
}
