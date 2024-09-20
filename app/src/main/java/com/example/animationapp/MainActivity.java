package com.example.animationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFrameAnimation = findViewById(R.id.btnFrameAnimation);

        // Переход на FrameAnimationActivity при нажатии кнопки
        btnFrameAnimation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
            startActivity(intent);
        });
    }
}
