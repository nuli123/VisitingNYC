package com.example.visitingnyc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mColorRes;

    /***
     * This is custom constructor(it doesn't mirror with any exsiting superclass constructor)
     * The context is used to inflate the layout file, and the list is the data we want to
     * populate into the lists.
     * @param context
     * @param locations
     */
    public LocationAdapter(Context context, List<Location> locations, int colorRes){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is usd when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
        this.mColorRes=colorRes;
    }

    /***
     * Provides a view for an AdapterView(ListView, GridView, etc.)
     * @param position: The position in the list of data that should be displayed in the list item view
     * @param convertView: The recycled view to populate
     * @param parent: The parent ViewGroup that is used for inflation     *
     * @return: The View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        // Get the {@link Location} object located at the position in the list
        Location location = getItem(position);
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        if(location.hasImage()){
            imageView.setImageResource(location.getImageRes());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        // Find the TextView in the list_item.xml layout with the ID location
        TextView locationText = (TextView) listItemView.findViewById(R.id.location);
        locationText.setText(location.getNameResID());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),this.mColorRes);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
