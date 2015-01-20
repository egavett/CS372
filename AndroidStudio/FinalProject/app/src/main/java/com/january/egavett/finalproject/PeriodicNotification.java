package com.january.egavett.finalproject;

/**
 * Created by Eli Gavett on 1/19/2015.
 */
public class PeriodicNotification extends MyNotification{
    private String period; //Signifies how often the notification is pushed. Accepted values are "daily", "weekly", "monthly" and "annual"

    /*
    * Constructor for PeriodicNotification class
    * Creates a new Date object
    * Throws an exception if period is not a valid String
    * @param String title, text, soundTitle, iconTitle, period
    * @param int year, month, day, hour, minute
     */
    public PeriodicNotification(String title, String text, String soundTitle, String iconTitle, int year, int month, int day, int hour, int minute, String period) throws IllegalStateException{
        super(title, text, soundTitle, iconTitle, year, month, day, hour, minute);
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
   * uses an existing date object
   * Throws an exception if period is not a valid String
   * @param String title, text, soundTitle, icon, period
   * @param Date pushDate
   */
    public PeriodicNotification(String title, String text, String soundTitle, String iconTitle, Date pushDate, String period) throws IllegalStateException{
        super(title, text, soundTitle, iconTitle, pushDate);
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
    */
    public void setDate(){
        //get old date info
        int y = getPushDate().getYear();
        int m = getPushDate().getMonth();
        int d = getPushDate().getDay();
        int h = getPushDate().getHour();
        int n = getPushDate().getMinute();

        //daily notification
        if(period.equalsIgnoreCase("daily")){
            //TODO daily notification code
        }
        //weekly notification
        else if(period.equalsIgnoreCase("weekly")){
            //TODO weekly notification code
        }
        //monthly notification
        else if(period.equalsIgnoreCase("monthly")){
            //TODO monthly notification code
        }
        //annual notification
        else if(period.equalsIgnoreCase("annual")){
            y++;
            //TODO finish annual notification code
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
}
