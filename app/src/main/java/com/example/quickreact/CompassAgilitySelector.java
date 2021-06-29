package com.example.quickreact;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class CompassAgilitySelector extends AppCompatActivity {

    private Button nav_back_to_main;
    private Button nav_compass_to_execute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compass_agility_selector);


        // NAV: return to MainActivity (drill selector)
        nav_back_to_main = (Button) findViewById(R.id.nav_back_main);
        nav_back_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToDrillSelector();
            }
        });


        // NAV: opens CompassAgilityExecute
        nav_compass_to_execute = (Button) findViewById(R.id.nav_compass_start_execute);
        nav_compass_to_execute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExecuteCompassDrill();
            }
        });

    }

    // executes intent instantiation
    public void returnToDrillSelector() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // passes to compass agility screen
    public void ExecuteCompassDrill() {
        Intent intent = new Intent(this, CompassAgilityExecute.class);
        startActivity(intent);
    }


}