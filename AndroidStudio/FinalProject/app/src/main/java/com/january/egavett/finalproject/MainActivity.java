package com.january.egavett.finalproject;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.FileOutputStream;
import java.util.ArrayList;

//PT -- This is all quite close. You did good work here, it just needs to get finished.
public class MainActivity extends ActionBarActivity {
    private NotificationManager manager = new NotificationManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateList();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
     * Adds a list of notifications to the LinearLayout
     * If no notifications are available, leaves a simple message
     */
    public void updateList(){
        LinearLayout l = (LinearLayout) this.findViewById(R.id.LinLayNotif);
        ArrayList<MyNotification> arrayList = manager.getArray();
        if(arrayList.size() == 0){
            TextView t = new TextView(this);
            t.setText("You don't seem to have any notifications yet...");
            LinearLayout.LayoutParams lp =
                    new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.setMargins(10, 10, 10, 10);
            t.setLayoutParams(lp);
            l.addView(t);
        }
        else{
            for(int a = 0; a < arrayList.size(); a++){
                MyNotification n = arrayList.get(a);
                TextView t = new TextView(this);
                t.setText(n.getTitle());
                LinearLayout.LayoutParams lp =
                        new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                lp.setMargins(10, 10, 10, 10);
                t.setLayoutParams(lp);

                t.setOnClickListener(new TextView.OnClickListener() {
                    public void onClick(View v) { txtClick(v);}
                });

                l.addView(t);
            }
        }
    }

    /*
     * When a notification is selected, opens a new activity
     * showing all the notification info
     */
    public void txtClick(View v){
        Intent intent = new Intent(this, ViewActivity.class);
        startActivity(intent);
    }

    /*
     * Called when button is clicked,
     * Transfers user to Add_Activity
     */
    public void btnClick(View v){
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }









    /*
     * Takes current notification information and saves them to a file
     * @param String f the file name
     */
    public void readFile(String f){

    }

    /*
     * Reads a file and retrieves notification info. Saves that info to a file
     * @param String f the file name
     */
    public void writeFile(String f){

    }
}
