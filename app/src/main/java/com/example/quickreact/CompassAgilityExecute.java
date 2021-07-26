package com.example.quickreact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class CompassAgilityExecute extends AppCompatActivity {

    private Button nav_back_to_agility_selector;

    private NumberPicker number_picker_total_time_reader;
    private NumberPicker number_picker_prompt_frequency_reader;

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

        // retrieve value obtained from total set time from selector screen
        TextView test_display_int = findViewById(R.id.total_time_display_indicator);
        int convert_int_total_time = (CompassAgilitySelector.int_total_time * 5) + 10;
        test_display_int.setText("" + String.valueOf(convert_int_total_time));


        //retrieve prompt frequency from selector screen
        TextView test_display_frequency = findViewById(R.id.frequency_display_indicator);
        int convert_frequency_time = CompassAgilitySelector.frequency_time + 1;
        test_display_frequency.setText("" + String.valueOf(convert_frequency_time));




    }


    public void returnToCompassAgilitySelector() {
        Intent intent = new Intent(this, CompassAgilitySelector.class);
        startActivity(intent);
    }

}