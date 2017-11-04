package com.sesayari;

import android.app.AlarmManager;
import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBars[] = new SeekBar[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AudioManager audioManager = InitCurrentVolumes();

        seekBars[0].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onStopTrackingTouch(SeekBar arg0)
            {
            }

            @Override
            public void onStartTrackingTouch(SeekBar arg0)
            {
            }

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2)
            {
                audioManager.setStreamVolume(AudioManager.STREAM_ALARM,
                        progress, 0);
            }
        });
        seekBars[1].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onStopTrackingTouch(SeekBar arg0)
            {
            }

            @Override
            public void onStartTrackingTouch(SeekBar arg0)
            {
            }

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2)
            {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
                        progress, 0);
            }
        });
        seekBars[2].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onStopTrackingTouch(SeekBar arg0)
            {
            }

            @Override
            public void onStartTrackingTouch(SeekBar arg0)
            {
            }

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2)
            {
                audioManager.setStreamVolume(AudioManager.STREAM_VOICE_CALL,
                        progress, 0);
            }
        });
        seekBars[3].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onStopTrackingTouch(SeekBar arg0)
            {
            }

            @Override
            public void onStartTrackingTouch(SeekBar arg0)
            {
            }

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2)
            {
                audioManager.setStreamVolume(AudioManager.STREAM_RING,
                        progress, 0);
            }
        });
        Ayar sesAyari=new Ayar(this);


    }
    @Override
    protected void onResume() {
        super.onResume();
        InitCurrentVolumes();
    }
    protected AudioManager InitCurrentVolumes(){
        final AudioManager audioManager  = (AudioManager) getSystemService(AUDIO_SERVICE);
        seekBars[0] = (SeekBar) findViewById(R.id.seekBar1);
        seekBars[1] = (SeekBar) findViewById(R.id.seekBar2);
        seekBars[2] = (SeekBar) findViewById(R.id.seekBar3);
        seekBars[3] = (SeekBar) findViewById(R.id.seekBar4);
        seekBars[0].setMax(audioManager
                .getStreamMaxVolume(AudioManager.STREAM_ALARM));
        seekBars[0].setProgress(audioManager
                .getStreamVolume(AudioManager.STREAM_ALARM));
        seekBars[1].setMax(audioManager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        seekBars[1].setProgress(audioManager
                .getStreamVolume(AudioManager.STREAM_MUSIC));
        seekBars[2].setMax(audioManager
                .getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL));
        seekBars[2].setProgress(audioManager
                .getStreamVolume(AudioManager.STREAM_VOICE_CALL));
        seekBars[3].setMax(audioManager
                .getStreamMaxVolume(AudioManager.STREAM_RING));
        seekBars[3].setProgress(audioManager
                .getStreamVolume(AudioManager.STREAM_RING));
        return  audioManager;
    }
}
