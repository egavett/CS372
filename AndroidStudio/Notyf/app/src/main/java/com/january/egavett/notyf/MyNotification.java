package com.january.egavett.notyf;

import java.util.Comparator;
import java.util.GregorianCalendar;

/**
 * Created by Eli Gavett on 1/19/2015.
 */
public class MyNotification{
    private String title; //title text of the notification
    private String line1; //first line of content text
    private String line2; //second line of content text
    private String soundTitle; //title of the sound used
    private String iconTitle; //title of the icon used
    private GregorianCalendar pushDate; //the date the notification will be pushed
    private String period; //Signifies how often the notification is pushed. Accepted values are "never", "daily", "weekly", "monthly" and "annual"

    /*
     * Constructor for the MyNotification class
     * Creates a new GregorianCalendar object
     * @param String title, text, soundTitle, iconTitle
     * @param int year, month, day, hour, minute
     */
    public MyNotification(String title, String line1, String line2, String soundTitle, String iconTitle, int year, int month, int day, int minute, int hour, String period){
        try {
            if (isValid(period)) {
                this.title = title;
                this.line1 = line1;
                this.line2 = line2;
                this.soundTitle = soundTitle;
                this.iconTitle = iconTitle;
                pushDate = new GregorianCalendar(year, month, day, hour, day);
                this.period = period;
            } else
                throw new IllegalStateException("'" + period + "' is not a valid period.");
        }
        catch(Exception ex){
            System.out.printf("Exception encountered creating a MyNotification object: $s\n", ex.getMessage());
        }
    }

    /*
     * Constructor for the MyNotification class
     * Uses an existing GregorianCalendar object
     * @param String title, text, soundTitle, icon
     * @param Date pushDate
     */
    public MyNotification(String title, String line1, String line2, String soundTitle, String iconTitle, GregorianCalendar pushDate, String period){
        try {
            if(isValid(period)) {
                this.title = title;
                this.line1 = line1;
                this.line2 = line2;
                this.soundTitle = soundTitle;
                this.iconTitle = iconTitle;
                this.pushDate = pushDate;
                this.period = period;
            }
            else
                throw new IllegalStateException("'" + period + "' is not a valid period.");
        }
        catch (Exception ex){
            System.out.printf("Exception encountered creating a MyNotification object: %s\n", ex.getMessage());
        }
    }

    /*
     * Accessor method for title
     * @return String title
     */
    public String getTitle(){
        return title;
    }

    /*
     * Accessor method for line1
     * @return String line1
     */
    public String getLine1(){
        return line1;
    }

    /*
     * Accessor method for line2
     * @return String line2
     */
    public String getLine2(){ return line2; }

    /*
     * Accessor method for soundTitle
     * @return String soundTitle
     */
    public String getSoundTitle(){
        return soundTitle;
    }

    /*
     * Accessor method for iconTitle
     * @return String iconTitle
     */
    public String getIconTitle(){
        return iconTitle;
    }

    /*
     * Accessor method for pushDate
     * @return Date pushDate
     */
    public GregorianCalendar getPushDate(){
        return pushDate;
    }

    /*
     * Accessor method for period
     * @return String period
     */
    public String getPeriod(){ return period;}

    /*
     * Method used to check that the given period is valid
     * Allowed strings are "never, "weekly", "monthly" and "annual" (not case sensitive)
     * @param String period
     * @return boolean based on period's validity
     */
    public boolean isValid(String period){
        if(period.equalsIgnoreCase("never") || period.equalsIgnoreCase("daily") || period.equalsIgnoreCase("weekly") || period.equalsIgnoreCase("monthly") || period.equalsIgnoreCase("annual"))
            return true;
        return false;
    }

    /*
 * Resets the date after the push() method is called
 * Uses GregorianCalender's built-in roll() method
 */
    public void setDate(){
        //daily notification
        if(period.equalsIgnoreCase("daily")){
            getPushDate().roll(GregorianCalendar.DAY_OF_MONTH, true);
        }
        //weekly notification
        else if(period.equalsIgnoreCase("weekly")){
            getPushDate().roll(GregorianCalendar.DAY_OF_MONTH, 7);
        }
        //monthly notification
        else if(period.equalsIgnoreCase("monthly")){
            getPushDate().roll(GregorianCalendar.MONTH, true);
        }
        //annual notification
        else if(period.equalsIgnoreCase("annual")){
            getPushDate().roll(GregorianCalendar.YEAR, true);
        }
    }


    /*
     * Comparator used to sort MyNotifications by date and time
     */
    public static Comparator<MyNotification> NotifComparator = new Comparator<MyNotification>(){
        @Override
        public int compare(MyNotification n1, MyNotification n2){
            return n1.getPushDate().compareTo(n2.getPushDate());
        }
    };

}
