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
public class CultureFragment extends Fragment {
    public CultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.loc_list, container, false);

        // Initialize the Culture data
        ArrayList<Location> locations = new ArrayList<Location>(){{
            add(new Location(R.string.culture_met));
            add(new Location(R.string.culture_broadway));
            add(new Location(R.string.culture_moma));
            add(new Location(R.string.culture_lincoln_center));
            add(new Location(R.string.culture_carnegie_hall));
            add(new Location(R.string.culture_botanical_garden));
            add(new Location(R.string.culture_guggenheim));
        }};

        // Use AdapterView for listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_culture);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location loc = (Location) parent.getItemAtPosition(position);

            }
        });
        return rootView;
    }
}
