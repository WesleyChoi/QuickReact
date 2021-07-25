package com.example.quickreact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

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
//        nav_back_to_agility_selector = (Button) findViewById(R.id.nav_back_agility_selector);
//        nav_back_to_agility_selector.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                returnToCompassAgilitySelector();
//            }
//        });
//
//
//        // get total set time from selector screen
//        number_picker_total_time_reader = findViewById(R.id.set_time_picker);
//        number_picker_total_time_reader.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//            @Override
//            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
////                int value_picker_total_time = (number_picker_total_time_reader.getValue() + 1) * 5;
//                int value_picker_total_time = number_picker_total_time_reader.getValue();
//                Log.d("picker value", String.valueOf(value_picker_total_time));
//            }
//        });

        //get prompt frequency from selector screen


    }


    public void returnToCompassAgilitySelector() {
        Intent intent = new Intent(this, CompassAgilitySelector.class);
        startActivity(intent);
    }

}