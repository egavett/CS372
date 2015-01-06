/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_4;
import java.util.Scanner;
/**
 * This class returns the area of a circle based on a radius given by the user
 * @author Eli Gavett
 */
public class PR1_4 {

    /**
     * Takes a radius and returns the area of a circle
     * @param rad the radius of a circle
     * @return the area of a circle with that radius
     */
    final static double PI = 3.14;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the cirle: ");
        int rad = input.nextInt();
        double area = PI * rad * rad;
        System.out.printf("Area is %f\n", area);
    }
    
}
