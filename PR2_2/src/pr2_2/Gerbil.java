/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_2;
import java.util.Iterator;
/**
 *
 * @author Eli Gavett
 */
public class Gerbil{
    private int gerbilNumber;
    
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    
    public void hop(){
        System.out.printf("Gerbil %d is hopping.", gerbilNumber);
        System.out.println();
    }
}
