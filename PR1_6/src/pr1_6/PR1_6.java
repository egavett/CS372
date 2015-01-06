/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_6;
import java.util.Scanner;

/**
 * This class returns all prime numbers under a maximum value given by the user
 * @author Eli Gavett
 */
public class PR1_6 {

    /**
     * Examines all integers under a maximum value and returns all prime values
     * @param args 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find all primes less than: ");
        int max = input.nextInt();
        boolean isPrime = true;
        System.out.print("The following integers are primes: ");
        for(int a = 1; a <= max; a++){
            for(int b = 2; b < a; b++){
                if(a % b == 0)
                    isPrime = false;
            }
            if(isPrime){
                System.out.printf("%d, ", a);
            }
            isPrime = true;
        }
        System.out.println();
    }
    
}
