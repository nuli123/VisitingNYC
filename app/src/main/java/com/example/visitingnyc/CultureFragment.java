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
            add(new Location(R.string.culture_met, R.drawable.culture_met));
            add(new Location(R.string.culture_broadway, R.drawable.culture_broadway));
            add(new Location(R.string.culture_moma, R.drawable.culture_moma));
            add(new Location(R.string.culture_lincoln_center, R.drawable.culture_lincoln));
            add(new Location(R.string.culture_carnegie_hall, R.drawable.culture_carnegiehall));
            add(new Location(R.string.culture_botanical_garden, R.drawable.culture_newyorkbotanicalgarden));
            add(new Location(R.string.culture_guggenheim, R.drawable.culture_guggenheim));
        }};

        // Use AdapterView for listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_culture);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
