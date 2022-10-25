package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startButton,stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton=findViewById(R.id.button_start);
        stopButton=findViewById(R.id.button_stop);
        startButton.setOnClickListener(view -> {
            startService(new Intent(this,LocationService.class));
        });
        stopButton.setOnClickListener(view -> {
            stopService(new Intent(this,LocationService.class));
        });
    }
}