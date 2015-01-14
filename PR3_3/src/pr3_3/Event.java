/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;
import java.util.Comparator;
/**
 *
 * @author Eli Gavett
 */
public class Event {
    private Date date;
    private String name;
    private String location;
    
    /*
    * Constructor for event class
    */
    public Event(String name, String location, int day, int month, int year){
        this.name = name;
        this.location = location;
        date = new Date(day, month, year);
    }
    /*
    * Accessor Method for name
    * @return the instance variable name
    */
    public String getName(){
        return name;
    }
    /*
    * Accessor Method for location
    * @return the instance variable location
    */
    public String getLocation(){
        return location;
    }
    
    /*
    * Accessor Method for date
    * @return the instance variable date
    */
    public Date getDate(){
        return date;
    }
    
    /*
    * Overrides toString function
    * @return String of event name, location, and date
    */
    @Override
    public String toString(){
        String str = "Event: " + name + " | Location: " + location + " | Date: " + date.toString();
        return str;
    }
    
    /*
    * Like toString, but to be used to store data in txt file
    */
    public String storageString(){
        String str = name + " " + location + " " + date.getDay() + " " + date.getMonth() + " " + date.getYear() + " ";
        return str;
    }
    
    /*
    * Comparator Class for sorting event by date, followed by name and location
    */
    public static Comparator<Event> DateComparator = new Comparator<Event>(){
        @Override
        public int compare(Event e1, Event e2){
            int cmp = e1.getDate().compareTo(e2.getDate());
            if(cmp == 0){
                cmp = e1.getName().compareTo(e2.getName());
                if(cmp == 0)
                    cmp = e1.getLocation().compareTo(e2.getLocation());
            }
            return cmp;
        }
    };
    
    /*
    * Comparator Class for sorting event by name, followed by date and location
    */
    public static Comparator<Event> NameComparator = new Comparator<Event>(){
        @Override
        public int compare(Event e1, Event e2){
            int cmp = e1.getName().compareTo(e2.getName());
            if(cmp == 0){
                cmp = e1.getDate().compareTo(e2.getDate());
                if(cmp == 0)
                    cmp = e1.getLocation().compareTo(e2.getLocation());
            }
            return cmp;
        }
    };
    
    /*
    * Comparator Class for sorting event by Location, followed by date and name
    */
    public static Comparator<Event> LocationComparator = new Comparator<Event>(){
        @Override
        public int compare(Event e1, Event e2){
            int cmp = e1.getLocation().compareTo(e2.getLocation());
            if(cmp == 0){
                cmp = e1.getDate().compareTo(e2.getDate());
                if(cmp == 0)
                    cmp = e1.getName().compareTo(e2.getName());
            }
            return cmp;
        }
    };
}