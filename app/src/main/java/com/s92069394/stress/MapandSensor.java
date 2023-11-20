package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapandSensor extends AppCompatActivity {

    Button mapbutton;
    Button buttonsensor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapandsensor);
        mapbutton=findViewById(R.id.buttonmap);
        buttonsensor=findViewById(R.id.buttonsensor);

        mapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MapandSensor.this, MapActivity.class));
            }
        });
        buttonsensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MapandSensor.this, SensorActivity.class));
            }
        });
    }
}