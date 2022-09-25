package edu.northeastern.numad22fa_parkerhentz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void A(View view) {
        Toast.makeText(this, "Pressed: A", Toast.LENGTH_SHORT).show();
    }

    public void B(View view) {
        Toast.makeText(this, "Pressed: B", Toast.LENGTH_SHORT).show();
    }

    public void C(View view) {
        Toast.makeText(this, "Pressed: C", Toast.LENGTH_SHORT).show();
    }

    public void D(View view) {
        Toast.makeText(this, "Pressed: D", Toast.LENGTH_SHORT).show();
    }


    public void E(View view) {
        Toast.makeText(this, "Pressed: E", Toast.LENGTH_SHORT).show();
    }

    public void F(View view) {
        Toast.makeText(this, "Pressed: F", Toast.LENGTH_SHORT).show();
    }
}