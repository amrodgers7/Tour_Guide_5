package com.example.android.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by aimeerodgers on 6/1/17.
 */
public class shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping);

        //List of shopping
        final ArrayList<items> Item = new ArrayList<items>();
        Item.add(new items(getString(R.string.Pop_Cycle),getString(R.string.Pop_Cycle_address),R.drawable.popcycle));
        Item.add(new items(getString(R.string.La_encantada),getString(R.string.La_encantada_address),R.drawable.laencantada));
        Item.add(new items(getString(R.string.mercado),getString(R.string.mercado_address),R.drawable.mercado));
        Item.add(new items(getString(R.string.outlets),getString(R.string.outlets_address),R.drawable.outlet));


        items_adapter adapter = new items_adapter(this, Item);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
