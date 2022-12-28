package com.example.jobseekernew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN=4000;  // 4 sec



    //     handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // call

//        new Handler()..postDelayed(); // object created in short form

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                Intent intent = new Intent(MainActivity.this,IntroSlider.class);
//                startActivity(intent);
                startActivity(new Intent(MainActivity.this,IntroSlider.class));
                finish();// short form
            }
        },SPLASH_SCREEN);


    }
}