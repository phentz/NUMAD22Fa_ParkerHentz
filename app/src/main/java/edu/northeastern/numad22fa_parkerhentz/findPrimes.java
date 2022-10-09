package edu.northeastern.numad22fa_parkerhentz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;






public class findPrimes extends AppCompatActivity {

    TextView outputPrime;
    Button button_starter;
    int valueCheck = 3;
    int valuePast = valueCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_primes);


        button_starter = findViewById(R.id.textView);


        button_starter.setOnClickListener(new View.OnClickListener() {


            differentThread differentThread = new differentThread();
            differentThread.start();
            @Override
            public void onClick(View view) {

                outputPrime.setText("Current prime check" + outputPrime);

            }

        });


    }

    class differentThread extends Thread {
        @Override
        public void run() {
            for (int i = 3; i < 2000; i++) {
                i++;
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }

    static void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }

        }








