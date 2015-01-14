/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Eli Gavett
 */
public class EventManager {
    private ArrayList<Event> list;
    
   /*
    * Constructor for EventManager class
    */
    public EventManager(){
        list = new ArrayList<>();
    }
    
    /*
    * adds an event to list
    * @param String name, location
    * @param int day, month, year
    */
    public void addEvent(String name, String location, int day, int month, int year){
        list.add(new Event(name, location, day, month, year));
    }
    
    /*
    * adds an event to list
    * @param Event e
    */
    public void addEvent(Event e){
        list.add(e);
    }
    
    /*
    * sorts list by date
    */
    public void sortByDate(){
        Collections.sort(list, Event.DateComparator);
    }
    
    /*
    * sorts list by name
    */
    public void sortByName(){
        Collections.sort(list, Event.NameComparator);
    }
    
    /*
    * sorts list by location
    */
    public void sortByLocation(){
        Collections.sort(list, Event.LocationComparator);
    }
    
    /*
    * Accessor Method for list
    * @return list of events
    */
    public ArrayList<Event> getEvents(){
        return list;
    }
}
