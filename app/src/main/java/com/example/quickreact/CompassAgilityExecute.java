package com.example.quickreact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompassAgilityExecute extends AppCompatActivity {

    private Button nav_back_to_agility_selector;

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


    }


    public void returnToCompassAgilitySelector() {
        Intent intent = new Intent(this, CompassAgilitySelector.class);
        startActivity(intent);
    }

}