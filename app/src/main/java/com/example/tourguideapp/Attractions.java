package com.example.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        ArrayList<Guide> words = new ArrayList<Guide>();

        words.add(new Guide("Pyramids Of Giza",R.drawable.pyramids,
                "The Giza pyramid complex, also called the Giza Necropolis, is the site on the Giza Plateau in Egypt that includes the Great Pyramid of Giza, the Pyramid of Khafre, and the Pyramid of Menkaure, along with their associated pyramid complexes and the Great Sphinx of Giza"));
        words.add(new Guide("Museum's Attraction", R.drawable.nefertity,
                "Location :\n Giza, Greater Cairo."));
        words.add(new Guide("Aswan's Attraction", R.drawable.aswantwo,
                "Aswan, a city on the Nile River, has been southern Egypt’s strategic and commercial gateway since antiquity."));
        words.add(new Guide("Temple's Attraction", R.drawable.karnak,
                "One of the most well-known temples in Luxor, The Karnak Temple complex contains a mix of chapels, pylons, decayed temples, and other buildings."));
        words.add(new Guide("TowerOfCairo's Attraction", R.drawable.cairotower,
                "From its 187 meters, the Cairo tower offers the most amazing panoramic views of the Egyptian capital."));
        words.add(new Guide("Alexandria's Attraction", R.drawable.alexlibirary,
                "Alexandria was an important city of the ancient world. For more than two thousand years, it was the largest city in Egypt and was its capital for almost half of that time."));

        GuideAdapter itemsAdapter = new GuideAdapter(this,words);
        ListView listview = (ListView)findViewById(R.id.listOfAttraction);
        listview.setAdapter(itemsAdapter);

    }
}
