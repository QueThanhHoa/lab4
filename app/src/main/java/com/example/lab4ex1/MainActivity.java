package com.example.lab4ex1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button food_order_btn;
    private Button drink_order_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the buttons by their IDs
        food_order_btn = findViewById(R.id.food_order_btn);
        drink_order_btn = findViewById(R.id.drink_order_btn);

        // Set an OnClickListener for the first button to go to the FirstPageActivity
        food_order_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Food_Main_Activity.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the second button to go to the SecondPageActivity
        drink_order_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Drink_Main_Activity.class);
                startActivity(intent);
            }
        });
    }
}