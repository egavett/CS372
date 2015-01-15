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
public class Ellipse extends Shape{
    private int r1;
    private int r2;
    
    /*
    * Consturucter for ellips class
    */
    public Ellipse (int r1, int r2) throws ArithmeticException {
            if(r1 < 0 || r2 < 0)
                throw new ArithmeticException("Shape Lengths must be greater than 0");
            this.r1 = r1;
            this.r2 = r2;
    }
    /*
    * Calculates the area of ellipse
    * @return the area of the ellipse
    */
    @Override
    public double getArea(){
        return Math.PI * r1 * r2;
    }
    /*
    * Apporximates the perimeter of the ellipse
    * @return the perimeter of the ellipse
    */
    @Override
    public double getPerimeter(){
        int a = (r1 * r1) + (r2 * r2);
        return 2 * Math.PI * Math.sqrt(a/2);
    }
}
