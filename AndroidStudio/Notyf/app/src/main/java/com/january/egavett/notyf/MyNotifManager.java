package com.january.egavett.notyf;

import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Created by Eli Gavett on 1/21/2015.
 */
public class MyNotifManager {
    private ArrayList<MyNotification> theArray; //ArrayList that holds all the notifications created, sorted by date


    /*
     * Constructor for the MyNotifManager Class
     */
    public MyNotifManager(){
        theArray = new ArrayList<>();
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
    public void update(){
        //if the period doesn't equal never, update the pushDate
        //and re-add it to the ArrayList
        if(!theArray.get(0).getPeriod().equalsIgnoreCase("never")){
            MyNotification n = theArray.get(0);
            n.setDate();
            theArray.add(n);
        }

        //Remove the notification that was just pushed
        theArray.remove(0);
        sort();
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

