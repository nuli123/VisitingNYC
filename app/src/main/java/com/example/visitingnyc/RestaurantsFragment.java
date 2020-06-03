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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.loc_list, container, false);

        // Initialize the restaurants data
        ArrayList<Location> locations = new ArrayList<Location>(){{
            add(new Location(R.string.res_royal_35_steakhouse, R.drawable.res_royal_35_steakhouse));
            add(new Location(R.string.res_dim_sum_palace, R.drawable.res_dim_sum));
            add(new Location(R.string.res_river_cafe, R.drawable.res_river_cafe));
            add(new Location(R.string.res_gyu_kaku, R.drawable.res_gyu_kaku));
            add(new Location(R.string.res_luke_lobster, R.drawable.res_lukes_lobster));
            add(new Location(R.string.res_blue_ribbon, R.drawable.res_blue_ribbon));
            add(new Location(R.string.res_emily, R.drawable.res_emily_burger));
            add(new Location(R.string.res_le_bernardin, R.drawable.res_le_bernardin));
            add(new Location(R.string.res_mala_project, R.drawable.res_mala_pot));
            add(new Location(R.string.res_lucali, R.drawable.res_lucali));
        }};

        // Use AdapterView for listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
