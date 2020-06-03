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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.loc_list, container, false);

        // Initialize the Shopping data
        ArrayList<Location> locations = new ArrayList<Location>(){{
            add(new Location(R.string.shopping_5th_avenue, R.drawable.shopping_5th_avenue));
            add(new Location(R.string.shopping_macy, R.drawable.shopping_macy));
            add(new Location(R.string.shopping_chelsea_market, R.drawable.shopping_chelsea));
            add(new Location(R.string.shopping_madison_avenue, R.drawable.shopping_madison));
            add(new Location(R.string.shopping_soho, R.drawable.shopping_soho));
            add(new Location(R.string.shopping_williamsburg, R.drawable.shopping_williamsburg));
            add(new Location(R.string.shopping_union_square, R.drawable.shopping_union_square));
        }};

        // Use AdapterView for listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_shopping);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
