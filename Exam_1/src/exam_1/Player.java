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
public class Player {
    private String name; //Name of the player
    private int cash; //Ammount of funds the player can bet
    
    /*
    * Constructor for a new Player class. Each player begins with $500
    * @param name the player's name
    */
    public Player(String name){
        this.name = name;
        cash = 500;
    }
    
    /*
    * Constructor for an existing Player class
    * @param String name, int cash
    */
    public Player(String name, int cash){
        this.name = name;
        this.cash = cash;
    }
    
    /*
    * Accessor Method for name;
    * @return name
    */
    public String getName(){
        return name;
    }
    
    /*
    * Accesser Method for cash
    * @return cash
    */
    public int getCash(){
        return cash;
    }
    
    /*
    * takes the player's bet away from thier holdings
    * if the player tries to overdraw, return the ammount they can bet, and alerts the player
    * @param bet the ammount the player bets
    * @return amt the value of the player's bet
    */
    public int bet(int bet){
        int amt;
        if(bet > cash){
            amt = cash;
            cash = 0;
            System.out.printf("Insufficient funds. Your bet is now %d.\n", amt);
        }
        else{
            amt = bet;
            cash -= bet;
        }
        return amt;
    }
    
    /*
    * Player has won their bet, add the ammount to their holdings
    * @param amt the ammmount the player has won
    */
    public void winnings(int amt){
        cash += amt;
    }
    
    /*
    * Overrides toString(), used in saving player data to disk
    * @return player name and cash in a String
    */
    @Override
    public String toString(){
        String str = name + " " + cash;
        return str;
    }
}
