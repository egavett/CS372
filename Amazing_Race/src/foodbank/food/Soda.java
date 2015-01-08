/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbank.food;

/**
 *
 * @author Eli Gavett
 */
public class Soda extends FoodItem{
    private final String name = "Soda";
    public Soda(int weight, int volume, int expDate) {
        super(weight, volume, expDate);
    }
    public void Drink(){
        System.out.println("Sip. Ahh....");
    }
    
}
