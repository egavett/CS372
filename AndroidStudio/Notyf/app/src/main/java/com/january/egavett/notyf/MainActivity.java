package com.january.egavett.notyf;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {
    //Instance Variable creation
    private MyNotifManager manager = new MyNotifManager();
    private Timer timer = new Timer();
    TimerTask timerTask = new TimerTask()
    {
        @Override
        public void run()
        {
            pushNotification();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras = getIntent().getExtras();
        if(extras != null)
            addNotification(extras);
        else
            readFile("notifications.txt");
        updateList();
        if(!(manager.getArray().isEmpty())){
            setNotification();
        }
    }

    /*
     * Called when a bundle is returns from the addActivity
     * Creates a new notification from that info
     */
    private void addNotification(Bundle extras) {
        String t = extras.getString("TITLE");
        String l1 = extras.getString("LINEONE");
        String l2 = extras.getString("LINETWO");
        int y = extras.getInt("YEAR");
        int m = extras.getInt("MONTH");
        int d = extras.getInt("DAY");
        int h = extras.getInt("HOUR");
        int n = extras.getInt("MINUTE");
        String p = (String)extras.get("PERIOD");
        manager.addNotification(new MyNotification(t, l1, l2, "nullSound", "nullIcon", y, m, d, h, n, p));
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
        l.removeAllViews();
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
        try {
            TextView view = (TextView) v;
            Intent intent = new Intent(this, ViewActivity.class);
            MyNotification n = manager.getNotification((String) view.getText());
            if(n == null)
                throw new Exception(((String)(view.getText())) + "does not exist.");
            else {
                intent.putExtra("TITLE", n.getTitle());
                intent.putExtra("LINEONE", n.getLine1());
                intent.putExtra("LINETWO", n.getLine2());
                intent.putExtra("YEAR", n.getPushDate().get(GregorianCalendar.YEAR));
                intent.putExtra("MONTH", n.getPushDate().get(GregorianCalendar.MONTH));
                intent.putExtra("DAY", n.getPushDate().get(GregorianCalendar.DAY_OF_MONTH));
                intent.putExtra("HOUR", n.getPushDate().get(GregorianCalendar.HOUR_OF_DAY));
                intent.putExtra("MINUTE", n.getPushDate().get(GregorianCalendar.MINUTE));
                intent.putExtra("PERIOD", n.getPeriod());
                startActivity(intent);
            }
        }
        catch(Exception e){
            System.out.printf("Exception encountered trying to find Notification: %s/n", e.getMessage());
        }
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
            String dirPath = getFilesDir().getAbsolutePath() + File.separator + f;
            File file = new File(dirPath);
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
                manager.addNotification(new MyNotification(t, l1, l2, s, i, y, m, d, h, n, p));
                rdr.close();
            }
        }
        catch(Exception e){
            System.out.printf("Exception encountered reading file: %s\n", e.getMessage());
        }
    }

    /*
     * Reads a file and retrieves notification info. Saves that info to a file
     * @param String f the file name
     */
    public void writeFile(String f){
        manager.sort();
        try {
            String dirPath = getFilesDir().getAbsolutePath() + File.separator + f;
            File file = new File(dirPath);
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
                wrtr.write((n.getPushDate().get(GregorianCalendar.YEAR)));
                wrtr.newLine();
                wrtr.write(n.getPushDate().get(GregorianCalendar.MONTH));
                wrtr.newLine();
                wrtr.write(n.getPushDate().get(GregorianCalendar.DAY_OF_MONTH));
                wrtr.newLine();
                wrtr.write(n.getPushDate().get(GregorianCalendar.HOUR_OF_DAY));
                wrtr.newLine();
                wrtr.write(n.getPushDate().get(GregorianCalendar.MINUTE));
                wrtr.newLine();
                wrtr.write(n.getPeriod());
                wrtr.newLine();
            }
            wrtr.close();
        }
        catch(Exception e){
            System.out.printf("Exception encountered writing to file: %s\n", e.getMessage());
        }
    }

    /*
     * Gets the first notification from manager
     * Sets a timer to push that notification when the appropriate date has been reached
     */
    private void setNotification() {
        try {
            MyNotification n = manager.getArray().get(0);
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
            String dateString = n.getPushDate().MONTH + "/" + n.getPushDate().DAY_OF_MONTH + "/" + n.getPushDate().YEAR + " " +
                                n.getPushDate().HOUR_OF_DAY + ":" + n.getPushDate().MINUTE;
            Date date = formatter.parse(dateString);
            timer.schedule(timerTask, date);
        }
        catch (Exception ex){
            System.out.printf("Exception encountered setting timer: %s", ex.getMessage());
        }
    }

    /*
     * Builds a new Notification from the top MyNotifcation in manager
     * Pushes it, and updates the date/removes the notification, depending on situation
     */
    public void pushNotification(){
        MyNotification n = manager.getArray().get(0);
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle(n.getTitle())
                        .setContentText(n.getLine1() + " " + n.getLine2());
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);

        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(0, mBuilder.build());

        manager.update();
        setNotification();
    }

    /*
     * Called when the refresh button is clicked
     * Helper method to call updateList()
     */
    public void refresh(View v){
        updateList();
    }

    /*
    * Overrides the onStop() method
    * Calls the super function, then the writeFIle method
     */
    @Override
    public void onStop(){
        super.onStop();
        writeFile("notifications.txt");
    }
}

