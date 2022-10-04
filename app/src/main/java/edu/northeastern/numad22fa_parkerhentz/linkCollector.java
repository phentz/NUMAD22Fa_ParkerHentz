package edu.northeastern.numad22fa_parkerhentz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class linkCollector extends AppCompatActivity {


    RecyclerView recyclerView;
    List<String> sites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_link_collector);
        getSupportActionBar().setTitle("Link collector");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView=findViewById(R.id.RecyclerView);


        sites=new ArrayList<>();
        sites.add("andriod");
        sites.add("java");
        sites.add("PHP");
        sites.add("andriod forrrrn");
        sites.add("C++");
        sites.add("C++PPPfpefe");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdaptor customAdaptor =new CustomAdaptor((ArrayList<String>) sites, linkCollector.this);
        // this is where it is not working
        //recyclerView,setContentView(customAdaptor);
        final TextView simpleTextView = (TextView) findViewById(R.id.simpleTextView); //get the id for TextView
        Button changeText = (Button) findViewById(R.id.btnChangeText); //get the id for button
        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleTextView.setText("After Clicking"); //set the text after clicking button
            }
        });
    }

    @Nullable
    @Override
    public ActionBar getSupportActionBar() {
        return super.getSupportActionBar();
    }
}


