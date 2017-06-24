package com.example.android.tour_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // Find the View that shows the numbers category
            TextView restaurants = (TextView) findViewById(R.id.restaurants);

            // Set a click listener on that View

            restaurants.setOnClickListener(new View.OnClickListener() {

                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent restaurantsIntent = new Intent(MainActivity.this, restaurants.class);
                    startActivity(restaurantsIntent);
                }
            });
            // Find the View that shows the colors category
            TextView bars = (TextView) findViewById(R.id.bars);

            // Set a click listener on that View
            bars.setOnClickListener(new View.OnClickListener() {

                // The code in this method will be executed when the colors View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent barsIntent = new Intent(MainActivity.this, bars.class);
                    startActivity(barsIntent);
                }
            });
            // Find the View that shows the Family Members category
            TextView attractions = (TextView) findViewById(R.id.attractions);

            // Set a click listener on that View
            attractions.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the Family Members View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent attractionsIntent = new Intent(MainActivity.this, attractions.class);
                    startActivity(attractionsIntent);
                }
            });
            // Find the View that shows the Phrases category
            TextView shopping = (TextView) findViewById(R.id.shopping);

            // Set a click listener on that View
            shopping.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the phrases View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent shoppingIntent = new Intent(MainActivity.this, shopping.class);
                    startActivity(shoppingIntent);
                }
            });
    }
}
