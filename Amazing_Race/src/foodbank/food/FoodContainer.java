/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbank.food;
import java.util.ArrayList;
/**
 *
 * @author Eli Gavett
 */
public class FoodContainer {
    private final ArrayList<FoodItem> theContainer;
    
    public FoodContainer(){
        theContainer = new ArrayList<>();
    }
    
    public void addItem(FoodItem item){
        theContainer.add(item);
    }
    
    public int getCount(){
        return theContainer.size();
    }
    
    public int getWeight(){
        int weight = 0;
        for(int a = 0; a < theContainer.size(); a++)
            weight += theContainer.get(a).getWeight();
        return weight;
    }
    
    public int getVolume(){
        int volume = 0;
        for(int a = 0; a < theContainer.size(); a++)
            volume += theContainer.get(a).getVolume();
        return volume;
    }
}
