package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

@SuppressWarnings("ALL")
class GuideAdapter extends ArrayAdapter<Guide> {

    /**
     * Resource ID for the background color for this list of words
     */
    private final int mColorResourceId;

    GuideAdapter(Activity context, ArrayList<Guide> guide, int colorId) {
        super(context, 0, guide);
        mColorResourceId = colorId;
    }

    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Checks if the existing view is being reused, otherwise inflates the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Guide currentGuide = getItem(position);
        assert currentGuide != null;

        // Finds the TextView in the list_item.xml layout for the first view
        TextView firstTextView = listItemView.findViewById(R.id.textview1);
        try {

            firstTextView.setText(currentGuide.getFirstWord());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Finds the TextView in the list_item.xml layout for the second view (
        TextView secondTextView = listItemView.findViewById(R.id.textview2);
        try {
            secondTextView.setText(currentGuide.getSecondWord());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Finds the TextView in the list_item.xml layout for the Image
        ImageView firstImageView = listItemView.findViewById(R.id.pic1);
        try {
            firstImageView.setImageResource(currentGuide.getFirstImage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.container_view);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
