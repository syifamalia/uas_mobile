package com.uassyifa.destinasiwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int waktu_loading = 2000;
        new Handler().postDelayed(() -> {

            Intent home=new Intent(MainActivity.this, HomeActivity.class);
            startActivity(home);
            finish();

        }, waktu_loading);
    }
}