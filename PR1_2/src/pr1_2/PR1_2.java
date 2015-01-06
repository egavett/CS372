/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_2;
import java.util.Scanner;
/**
 *
 * @author Eli Gavett
 */
public class PR1_2 {

    /**
     * Asks User for 2 integers and a String
     * Returns 2 integers and a String
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //Creates Scanner
        System.out.println("Input an integer: "); //Ask for first int
        int int1 = input.nextInt(); //
        System.out.println("Input an integer: "); //Ask for second int
        int int2 = input.nextInt();
        System.out.println("Input a String: ");  //Ask for a String
        String string1 = input.next();
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(string1);
    }
    
}
