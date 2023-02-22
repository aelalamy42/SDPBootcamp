package com.example.aelalamy.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        EditText nametext = findViewById(R.id.MainName);
        intent.putExtra("NAME", nametext.getText().toString());
        this.startActivity(intent);
    }
}