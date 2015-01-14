/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;
/**
 *
 * @author Eli Gavett
 */
public class Date implements Comparable<Date>{
    private int year;
    private int month;
    private int day;
    /*
    * Constructor for Date class;
    */
    public Date(int day, int month, int year) throws ArithmeticException{
        try{
            if(day < 1 || month < 1)
                throw new ArithmeticException("Days and Months must be positive.");
            if(!isInMonth(day, month, year))
                throw new ArithmeticException("Date is not valid.");
            this.day = day;
            this.month = month;
            this.year = year;
        }
        catch(ArithmeticException ex){
            System.out.printf("Arithmetic Exception: %s\n", ex.getMessage());
        }
    }
    
    /*
    * Checks to see if the given day is the given month
    * @param day, month, and year of the date
    * @return a boolean based on the validity of the day
    */
    private boolean isInMonth(int day, int month, int year){
        //30 days have September,
        //April, June, and November...
        if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 30)
                return false;
        }
        //...February has 28 alone...
        else if(month == 2){
            //Except leap year, that's the time,
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
        return true;
    }
    
    /*
    * accessor method for day
    * @return the instance variable day
    */
    public int getDay(){
        return day;
    }
    
    /*
    * accessor method for month
    * @return the instance variable month
    */
    public int getMonth(){
        return month;
    }
    
    /*
    * accessor method for year
    * @return the instance variable year
    */
    public int getYear(){
        return year;
    }
    
    /*
    * Overrides toString
    * @return date in the formate day/month/year
    */
    @Override
    public String toString(){
        String str = day + "/" + month + "/" + year;
        return str;
    }
    
    
    /*
    * Overrides Comparable's compareTo function
    * @Param d2 other Date
    * @return cmp int value used to compare
    */
    @Override
    public int compareTo(Date d2){
        int cmp = Integer.compare(getYear(), d2.getYear());
            if(cmp == 0){
                cmp = Integer.compare(getMonth(), d2.getMonth());
                if(cmp == 0)
                    cmp = Integer.compare(getDay(), d2.getDay());
            }
            return cmp;
    }
}
