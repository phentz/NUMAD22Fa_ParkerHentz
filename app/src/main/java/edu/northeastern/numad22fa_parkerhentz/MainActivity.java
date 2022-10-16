package edu.northeastern.numad22fa_parkerhentz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button click_button;
    Button aboutme;
    Button linkCollectorButton;
    Button findPrimesButton;
    Button locationActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkCollectorButton = new Button(this);
        click_button = findViewById(R.id.Button_suite);
        linkCollectorButton = findViewById(R.id.linkCollector);
        findPrimesButton = findViewById(R.id.findPrimes);
        locationActivityButton = findViewById(R.id.Location_button);

        click_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, clickyclicky.class);
                startActivity(intent);
                finish();
            }
        });


        aboutme = findViewById(R.id.aboutme);
        aboutme.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, aboutmepage.class);
                startActivity(intent2);
                finish();
            }
        });

        linkCollectorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LinkCollector.class);
                view.getContext().startActivity(intent);
            }
        });


        findPrimesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), findPrimes.class);
                view.getContext().startActivity(intent);
            }
        });


        locationActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), location_activity.class);
                view.getContext().startActivity(intent);
            }
        });
    }


}