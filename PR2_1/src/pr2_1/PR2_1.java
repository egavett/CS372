/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_1;
import java.util.ArrayList;
/**
 *
 * @author Eli Gavett
 */
public class PR2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gerbil> list = new ArrayList<>();
        for(int a = 0; a < 10; a++){
            list.add(new Gerbil(a+1));
        }
        
        for(int b = 0; b <10; b++){
            list.get(b).hop();
            
        }
    }
    
}
