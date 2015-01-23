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

    /*
     * Constructor for the MyNotification class
     * Creates a new GregorianCalendar object
     * @param String title, text, soundTitle, iconTitle
     * @param int year, month, day, hour, minute
     */
    public MyNotification(String title, String line1, String line2, String soundTitle, String iconTitle, int year, int month, int day, int minute, int hour){
        this.title = title;
        this.line1 = line1;
        this.line2 = line2;
        this.soundTitle = soundTitle;
        this.iconTitle = iconTitle;
        pushDate = new GregorianCalendar(year, month, day, hour, day);
    }

    /*
     * Constructor for the MyNotification class
     * Uses an existing GregorianCalendar object
     * @param String title, text, soundTitle, icon
     * @param Date pushDate
     */
    public MyNotification(String title, String line1, String line2, String soundTitle, String iconTitle, GregorianCalendar pushDate){
        this.title = title;
        this.line1 = line1;
        this.line2 = line2;
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
     * Abstract method for pushing notifications
     * Will be overridden in all subclasses
     */
    public void push(){}

    public static Comparator<MyNotification> NotifComparator = new Comparator<MyNotification>(){
        @Override
        public int compare(MyNotification n1, MyNotification n2){
            return n1.getPushDate().compareTo(n2.getPushDate());
        }
    };

}
