package com.example.foodtime;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Start home activity
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        // close splash activity
        finish();
    }
}