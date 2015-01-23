package com.january.egavett.finalproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class AddActivity extends ActionBarActivity {
    //instance variables used to send data back to MainActivity
    //public static final String NEW_TITLE = com.january.egavett.finalproject.TITLE;
    //public static final String NEW_TEXT1 = com.january.egavett.finalproject.TITLE;
    //public static final String NEW_TEXT2 = com.january.egavett.finalproject.TITLE;
    //public static final String NEW_TITLE = com.january.egavett.finalproject.TITLE;
    //public static final String NEW_PERIOD = com.january.egavett.finalproject.TITLE;
    //public static final int NEW_DAY = com.january.egavett.finalproject.TITLE;
    //public static final int NEW_MONTH = com.january.egavett.finalproject.TITLE;
    //public static final int NEW_YEAR = com.january.egavett.finalproject.TITLE;
    //public static final int NEW_HOUR = com.january.egavett.finalproject.TITLE;
    //public static final int NEW_MINUTE = com.january.egavett.finalproject.TITLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
     * Collects all information from the activity,
     * Sends it to main acitivity to become notification
     */
    public void btnClick(View v){

    }
}
