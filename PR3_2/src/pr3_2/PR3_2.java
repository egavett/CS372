/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2;
import java.util.ArrayList;
/**
 *
 * @author Eli Gavett
 */
public class PR3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ArrayList<Shape> list = new ArrayList<>();
            list.add(new Rectangle(3, 4));
            list.add(new Triangle(4, 4, 4));
            list.add(new Ellipse(3, 4));
            list.add(new Triangle(7, 3, 3));
        
            for(int a = 0; a < list.size(); a++)
                System.out.printf("Area: %f Perimeter: %f\n", list.get(a).getArea(), list.get(a).getPerimeter());
        }
        catch (ArithmeticException ex){
            System.out.printf("Arithmetic Exception: %s\n", ex.getMessage());
        }
    }
}
