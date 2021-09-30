package com.example.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class Museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        ArrayList<Guide> words = new ArrayList<Guide>();

        words.add(new Guide("Egyptian Museums.", R.drawable.museum,
                "The Museum Of Egyptian Antiquities is considered to be one of the oldest, most famous, and largest museums in the world."));
        words.add(new Guide("Nefertiti.", R.drawable.nefertity,
                "Neferneferuaten Nefertiti (c. 1370 – c. 1330 BC) was an Egyptian queen and the Great Royal Wife of Akhenaten, an Egyptian Pharaoh. Nefertiti and her husband were known for a religious revolution, in which they worshipped one god only, Aten, or the sun disc.\n"));
        words.add(new Guide("Exploring abu Simbel Temple in Aswan.", R.drawable.simple,
                "The Abu Simbel temples are two massive rock temples at Abu Simbel, a village in Aswan Governorate, Upper Egypt, near the border with Sudan. They are situated on the western bank of Lake Nasser, about 230 km southwest of Aswan."));
        words.add(new Guide("Pharaoh Khafre. ", R.drawable.phararokhafre,
                "Khafre was an Egyptian king, from the Fourth Dynasty of the Old Kingdom in ancient Egypt. He ascended the throne after the death of his elder brother Djedefre, probably around 2570 B.C.He ruled Egypt for 26 years and was succeeded by his son, Menkaure."));
        words.add(new Guide("Amenhotep.", R.drawable.amenhotep,
                "Amenhotep III (c. 1386-1353 BCE) was the ninth king of the 18th Dynasty of Egypt. ... His greatest contribution to Egyptian culture was in maintaining peace and prosperity, which enabled him to devote his time to the arts."));
        words.add(new Guide("Body Of Pharaoh.", R.drawable.bodyoffiraawon,
                "This is the body of Fir’awn (Rameses II), believed to be the Pharoah in the time of Prophet Musa [Moses](upon him be peace)."));
        words.add(new Guide("Nefertiti's Secret Burial Place.", R.drawable.nefertitissecretburialplace,"Not Found!"));

        GuideAdapter itemsAdapter = new GuideAdapter(this,words);
        ListView listview = (ListView)findViewById(R.id.listOfMuseum);
        listview.setAdapter(itemsAdapter);



    }
}
