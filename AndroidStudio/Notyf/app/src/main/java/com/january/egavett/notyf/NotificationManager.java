package com.january.egavett.notyf;

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
    public void addNotification(MyNotification n) {
        theArray.add(n);
        sort();
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

    /*
     * Searches the manager's ArrayList for a notification by title
     * and returns that notification
     * @param String title - the title of the Notification
     * @return MyNotification - the desired notification
     */
    public MyNotification getNotification(String title){
        for(int a = 0; a < theArray.size(); a++){
            if(theArray.get(a).getTitle().equalsIgnoreCase(title))
                return theArray.get(a);
        }
        return null;
    }

    /*
     * Sorts the array of events by date
     */
    public void sort(){
        Collections.sort(theArray, MyNotification.NotifComparator);
    }
}

