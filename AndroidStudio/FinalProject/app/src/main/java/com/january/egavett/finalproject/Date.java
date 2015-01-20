package com.january.egavett.finalproject;

/**
 * Created by Eli Gavett on 1/19/2015.
 */
public class Date {
    private int year; //the year of the date
    private int month; //the month of the date, between 1 and 12
    private int day; //the day of the date, varies based on month
    private int hour; //the hour, 24 hour clock
    private int minute; //the minute, between 0 and 59

    /*
    * Constructor for the Date class
    * Throws an ArithmeticException if isValid() returns false
    * @param int year, month, day, hour, minute
    */
    public Date(int year, int month, int day, int hour, int minute) throws ArithmeticException{
        try {
            if(!isValid(year, month, day, hour, minute))
                throw new ArithmeticException("Date parameters given are not valid.");
            else {
                this.year = year;
                this.month = month;
                this.day = day;
                this.hour = hour;
                this.minute = minute;
            }
        }
        catch(Exception ex){
            System.out.printf("Exception encountered creating a date: %s\n", ex.getMessage());
        }
    }

    /*
    * Accessor method for year
    * @return int year
    */
    public int getYear(){
        return year;
    }

    /*
    * Accessor method for month
    * @return int month
     */
    public int getMonth(){
        return month;
    }

    /*
    * Accessor method for day
    * @return int day
    */
    public int getDay(){
        return day;
    }

    /*
    * Accessor method for hour
    * @return int hour
     */
    public int getHour(){
        return hour;
    }

    /*
    * Accessor method for minute
    * @return int minute
    */
    public int getMinute(){
        return minute;
    }

    /*
    * Checks to se if the date and time given are valid
    * Assumes that leap years are every 4 years
    * @param int year, month, day, hour minute
    * @return boolean if date is valid
    */
    public boolean isValid(int year, int month, int day, int hour, int minute){
        //Any non-valid values?

        //month should be between 1 and 12
        if(month < 1 || month > 12)
            return false;

        //Hour should be between 0 and 23
        if(hour < 0 || hour > 23)
            return false;

        //Minute should be between 0 and 59
        if(minute < 0 || minute > 59){
            return false;
        }

        //Is the day in the given month?

        //day should be greater than 0
        if(day <= 0)
            return false;

        //30 days has September,
        //April, June, and November...
        if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 30)
                return false;
        }
        //...February has 28 alone...
        else if(month == 2){
            //...Except leap year, that's the time,
            //When February's days are 29.
            if(year % 4 == 0){
                if(day > 29)
                    return false;
            }
            else{
                if(day > 28)
                    return false;
            }
        }
        //...All the rest have 31...
        else{
            if(day > 31)
                return false;
        }

        //All parameters valid, return true
        return true;
    }
}



















