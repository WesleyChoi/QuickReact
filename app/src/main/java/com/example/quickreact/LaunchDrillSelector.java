//package com.example.quickreact;
//
//import android.content.Intent;
//import android.os.Bundle;
//
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//import android.view.View;
//import android.widget.Button;
//
//public class LaunchDrillSelector {
//
//
//    private Button nav_launch_to_compass;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_launch_drill_selector);
//
//        nav_launch_to_compass = (Button) findViewById(R.id.nav_compass);
//        nav_launch_to_compass.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openCompassDrill();
//            }
//        });
//    }
//
//    public void openCompassDrill() {
//        Intent intent = new Intent(this, CompassAgilitySelector.class);
//        startActivity(intent);
//    }
//
//
//
//}