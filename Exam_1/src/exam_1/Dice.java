/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_1;

/**
 *
 * @author Eli Gavett
 */
public class Dice {
    /*
    * Constructer for Dice class
    */
    public Dice(){}
    
    /*
    * rolls the dice, returns a value from 2-12
    */
    public int roll(){
        int d1 = (int)((6 * Math.random())) + 1;
        int d2 = (int)((6 * Math.random())) + 1;
        return d1 + d2;
    }
    /*
    * returns an integer representation of the bet type
    * 0 = under 7, 1 = 7, 2 = over 7
    * @return type
    */
    public int betType(int roll){
        int type;
        if(roll < 7)
            type = 0;
        else if(roll == 7)
            type = 1;
        else
            type = 2;
        return type;
    }
    
}
