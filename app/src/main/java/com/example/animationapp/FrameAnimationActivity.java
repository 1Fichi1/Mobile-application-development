package com.example.animationapp;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameAnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        // Настройка ImageView для фреймовой анимации
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.animation_list);

        final AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();

        // Запуск анимации после того, как ImageView будет полностью отображен
        imageView.post(new Runnable() {
            @Override
            public void run() {
                animationDrawable.start(); // Запуск анимации
            }
        });
    }
}
