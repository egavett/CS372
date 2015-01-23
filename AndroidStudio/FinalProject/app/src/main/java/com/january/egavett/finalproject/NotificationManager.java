package com.january.egavett.finalproject;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Timer;
import android.app.Notification;

/**
 * Created by Eli Gavett on 1/21/2015.
 */
public class NotificationManager {
    private ArrayList<MyNotification> theArray; //ArrayList that holds all the notifications created, sorted by date
    private Timer theTimer; //Used to count down timer until next notification push
    private GregorianCalendar currentDate; //Contains the current time and date, used to set the timer

    /*
    * Constructor for the NotificationManager Class
    */
    public NotificationManager(){
        theArray = new ArrayList<>();
        theTimer = new Timer();
    }

    /*
     * Creates a new notification from the information in the activity screen
     * Adds it to the ArrayList
     */
    public void addNotification() {
        String t = "";
        String c1 = "";
        String c2 = "";
        String c = c1 + " " + c2;
        String i = "";
        String s = "";
        int y = 2000;
        int m = 1;
        int d = 1;
        int h = 1;
        int n = 0;
        GregorianCalendar newDate = new GregorianCalendar(2000, 1, 1, 1, 0);
        if(true){
            String p = "";
            theArray.add(new PeriodicNotification(t, c, i, s, newDate, p));
        }
        else
            theArray.add(new SingleNotification(t, c, i, s, newDate));

        Collections.sort(theArray, MyNotification.NotifComparator);

    }

    /*
     * Removes the next notification from the queue and pushes it to the status bar
     */
    public void pushNotification(){

    }

    /*
     * Returns a list of all the current Notifications
     * @return ArrayList<MyNotification> list
     */
    public ArrayList<MyNotification> getArray(){
        return theArray;
    }
}
