package com.w3xplorers.startedservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.w3xplorers.startedservices.Services.MyService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent one = new Intent(this, MyService.class);
        one.putExtra("ServiceId","101");
        startService(one);

        Intent two = new Intent(this,MyService.class);
        two.putExtra("ServiceId","102");
        startService(two);

        Intent three = new Intent(this,MyService.class);
        three.putExtra("ServiceId","103");
        startService(three);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(this,MyService.class));
    }
}
