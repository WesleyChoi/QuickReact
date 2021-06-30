package com.example.quickreact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class CompassAgilityExecute extends AppCompatActivity {

    private Button nav_back_to_agility_selector;
    private int int_total_time;
    private int int_prompt_frequency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compass_agility_execute);

        // NAV: return to MainActivity (drill selector)
        nav_back_to_agility_selector = (Button) findViewById(R.id.nav_back_agility_selector);
        nav_back_to_agility_selector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToCompassAgilitySelector();
            }
        });


        // get total set time from selector screen

//        NumberPicker.OnValueChangeListener() {
//            public void onValueChange() {
//
//            }
//        }

        //get prompt frequency from selector screen


    }


    public void returnToCompassAgilitySelector() {
        Intent intent = new Intent(this, CompassAgilitySelector.class);
        startActivity(intent);
    }

}