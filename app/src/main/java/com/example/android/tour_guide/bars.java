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
    Item.add(new items(getString(R.string.rBar),getString(R.string.rBar_address),R.drawable.rbar));
    Item.add(new items(getString(R.string.Tap_and_Bottle),getString(R.string.Tap_and_Bottle_address),R.drawable.tapandbottle));
    Item.add(new items(getString(R.string.Ches_Lounge),getString(R.string.Ches_address),R.drawable.cheslounge));
    Item.add(new items(getString(R.string.Casa),getString(R.string.Casa_address),R.drawable.casa));


    items_adapter adapter = new items_adapter(this, Item);

    ListView listView = (ListView) findViewById(R.id.list);

    listView.setAdapter(adapter);

}}
