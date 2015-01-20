/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4_1;
import java.io.*;
/**
 *
 * @author Eli Gavett
 */
public class Restaurant {
    private String name; //the name of the restuarant
    private String address; //the address of the restuarant
    private String notes; //the user's notes about the restaurant
    private int rating; //the user's overall rating of the restaurant from 0 to 5 stars
    
    /*
    * Constructor for the Restaurant class
    * @param String name, address, notes
    * @param int rating a rating from 0 to 5 stars
    */
    public Restaurant(String name, String address, String notes, int rating) throws ArithmeticException{
        if(rating < 0 || rating > 5)
            throw new ArithmeticException("Ratings must be from 0 to 5 stars");
        else
        {
            this.name = name;
            this.address = address;
            this.notes = notes;
            this.rating = rating;
        }
    }
    
    /*
    * Accessor method for name
    * @return String name
    */
    public String getName(){
        return name;
    }
    
    /*
    * Accessor method for address
    * @return String address
    */
    public String getAddress(){
        return address;
    }
    
    /*
    * Accessor method for notes
    * @reutrn String notes
    */
    public String getNotes(){
        return notes;
    }
    
    /*
    * Accessor method for rating
    * @return int rating
    */
    public int getRating(){
        return rating;
    }
    
    /*
    * Writes review information using a given bufferedwriter;
    * @param BufferedWriter wrtr the writer used by the main program
    */
    public void writeReivew(BufferedWriter wrtr){
        try{
        wrtr.write(name);
        wrtr.newLine();
        wrtr.write(address);
        wrtr.newLine();
        wrtr.write(String.valueOf(rating));
        wrtr.newLine();
        wrtr.write(notes);
        wrtr.newLine();
        }
        catch (Exception ex){
            System.out.printf("Unexpected error writing to disk: %s\n", ex.getMessage());
        }
    }   
}
