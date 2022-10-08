package edu.northeastern.numad22fa_parkerhentz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class clickyclicky extends AppCompatActivity {

    TextView OurTextA;
    TextView OurTextB;
    TextView OurTextC;
    TextView OurTextD;
    TextView OurTextE;
    TextView OurTextF;

    Button TheButton;
    Button TheButtonB;
    Button TheButtonC;
    Button TheButtonD;
    Button TheButtonE;
    Button TheButtonF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("clicky clicky");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        OurTextA = findViewById(R.id.textView);
        OurTextB = findViewById(R.id.textView);
        OurTextC = findViewById(R.id.textView);
        OurTextD = findViewById(R.id.textView);
        OurTextE = findViewById(R.id.textView);
        OurTextF = findViewById(R.id.textView);

        TheButton = findViewById(R.id.buttonA);
        TheButtonB =  findViewById(R.id.buttonB);

        TheButtonC =  findViewById(R.id.buttonC);
        TheButtonD =  findViewById(R.id.buttonD);
        TheButtonE =  findViewById(R.id.buttonE);
        TheButtonF =  findViewById(R.id.buttonF);

        TheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                OurTextA.setText("Pressed : A");

            }
        });



        TheButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked

                OurTextB.setText("Pressed : B");
            }
        });

        TheButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked

                OurTextC.setText("Pressed : C");
            }
        });

        TheButtonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked

                OurTextD.setText("Pressed : D");
            }
        });


        TheButtonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked

                OurTextE.setText("Pressed : E");
            }
        });

        TheButtonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked

                OurTextF.setText("Pressed : F");
            }
        });






    }
}

//    public void A(View view) {
//        Toast.makeText(this, "Pressed: A", Toast.LENGTH_SHORT).show();
//    }
//
//    public void B(View view) {
//        Toast.makeText(this, "Pressed: B", Toast.LENGTH_SHORT).show();
//    }
//
//    public void C(View view) {
//        Toast.makeText(this, "Pressed: C", Toast.LENGTH_SHORT).show();
//    }
//
//    public void D(View view) {
//        Toast.makeText(this, "Pressed: D", Toast.LENGTH_SHORT).show();
//    }
//
//
//    public void E(View view) {
//        Toast.makeText(this, "Pressed: E", Toast.LENGTH_SHORT).show();
//    }
//
//    public void F(View view) {
//        Toast.makeText(this, "Pressed: F", Toast.LENGTH_SHORT).show();
//    }
