package com.example.mdflow_recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {
    MediaPlayer openingSound = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openingSound = MediaPlayer.create(this, R.raw.chance_the_rapper);
        openingSound.start();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                openingSound.stop();
                finish();
                startActivity(new Intent(splash.this, ItemListActivity.class));
            }
        };

        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}