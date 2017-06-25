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
        Item.add(new items(getString(R.string.lacocina),getString(R.string.lacocina_address),R.drawable.lacocina));
        Item.add(new items(getString(R.string.congress),getString(R.string.congress_address),R.drawable.congress));
        Item.add(new items(getString(R.string.reilly),getString(R.string.reilly_address),R.drawable.reilly));
        Item.add(new items(getString(R.string.obon),getString(R.string.obon_address),R.drawable.obon));


        items_adapter adapter = new items_adapter(this, Item);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}