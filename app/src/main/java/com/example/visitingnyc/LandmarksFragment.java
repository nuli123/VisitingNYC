package com.example.visitingnyc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.loc_list, container, false);

        // Initialize the landmarks data
        ArrayList<Location> locations = new ArrayList<Location>(){{
            add(new Location(R.string.landmark_statue_liberty, R.drawable.landmark_statue_liberty));
            add(new Location(R.string.landmark_empire_state, R.drawable.landmark_empire_state));
            add(new Location(R.string.landmark_high_line, R.drawable.landmark_high_line));
            add(new Location(R.string.landmark_time_squre, R.drawable.landmark_time_square));
            add(new Location(R.string.landmark_brookly_bridge, R.drawable.landmark_brooklyn));
            add(new Location(R.string.landmark_grand_central, R.drawable.landmark_grand_central));
            add(new Location(R.string.landmark_wall_street, R.drawable.landmark_wall_street));
            add(new Location(R.string.landmark_rockefeller, R.drawable.landmark_rockefeller));
        }};

        // Use AdapterView for listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_landmarks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
