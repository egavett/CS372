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
public class Rectangle extends Shape{
    private int width;
    private int height;
    
    /*
    * Constructor for the Rectangle class
    */
    public Rectangle(int width, int height) throws ArithmeticException{
            if(width < 0 || height < 0)
                throw new ArithmeticException("Shape Lengths must be greater than 0");
            this.width = width;
            this.height = height;
            
    }
    /*
    * Calculates the area of the rectangle
    * @return the area of the rectangle
    */
    @Override
    public double getArea(){
        return width * height;
    }
    
    /*
    * Calculates the perimeter of the ellipse
    * @return the perimeter of the ellipse
    */
    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
