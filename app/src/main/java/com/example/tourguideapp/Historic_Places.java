package com.example.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Historic_Places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historic__places);

        ArrayList<Guide> words = new ArrayList<Guide>();

        words.add(new Guide("Khan Elkhalili Bazaar.", R.drawable.khan,
                "Established in the 14th century, Khan El-Khalili in Old Cairo has always been an important district for cultural and economic activities."));
        words.add(new Guide("Shopping in khan EL Khalili.", R.drawable.shop,
                "While strolling the market, you may find your eyes becoming lost between the unique mix of merchandise displayed in shops and allies."));
        words.add(new Guide("Montazah's Palace.", R.drawable.montazahpalace,
                "Montaza Palace is a palace, museum and extensive gardens in the Montaza district of Alexandria, Egypt. It was built on a low plateau east of central Alexandria overlooking a beach on the Mediterranean Sea."));
        words.add(new Guide("Inside Muhammad Ali's Palace.", R.drawable.mohamedpalace,
                "The Manial Palace is said to have been built for Prince Mohammad Ali between 1899 and 1929. The palace was given to the Egyptian nation in 1955."));
        words.add(new Guide("Salah Eldin Castle in Cairo.", R.drawable.salaheldeen,
                "The Citadel of Cairo or Citadel of Saladin is a medieval Islamic-era fortification in Cairo, Egypt, built by Salah ad-Din and further developed by subsequent Egyptian rulers. It was the seat of government in Egypt and the residence of its rulers for nearly 700 years."));
        words.add(new Guide("Citadel Of Qaitbay in Alexandria.", R.drawable.citadelofqaitbay,
                "The Citadel of Qaitbay is a 15th-century defensive fortress located on the Mediterranean sea coast, in Alexandria, Egypt.  The Citadel is situated on the eastern side of the northern tip of Pharos Island at the mouth of the Eastern Harbour."));

        GuideAdapter itemsAdapter = new GuideAdapter(this,words);  //,R.color.Category_Attractions
        ListView listview = (ListView)findViewById(R.id.listOfHistorical);
        listview.setAdapter(itemsAdapter);

    }
}
