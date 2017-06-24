package com.example.android.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aimeerodgers on 6/1/17.
 */
public class restaurants extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurants);

        //List of Restaurants

        final ArrayList<items> Item = new ArrayList<items>();
        Item.add(new items("La Cocina","201 N Court Ave, Tucson, AZ 85701",R.drawable.lacocina));
        Item.add(new items("Club Congress", "311 Congress Street, Tucson, AZ 85701",R.drawable.congress));
        Item.add(new items("Reilly", "101 E Pennington St, Tucson, AZ 85701",R.drawable.reilly));
        Item.add(new items("Obon", " 350 E Congress St, Tucson, AZ 85701",R.drawable.obon));


        items_adapter adapter = new items_adapter(this, Item);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}