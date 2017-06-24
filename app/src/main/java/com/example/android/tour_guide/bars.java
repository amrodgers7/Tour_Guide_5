package com.example.android.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aimeerodgers on 6/1/17.
 */
public class bars extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bars);

    //List of bars
    final ArrayList<items> Item = new ArrayList<items>();
    Item.add(new items("R Bar","350 E Congress St #110, Tucson, AZ 85701",R.drawable.rbar));
    Item.add(new items("Tap and Bottle", "403 N 6th Ave #135, Tucson, AZ 85705",R.drawable.tapandbottle));
    Item.add(new items("Che's Lounge", "350 N 4th Ave, Tucson, AZ 85705",R.drawable.cheslounge));
    Item.add(new items("Casa Video", "2905 E Speedway Blvd, Tucson, AZ 85716",R.drawable.casa));


    items_adapter adapter = new items_adapter(this, Item);

    ListView listView = (ListView) findViewById(R.id.list);

    listView.setAdapter(adapter);

}}
