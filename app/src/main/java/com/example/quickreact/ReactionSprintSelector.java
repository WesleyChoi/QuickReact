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


public class ReactionSprintSelector extends AppCompatActivity {

    private Button nav_back_to_main;
    private Button initialize_reaction_sprint_execute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reaction_sprint_selector);

        // NAV: return to MainActivity (drill selector)
        nav_back_to_main = (Button) findViewById(R.id.nav_back_main);
        nav_back_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToDrillSelector();
            }
        });


        // start reaction sprint
        initialize_reaction_sprint_execute = (Button) findViewById(R.id.nav_compass_start_execute);
        initialize_reaction_sprint_execute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startReactionSprintDrill();
            }
        });

    }


    // executes intent instantiation
    public void returnToDrillSelector() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startReactionSprintDrill() {
        Intent intent = new Intent(this, ReactionSprintExecute.class);
        startActivity(intent);
    }

}