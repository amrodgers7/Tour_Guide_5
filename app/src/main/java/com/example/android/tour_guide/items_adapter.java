package com.example.android.tour_guide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aimeerodgers on 6/1/17.
 */
public class items_adapter extends ArrayAdapter<items> {

    private int mColorResourceId;

    private static final String LOG_TAG = items_adapter.class.getSimpleName();

    public items_adapter(Activity context, ArrayList<items>items) {
        super (context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        items currentItems = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.Name_of_Item);
        nameTextView.setText(currentItems.getmName());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.Item_Location);
        locationTextView.setText(currentItems.getmLocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentItems.getmImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);

        return listItemView;

    }

}
