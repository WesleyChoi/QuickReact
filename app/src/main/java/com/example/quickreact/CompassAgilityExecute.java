package com.example.quickreact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.media.MediaPlayer;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CompassAgilityExecute extends AppCompatActivity {

    private Button nav_back_to_agility_selector;

    private NumberPicker number_picker_total_time_reader;
    private NumberPicker number_picker_prompt_frequency_reader;

    private int int_total_time;
    private int int_prompt_frequency;



    private MediaPlayer play_up = new MediaPlayer();
    private MediaPlayer play_down = new MediaPlayer();
    private MediaPlayer play_left = new MediaPlayer();
    private MediaPlayer play_right = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compass_agility_execute);

        // NAV: return to MainActivity (drill selector)
        nav_back_to_agility_selector = findViewById(R.id.nav_back_agility_selector);
        nav_back_to_agility_selector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToCompassAgilitySelector();
            }
        });

        // retrieve value obtained from total set time from selector screen
        TextView test_display_int = findViewById(R.id.total_time_display_indicator);
        int_total_time = (CompassAgilitySelector.int_total_time * 5) + 10;
        test_display_int.setText("" + int_total_time);


        //retrieve prompt frequency from selector screen
        TextView test_display_frequency = findViewById(R.id.frequency_display_indicator);
        int_prompt_frequency = CompassAgilitySelector.frequency_time + 1;
        test_display_frequency.setText("" + int_prompt_frequency);

        // set data source locations for each audio asset
        try {
            play_up.setDataSource("/app/src/main/assets/up.mp3");
            play_down.setDataSource("/app/src/main/assets/down.mp3");
            play_left.setDataSource("/app/src/main/assets/left.mp3");
            play_right.setDataSource("/app/src/main/assets/right.mp3");

            play_up.prepare();
            play_down.prepare();
            play_left.prepare();
            play_right.prepare();

//            play_up.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        executeCompassDrill();


    }


    public void returnToCompassAgilitySelector() {
        Intent intent = new Intent(this, CompassAgilitySelector.class);
        startActivity(intent);
    }

/*
    public void executeCompassDrill() {

        int curr_time = 0;

        while (curr_time < int_total_time) {
            // pick number to play

            Random random_selector = new Random();
            int select_random_int = random_selector.nextInt(4);

            // play corresponding sound based on number selected
            if (select_random_int == 0) {
                // play up
                play_up.start();
            } else if (select_random_int == 1) {
                // play down
                play_down.start();
            } else if (select_random_int == 2) {
                // play left
                play_left.start();
            } else {
                // play right
                play_right.start();
            }


            // increment curr_time by factor of int_prompt_frequency
            curr_time += int_prompt_frequency;

            // wait until next cycle is ready
            try {
//                TimeUnit.SECONDS.sleep(int_prompt_frequency);
                Thread.sleep(int_prompt_frequency * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
*/




}