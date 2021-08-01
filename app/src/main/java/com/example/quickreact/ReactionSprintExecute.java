package com.example.quickreact;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.Random;


public class ReactionSprintExecute extends AppCompatActivity {

    private Button nav_back_to_main;

    private MediaPlayer play_go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reaction_sprint_execute);

        // NAV: return to MainActivity (drill selector)
        nav_back_to_main = (Button) findViewById(R.id.nav_back_main);
        nav_back_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToDrillSelector();
            }
        });

        // initialize media player
        initializeMediaPlayer();

        // play go sound
        playGoSound();
    }


    // executes intent instantiation
    public void returnToDrillSelector() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // initialize go sound
    public void initializeMediaPlayer() {

        // create new MediaPlayer with file location
        play_go = MediaPlayer.create(this, R.raw.go);

    }

    // play go sound
    public void playGoSound() {

        Random random_selector = new Random();
        int select_random_int = random_selector.nextInt(6) + 2;

        // initial wait time until drill starts
        CountDownTimer wait_timer = new CountDownTimer(select_random_int * 1000, 1000) {

            public void onTick(long msUntilFinished) {}

            public void onFinish() {
                play_go.start();
            }

        };
        wait_timer.start();

    }

}