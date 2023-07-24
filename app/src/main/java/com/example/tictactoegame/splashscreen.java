package com.example.tictactoegame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class splashscreen extends AppCompatActivity {

    TextView apppname;
    LottieAnimationView lottie;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        apppname=findViewById(R.id.apppname);
        lottie = findViewById(R.id.lottie);

        apppname.animate().translationY(0).setDuration(2000).setStartDelay(0);
        lottie.animate().translationX(2000).setDuration(3000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        },4000);
    }
}