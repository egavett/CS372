/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
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
    
    public static int maximum(ArrayList<Integer> list){
        int max = list.get(0);
        for(int a = 1; a < list.size(); a++){
            if(max < list.get(a))
                max = list.get(a);
        }
        return max;
    }
    
    public static int minimum(ArrayList<Integer> list){
        int min = list.get(0);
        for(int a = 1; a < list.size(); a++){
            if(min > list.get(a))
                min = list.get(a);
        }
        return min;
    }
    
    public static int average(ArrayList<Integer> list){
        int ave = 0;
        for(int a = 0; a < list.size(); a++)
            ave += list.get(a);
        return ave / list.size();
    }
}
