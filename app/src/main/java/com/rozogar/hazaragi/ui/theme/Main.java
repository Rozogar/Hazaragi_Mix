package com.rozogar.hazaragi.ui.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class Main extends AppCompatActivity {
private Button btnsongs;
private Button btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        btnsongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }

    private void setupView() {
        btnexit = findViewById(R.id.btnexit);
        btnsongs = findViewById(R.id.btnsongs);

    }
}