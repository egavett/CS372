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
public class Triangle extends Shape{
    private int s1;
    private int s2;
    private int s3;
    
    public Triangle(int s1, int s2, int s3) throws ArithmeticException{
        if((s1 + s2) < s3 || (s1 + s3) < s2 || (s2 + s3) < s1)
            throw new ArithmeticException("Invalid Triange Lengths");
        if(s1 < 0 || s2 < 0 || s3 < 0)
            throw new ArithmeticException("Shape Lengths must be greater than 0");
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    public double getPerimeter(){
        return s1 + s2 + s3;
    }
    
    
    /*
    * Uses Heron's Formula to find the area of the Triangle
    */
    @Override
    public double getArea(){
        double p = getPerimeter()/2;
        double input = p * (p - s1) * (p - s2) * (p - s3);
        return Math.sqrt(input);
    }
}
