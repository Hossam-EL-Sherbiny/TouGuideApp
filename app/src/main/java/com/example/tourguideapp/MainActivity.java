package com.example.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Attractions.
        final TextView attractionView = (TextView)findViewById(R.id.Attractions);
        //Set a click listener on that view.
        attractionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             // The code in this method will be executed when the numbers View is clicked on
                Intent attractionIntent = new Intent(MainActivity.this,Attractions.class);
                startActivity(attractionIntent);
            }
        });

        final TextView eventsView = (TextView)findViewById(R.id.Event);
        eventsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The Code in this method will be executed when the events View is clicked on.
                Intent eventsIntent = new Intent(MainActivity.this,Events.class);
                startActivity(eventsIntent);
            }
        });

        TextView historicView = (TextView)findViewById(R.id.historicPlaces);
        historicView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent historicIntent = new Intent(MainActivity.this,Historic_Places.class);
                startActivity(historicIntent);
            }
        });

        TextView museumsView = (TextView)findViewById(R.id.Museums);
        museumsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent museums = new Intent(MainActivity.this,Museums.class);
                startActivity(museums);
            }
        });

    }
}
