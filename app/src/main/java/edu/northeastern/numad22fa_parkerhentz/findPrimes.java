package edu.northeastern.numad22fa_parkerhentz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class findPrimes extends AppCompatActivity {
    private final Handler textHandler = new Handler(); // just a reg handler
    TextView statusText; // here is where it wil update the text
    Button button_starter;
    Button button_ender;
    int valueCheck = 3;
    int valuePast = valueCheck;


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity")
                .setMessage("Are you sure you want to close this activity?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_primes);
        statusText = findViewById(R.id.statusText);
        button_ender =findViewById(R.id.button2endSearch);
        button_starter = findViewById(R.id.button_start);

        button_starter.setOnClickListener(new View.OnClickListener() {
            // Cant be here cant be placed inside the clas
            // DifferentThread differentThread = new DifferentThread();
            // differentThread.start();
            @Override
            public void onClick(View view) {
                DifferentThread differentThread = new DifferentThread();
                differentThread.start();
                // value2 = here we need
                statusText.setText("Current prime check: "+ valueCheck);
            }
        });

        button_ender.setOnClickListener(new View.OnClickListener() {
            // Cant be here cant be placed inside the clas
            // DifferentThread differentThread = new DifferentThread();
            // differentThread.start();
            @Override
            public void onClick(View view) {
                DifferentThread differentThread = new DifferentThread();
                differentThread.interrupt();
                // value2 = here we need
                statusText.setText("ended process: "+ valueCheck);
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
                System.out.print(i + "here");

                //statusText.setText("checking Current Prime " + i);
                try {
                    Thread.sleep(1);
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

    static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            //System.out.println(n + " is not prime number");
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    return false;
                    //System.out.println(n + " is not prime number");
                }
            }
            //System.out.println(n + " is prime number");
            return flag == 0;

        }
    }
}
