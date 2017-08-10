package com.nyamadi.apps.eventshub.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyamadi.apps.eventshub.R;


public class EventsFragment extends Fragment {
    public EventsFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootview_events = inflater.inflate(R.layout.fragment_events, container, false);



        return rootview_events;
    }
}
