package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FunFragment extends Fragment {

    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);


        final ArrayList<Guide> guides = new ArrayList<>();

        guides.add(new Guide(getString(com.example.android.tourguideapp.R.string.als), getString(com.example.android.tourguideapp.R.string.als_desc), R.drawable.big_als));
        guides.add(new Guide(getString(com.example.android.tourguideapp.R.string.ifly), getString(com.example.android.tourguideapp.R.string.ifly_desc), R.drawable.ifly));
        guides.add(new Guide(getString(com.example.android.tourguideapp.R.string.golf), getString(com.example.android.tourguideapp.R.string.golf_desc), R.drawable.golf));
        guides.add(new Guide(getString(com.example.android.tourguideapp.R.string.park), getString(com.example.android.tourguideapp.R.string.park_desc), R.drawable.park_lanes));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        // Left in the option to change bg_color on for each page, but left it white for now.
        GuideAdapter adapter = new GuideAdapter(getActivity(), guides, R.color.bg_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }
}
