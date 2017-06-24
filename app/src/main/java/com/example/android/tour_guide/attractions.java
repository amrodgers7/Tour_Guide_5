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
        Item.add(new items("Arizona Sonora Desert Museum", "2021 N Kinney Rd, Tucson, AZ 85743",R.drawable.desertmuseum));
        Item.add(new items("Kitt Peak Observatory", "https://www.noao.edu/kpno/",R.drawable.kittpeak));
        Item.add(new items("Biosphere 2", "32540 S Biosphere Rd, Oracle, AZ 85739",R.drawable.biosphere));
        Item.add(new items("Mount Lemmon", "Santa Catalina Mountain Range",R.drawable.mtlemmon));


        items_adapter adapter = new items_adapter(this, Item);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}