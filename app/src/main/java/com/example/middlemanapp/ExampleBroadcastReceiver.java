package com.example.middlemanapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExampleBroadcastReceiver extends BroadcastReceiver {

    static String userName;

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("Emitter.Sender".equals(intent.getAction())) {
            userName = intent.getStringExtra("userName");
            System.out.println("kk = "+userName);

            Toast.makeText(context, "MiddleMan Received : "+userName , Toast.LENGTH_LONG).show();


        }
    }


}