/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_5;
import java.util.Random;
/**
 * This class generates 25 random integers, and compares them to 25 other random integers
 * @author Eli Gavett
 */
public class PR1_5 {

    /**
     * Generates and compares 25 random integers
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int x, y;
        for(int a = 0; a < 25; a++){
            x = rand.nextInt(100);
            y = rand.nextInt(100);
            if(x > y)
                System.out.printf("%d is greater than %d\n", x, y);
            else if(x < y)
                System.out.printf("%d is less than %d\n", x, y);
            else
                System.out.printf("%d is equal to %d\n", x, y);
        }
    }
    
}
