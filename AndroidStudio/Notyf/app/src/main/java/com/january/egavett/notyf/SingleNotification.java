package com.january.egavett.notyf;


import java.util.GregorianCalendar;

/**
 * Created by Eli Gavett on 1/19/2015.
 */
public class SingleNotification extends MyNotification {
    /*
    * Constructor for SingleNotification class
    * Creates a new GregorianCalender object
    * @param String title, text, soundTitle, iconTitle
    * @param int year, month, day, hour, minute
     */
    public SingleNotification(String title, String line1, String line2, String soundTitle, String iconTitle, int year, int month, int day, int hour, int minute){
        super(title, line1, line2, soundTitle, iconTitle, year, month, day, hour, minute);
    }

    /*
   * Constructor for the SingleNotification class
   * Uses an existing GregorianCalender object
   * @param String title, text, soundTitle, icon
   * @param Date pushDate
   */
    public SingleNotification(String title, String line1, String line2, String soundTitle, String iconTitle, GregorianCalendar pushDate){
        super(title, line1, line2, soundTitle, iconTitle, pushDate);
    }

    /*
     * Pushes the notification to the status bar
     */
    @Override
    public void push(){
        //TODO implement notification code
    }
}

