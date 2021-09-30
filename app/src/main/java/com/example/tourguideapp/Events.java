package com.example.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        ArrayList<Guide> words = new ArrayList<Guide>();

        words.add(new Guide("Ramadan", R.drawable.ramadan,
                "Ramadan is a time of fasting, blessings and prayers to commemorate the revelation of the first verses of the Qur'an to the Prophet Muhammad by the Holy Spirit Gabriel."));
        words.add(new Guide("Sixth of October", R.drawable.octobar,
                "Important Events From This day in History October 6th. 1961."));
        words.add(new Guide("Iftar in Ramadan", R.drawable.iftar,
                "It is common for mosques to host large iftars, especially for the poor and needy. Nightly prayers called Tarawih are also held in mosques after iftar."));
        words.add(new Guide("Eid El-Fitr", R.drawable.eidfitr,
                "Eid al-Adha or Eid Qurban, also called the \"Festival of the Sacrifice\", is the second of two Islamic holidays celebrated worldwide each year, and considered the holier of the two. It honours the willingness of Ibrahim to sacrifice his son as an act of obedience to God's command."));
        words.add(new Guide("Eid El-Adha", R.drawable.eidadha,
                "Eid al-Adha or Eid Qurban, also called the \"Festival of the Sacrifice\", is the second of two Islamic holidays celebrated worldwide each year, and considered the holier of the two. It honours the willingness of Ibrahim to sacrifice his son as an act of obedience to God's command."));
        words.add(new Guide("Birth of the Prophet Muhammad", R.drawable.prophet,
                "Mawlid or Mawlid al-Nabi al-Sharif is the observance of the birthday of Islamic prophet Muhammad which is commemorated in Rabi' al-awwal, the third month in the Islamic calendar."));

        GuideAdapter itemsAdapter = new GuideAdapter(this,words);
        ListView listview = (ListView)findViewById(R.id.listOfEvents);
        listview.setAdapter(itemsAdapter);

    }
}
