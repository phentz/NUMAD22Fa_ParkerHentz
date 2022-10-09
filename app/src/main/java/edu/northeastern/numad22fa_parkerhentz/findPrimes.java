package edu.northeastern.numad22fa_parkerhentz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class findPrimes extends AppCompatActivity {
    private Handler textHandler = new Handler(); // just a reg handler
    TextView statusText;
    Button button_starter;
    int valueCheck = 3;
    int valuePast = valueCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_primes);
        statusText = findViewById(R.id.textView);

        button_starter = findViewById(R.id.button_start);


        button_starter.setOnClickListener(new View.OnClickListener() {
            // Cant be here cant be placed inside the clas
            // DifferentThread differentThread = new DifferentThread();
            // differentThread.start();

            @Override
            public void onClick(View view) {
                statusText.setText("Current prime check" + statusText);
                DifferentThread differentThread = new DifferentThread();
                differentThread.start();
            }
        });
    }


    //Method which runs on a different thread which uses Thread class.
    public void runOnDifferentThread(View view) {
        DifferentThread differentThread = new DifferentThread();
        differentThread.start();
    }


    //Class which extends the Thread class.
    class DifferentThread extends Thread {
        @Override
        public void run() {
            for (int i = valueCheck; i <= 1000; i = i + 2) {
                checkPrime(i);
                statusText.setText("checking Current Prime " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
            //final int finalI = i;
            //The handler changes the TextView running in the UI thread.
//            textHandler.post(new Runnable() {
//                @SuppressLint("SetTextI18n")
//                @Override
//                public void run() {
//                    statusText.setText("Running on a new Thread (Thread class): " + i);
//                    if (finalI == 10) {
//                        statusText.setText("");
//                    }
//                }
//            });
            //Log.d(TAG, "Running on a different thread using Thread class: " + i);

        }
    }


    static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }

        }
    }
}
