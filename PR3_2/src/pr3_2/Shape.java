/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2;

/**
 *
 * @author Eli Gavett
 */
public class Shape { 
    /*
    * Abstract method for finding area
    * Must be overridden in subclasses      
    */
    public double getArea() {
        return 0;
    } 
    
    /*
    * Abstract method for finding perimeter
    * Must be overridden in subclasses
    */
    public double getPerimeter() {
        return 0;
    }
}
