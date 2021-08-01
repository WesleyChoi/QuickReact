package com.example.quickreact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button nav_launch_to_compass;
    private Button nav_launch_to_reaction_sprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_drill_selector);

        nav_launch_to_compass = (Button) findViewById(R.id.nav_compass);
        nav_launch_to_compass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCompassDrill();
            }
        });


        nav_launch_to_reaction_sprint = (Button) findViewById(R.id.nav_reaction_sprints);
        nav_launch_to_reaction_sprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReactionSprintDrill();
            }
        });
    }

    public void openCompassDrill() {
        Intent intent = new Intent(this, CompassAgilitySelector.class);
        startActivity(intent);
    }

    public void openReactionSprintDrill() {
        Intent intent = new Intent(this, ReactionSprintSelector.class);
        startActivity(intent);
    }

}