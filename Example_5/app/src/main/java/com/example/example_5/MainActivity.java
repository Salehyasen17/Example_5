package com.example.example_5;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageButton nextButton, prevButton;


    private int[] images = {
            R.drawable.hf,
            R.drawable.hf2,
            R.drawable.hf3,
            R.drawable.hf4,
            R.drawable.hf5,
    };

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        nextButton = findViewById(R.id.nextButton);
        prevButton = findViewById(R.id.prevButton);


        nextButton.setOnClickListener(v -> {
            currentIndex = (currentIndex + 1) % images.length;
            imageView.setImageResource(images[currentIndex]);
        });


        prevButton.setOnClickListener(v -> {
            currentIndex = (currentIndex - 1 + images.length) % images.length;
            imageView.setImageResource(images[currentIndex]);

  });

}}