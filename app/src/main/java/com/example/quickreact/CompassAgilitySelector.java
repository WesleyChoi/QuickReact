package com.example.quickreact;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class CompassAgilitySelector extends AppCompatActivity {

    private Button nav_back_to_main;
    private Button nav_compass_to_execute;

    private String[] number_picker_vals;

    public NumberPicker number_picker_total_time;
    public NumberPicker number_picker_prompt_frequency;

    public static int int_total_time;

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

        // set min and max values for number_picker
        number_picker_total_time = findViewById(R.id.set_time_picker);
        number_picker_total_time.setMinValue(0);
        number_picker_total_time.setMaxValue(13);
        number_picker_vals = new String[] {"10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75"};
        number_picker_total_time.setDisplayedValues(number_picker_vals);

        // get total set time from selector screen
        number_picker_total_time.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldVal, int newVal) {
//                int value_picker_total_time = (number_picker_total_time_reader.getValue() + 1) * 5;
//                int value_picker_total_time = number_picker_total_time_reader.getValue();
//                Log.d("picker value", String.valueOf(value_picker_total_time));
                int_total_time = newVal;

            }
        });


        // set min and max values for prompt_frequency
        number_picker_prompt_frequency = findViewById(R.id.prompt_frequency_picker);
        number_picker_prompt_frequency.setMinValue(1);
        number_picker_prompt_frequency.setMaxValue(15);
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