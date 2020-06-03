package com.example.visitingnyc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*




        */
        TextView numbers = (TextView) findViewById(R.id.restaurants);
        numbers.setOnClickListener(new ActivityClickListener(RestaurantsActivity.class));

    }
}
