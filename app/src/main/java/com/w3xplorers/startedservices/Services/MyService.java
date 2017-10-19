package com.w3xplorers.startedservices.Services;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Avijit on 10/19/2017.
 */

public class MyService extends IntentService {
    static String TAG = MyService.class.getName();
    public  MyService(){
        super(TAG);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"SERVICE STARTED");
    }

    //WILL UNCOMMENT THIS METHOD WHEN WE WILL USE NORMAL SERVICE BECAUSE THIS WILL WORK ON MAIN APPLICATION THREAD

    /*@Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"SERVICE onStartCommand: " + intent.getStringExtra("ServiceId"));
        return super.onStartCommand(intent, flags, startId);
    }*/

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "Service onHandleIntent: "+ intent.getStringExtra("ServiceId"));
    }
}
