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
        Item.add(new items("Pop Cycle","422 N 4th Ave, Tucson, AZ 85705",R.drawable.popcycle));
        Item.add(new items("La Encantada", "42905 E Skyline Dr, Tucson, AZ 85718",R.drawable.laencantada));
        Item.add(new items("Mercado San Agustin", "100 South Avenida del Convento, Tucson, AZ 85745",R.drawable.mercado));
        Item.add(new items("Tucson Premium Outlets", "6401 Marana Center Blvd, Tucson, AZ 85742",R.drawable.outlet));


        items_adapter adapter = new items_adapter(this, Item);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
