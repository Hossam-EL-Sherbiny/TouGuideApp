package com.example.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<Guide> {


    public GuideAdapter(Activity context, ArrayList<Guide> words)
    {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view.
        View listItemView =convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        // Get the {@link Guide} object located at this position in the list.
        Guide currentWord =getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView infoTextView =listItemView.findViewById(R.id.info_list_item);
        // Get the version name from the current Guide object and
        // set this text on the name TextView.
        assert currentWord != null;
        infoTextView.setText(currentWord.getInformation());

        //Find the TextView in the list_item.xml layout with the ID version_name
        // and set this text on the name TextView.
        TextView explanationView = listItemView.findViewById(R.id.explanation_list_item);
        //Get the version name from the current Guide object...
        //and set this text on the name TextView.
        explanationView.setText(currentWord.getexplan());

        // Find the imageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.imageOfListItem);
        //Set the image view to the image resource specified in the current word.
        imageView.setImageResource(currentWord.getImageResourceId());

        return listItemView;
    }
}
