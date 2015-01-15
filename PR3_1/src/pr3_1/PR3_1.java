/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This Class takes in 10 integer values and prints the maximum, average, and minimum values
 * Throws an exception if the the input is not an integer
 * @author Eli Gavett
 */
public class PR3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input 10 Integers:");
        
        try{
           for(int a = 0; a < 10; a++){
              System.out.printf("%d: ", a+1);
              list.add(input.nextInt());
        }
        System.out.printf("Maximum: %d\n", maximum(list));
        System.out.printf("Mimimum: %d\n", minimum(list));
        System.out.printf("Average: %d\n", average(list));
        }
        catch (Exception ex){
            System.out.printf("Input was not an integer: %s\n", ex.getMessage());
        }
    }
    
    /*
    * Searches an arraylist of integers and returns the maximum value
    * @param list the ArrayList
    * @return max the maximum value
    */
    public static int maximum(ArrayList<Integer> list){
        int max = list.get(0);
        for(int a = 1; a < list.size(); a++){
            if(max < list.get(a))
                max = list.get(a);
        }
        return max;
    }
    
    /*
    * Searches an arraylist of integers and reutrns the minimum value
    * @param list the Arraylist
    * @return min the minimum value
    */
    public static int minimum(ArrayList<Integer> list){
        int min = list.get(0);
        for(int a = 1; a < list.size(); a++){
            if(min > list.get(a))
                min = list.get(a);
        }
        return min;
    }
    /*
    * Adds up the values of integers in an ArrayList and returns the average
    * @param list the ArrayList
    * @return ave the average value
    */
    public static int average(ArrayList<Integer> list){
        int ave = 0;
        for(int a = 0; a < list.size(); a++)
            ave += list.get(a);
        return ave / list.size();
    }
}
