package edu.northeastern.numad22fa_parkerhentz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button click_button;
    Button aboutme;
    Button linkCollector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_button = findViewById(R.id.Button_suite);
        click_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
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


        linkCollector = findViewById(R.id.linkCollector);
        linkCollector.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, linkCollector.class);
                startActivity(intent);
                finish();
            }
        });

    }


}