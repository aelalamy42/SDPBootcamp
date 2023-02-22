package com.example.aelalamy.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        Intent intent = getIntent();
        String NAME = intent.getStringExtra("NAME");
        TextView Greeting = findViewById(R.id.greetingMessage);
        Greeting.setText("Hello "+NAME+"!");
    }
}