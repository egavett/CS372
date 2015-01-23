package com.january.egavett.notyf;

import java.util.GregorianCalendar;

/**
 * Created by Eli Gavett on 1/19/2015.
 */
public class PeriodicNotification extends MyNotification{
    private String period; //Signifies how often the notification is pushed. Accepted values are "daily", "weekly", "monthly" and "annual"

    /*
     * Constructor for PeriodicNotification class
     * Creates a new GregorianCalendar object
     * Throws an exception if period is not a valid String
     * @param String title, text, soundTitle, iconTitle, period
     * @param int year, month, day, hour, minute
     */
    public PeriodicNotification(String title, String line1, String line2, String soundTitle, String iconTitle, int year, int month, int day, int hour, int minute, String period) throws IllegalStateException{
        super(title, line1, line2, soundTitle, iconTitle, year, month, day, hour, minute);
        try {
            if(!isValid(period))
                throw new IllegalStateException("'" + period + "' is not a valid period.");
            else
                this.period = period;
        }
        catch(Exception ex){
            System.out.printf("Exception encountered creating a periodic notification: $s\n", ex.getMessage());
        }
    }

    /*
     * Constructor for the PeriodicNotification class
     * Uses an existing GregorianCalendar object
     * Throws an exception if period is not a valid String
     * @param String title, text, soundTitle, icon, period
     * @param Date pushDate
     */
    public PeriodicNotification(String title, String line1, String line2, String soundTitle, String iconTitle, GregorianCalendar pushDate, String period) throws IllegalStateException{
        super(title, line1, line2, soundTitle, iconTitle, pushDate);
        try {
            if(!isValid(period))
                throw new IllegalStateException("'" + period + "' is not a valid period.");
            else
                this.period = period;
        }
        catch(Exception ex){
            System.out.printf("Exception encountered creating a periodic notification: $s\n", ex.getMessage());
        }
    }

    /*
     * Pushes the notification to the status bar
     */
    @Override
    public void push(){
        //TODO implement notification code
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
     * Checks to see if period is a valid sting
     * valid strings are are "daily", "weekly", "monthly" and "annual" (not case sensitive)
     * @param String period
     * @return boolean based on period's validity
     */
    public boolean isValid(String period){
        if(period.equalsIgnoreCase("daily") || period.equalsIgnoreCase("weekly") || period.equalsIgnoreCase("monthly") || period.equalsIgnoreCase("annual"))
            return true;
        return false;
    }

    /*
     * Accessor Method for period
     * @return String period
     */
    public String getPeriod(){
        return period;
    }
}
