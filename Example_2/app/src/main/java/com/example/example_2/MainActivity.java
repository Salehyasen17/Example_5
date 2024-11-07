package com.example.example_2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView tvMode, tvTemp;
    private boolean isOn = true;
    private  int mode = 1;
    private int temp = 24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMode = findViewById(R.id.tvMode);
        tvTemp = findViewById(R.id.tvTemp);
    }

    public void checkStatus(View view){
        isOn =! isOn;
    }

    public void checkMode(View view) {
        if(isOn) {
            if (mode == 1) {
                mode = 2;
                tvMode.setText("Heat");
            } else {
                mode = 1;
                tvMode.setText("Cool");
            }
        }
    }

    public void Minus(View view){
        if(isOn ) {
            if (temp > 16) {
                temp--;
                tvTemp.setText(String.valueOf(temp));
            } else
                Toast.makeText(this, "The lowest degree is 16", Toast.LENGTH_LONG).show();
        }
    }

    public void Plus(View view){
        if(isOn) {
            if (temp < 30) {
                temp++;
                tvTemp.setText(String.valueOf(temp));
            } else
                Toast.makeText(this, "The highest degree is 30", Toast.LENGTH_LONG).show();
        }
    }
}