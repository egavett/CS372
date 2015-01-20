package com.january.egavett.finalproject;

/**
 * Created by Eli Gavett on 1/19/2015.
 */
public class MyNotification {
    private String title; //title text of the notification
    private String text; //content text of the notification
    private String soundTitle; //title of the sound used
    private String iconTitle; //title of the icon used
    private Date pushDate; //the date the notification will be pushed

    /*
    * Constructor for the MyNotification class
    * Creates a new date object
    * @param String title, text, soundTitle, iconTitle
    * @param int year, month, day, hour, minute
    */
    public MyNotification(String title, String text, String soundTitle, String iconTitle, int year, int month, int day, int minute, int hour){
        this.title = title;
        this.text = text;
        this.soundTitle = soundTitle;
        this.iconTitle = iconTitle;
        pushDate = new Date(year, month, day, hour, day);
    }

    /*
    * Constructor for the MyNotification class
    * uses an existing date object
    * @param String title, text, soundTitle, icon
    * @param Date pushDate
    */
    public MyNotification(String title, String text, String soundTitle, String iconTitle, Date pushDate){
        this.title = title;
        this.text = text;
        this.soundTitle = soundTitle;
        this.iconTitle = iconTitle;
        this.pushDate = pushDate;
    }

    /*
    * Accessor method for title
    * @return String title
    */
    public String getTitle(){
        return title;
    }

    /*
    * Accessor method for text
    * @return String text
    */
    public String getText(){
        return text;
    }

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
    public Date getPushDate(){
        return pushDate;
    }

    /*
    * Abstract method for pushing notifications
    * Will be overridden in all subclasses
    */
    public void push(){}
}
