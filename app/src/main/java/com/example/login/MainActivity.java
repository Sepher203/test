package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create a delay of 2 seconds (2000 milliseconds)
        int delayMillis = 5000;
        // Create an Intent
        final Intent intent = new Intent(this, Login.class);
        // Use a Handler to post the Intent with a delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        }, delayMillis);
    }
}