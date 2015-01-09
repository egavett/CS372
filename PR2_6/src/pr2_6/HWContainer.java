/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_6;
import java.util.ArrayList;
/**
 *
 * @author Eli Gavett
 */
public class HWContainer {
    public ArrayList<HomeWork> theContainer;
    
    public HWContainer(){
        theContainer = new ArrayList<>();
    }
    
    public void addHomeWork(HomeWork newHW){
        theContainer.add(newHW);
    }
    
    public int average(){
        int total = 0;
        for(int a = 0; a < theContainer.size(); a++)
            total += theContainer.get(a).getScore();
        return total / theContainer.size();
    }
    
    public int min(){
        int min = theContainer.get(0).getScore();
        for(int a = 1; a < theContainer.size(); a++){
            if(min > theContainer.get(a).getScore())
                min = theContainer.get(a).getScore();
        }
        return min;
    }
    
    public int max(){
        int max = theContainer.get(0).getScore();
        for(int a = 1; a < theContainer.size(); a++){
            if(max < theContainer.get(a).getScore())
                max = theContainer.get(a).getScore();
        }
        return max;
    }
}
