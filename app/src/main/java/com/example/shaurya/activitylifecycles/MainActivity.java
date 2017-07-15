package com.example.shaurya.activitylifecycles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Created","App buid");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Start:","app started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Stoped:","Program stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Destroyed","App destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Paused:","App paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Resumed","App resumted");
    }
}
