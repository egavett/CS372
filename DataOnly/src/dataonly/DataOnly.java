/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataonly;

/**
 *
 * @author Eli Gavett
 */
class DataOnly {
    static int i = 5;
    static float f = 0;
    static boolean b = false;
    
    public static void main(String[] args){
        DataOnly d = new DataOnly();
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
    }
}
