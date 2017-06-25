package com.example.android.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aimeerodgers on 6/1/17.
 */
public class attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions);

        //List of Restaurants

        final ArrayList<items> Item = new ArrayList<items>();
        Item.add(new items(getString(R.string.desert_museum),getString(R.string.desert_museum_address),R.drawable.desertmuseum));
        Item.add(new items(getString(R.string.kitt_peak),getString(R.string.kitt_peak_address),R.drawable.kittpeak));
        Item.add(new items(getString(R.string.biosphere),getString(R.string.biosphere_address),R.drawable.biosphere));
        Item.add(new items(getString(R.string.mount_lemmon),getString(R.string.mount_lemmon_address),R.drawable.mtlemmon));


        items_adapter adapter = new items_adapter(this, Item);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}