package com.sesayari;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;

/**
 * Created by ramazan on 11/3/17.
 */



public class Ayar {

    private Context context;

    public enum Tip{alarm,call,ring,media};
    public enum Yon{arti, eksi};

    public Ayar(Context ctx){
        context=ctx;
    }

    public static void degistir(Tip tip, Yon yon){

    }
}
