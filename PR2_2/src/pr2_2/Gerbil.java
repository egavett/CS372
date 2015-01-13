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
//PT -- Reuse the Gerbil in PR2_1, don't copy/paste it here. -2
public class Gerbil{
    private int gerbilNumber;
    
    //PT -- need javadoc. -2
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    
    public void hop(){
        System.out.printf("Gerbil %d is hopping.", gerbilNumber);
        System.out.println();
    }
}
