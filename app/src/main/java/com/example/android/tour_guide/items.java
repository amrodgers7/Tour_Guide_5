package com.example.android.tour_guide;

/**
 * Created by aimeerodgers on 6/1/17.
 */
public class items {

    //**Name of place
    public String mName;

    //**Location of place
    public String mLocation;

    //**Image resource ID for the word. */

    public int mImageResourceId;



    public items (String Name, String Location, int imageResourceId) {

        mName = Name;
        mLocation = Location;
        mImageResourceId = imageResourceId;
    }



    /** Get the Name of the place */

    public String getmName () {return mName;}

    //**Get the location of the place */

    public String getmLocation () {return mLocation;}

    //**Get the image of the location */

    public int getmImageResourceId () {return mImageResourceId;}



}
