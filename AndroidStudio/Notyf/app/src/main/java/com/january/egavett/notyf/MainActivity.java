package com.january.egavett.notyf;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


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
        TextView view = (TextView)v;
        Intent intent = new Intent(this, ViewActivity.class);
        MyNotification n = manager.getNotification((String)view.getText());
        intent.putExtra(NOTIFICATION, n);
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
        try{
            File file = new File(f);
            BufferedReader rdr = new BufferedReader(new FileReader(file));
            String line;
            while((line = rdr.readLine()) != null){
                String t = line;
                String l1 = rdr.readLine();
                String l2 = rdr.readLine();
                String s = rdr.readLine();
                String i = rdr.readLine();
                int y = Integer.parseInt(rdr.readLine());
                int m = Integer.parseInt(rdr.readLine());
                int d = Integer.parseInt(rdr.readLine());
                int h = Integer.parseInt(rdr.readLine());
                int n = Integer.parseInt(rdr.readLine());
                String p = rdr.readLine();
                if(p.contains("*"))
                    manager.addNotification(new SingleNotification(t, l1, l2,s, i, y, m, d, h, n));
                else{
                    manager.addNotification(new PeriodicNotification(t, l1, l2,s, i, y, m, d, h, n, p));
                }
                rdr.close();
            }
        }
        catch(Exception e){
            System.out.println("Exception encountered reading file.");
        }
    }

    /*
     * Reads a file and retrieves notification info. Saves that info to a file
     * @param String f the file name
     */
    public void writeFile(String f){
        manager.sort();
        try {
            File file = new File(f);
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(file));
            for(int a = 0; a < manager.getArray().size(); a++){
                MyNotification n = manager.getArray().get(a);
                wrtr.write(n.getTitle());
                wrtr.newLine();
                wrtr.write(n.getLine1());
                wrtr.newLine();
                wrtr.write(n.getLine2());
                wrtr.newLine();
                wrtr.write(n.getSoundTitle());
                wrtr.newLine();
                wrtr.write(n.getIconTitle());
                wrtr.newLine();
                wrtr.write(n.getPushDate().YEAR);
                wrtr.newLine();
                wrtr.write(n.getPushDate().MONTH);
                wrtr.newLine();
                wrtr.write(n.getPushDate().DAY_OF_MONTH);
                wrtr.newLine();
                wrtr.write(n.getPushDate().HOUR);
                wrtr.newLine();
                wrtr.write(n.getPushDate().MINUTE);
                wrtr.newLine();
                if(n.getClass() == PeriodicNotification.class)
                    wrtr.write((PeriodicNotification)n.getPeriod());
                else
                    wrtr.write("*");
                wrtr.newLine();
            }
            wrtr.close();
        }
        catch(Exception e){
            System.out.println("Exception encountered writing to file.");
        }
    }
}

