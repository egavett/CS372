/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_3;
import java.util.*;
/**
 *
 * @author Eli Gavett
 */
public class PR2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Gerbil> gerbils = new HashMap<>();
        String[] names = {"Abigail", "Brenda", "Carter", "Derek", "Ethan", "Fred", "Gavin", "Hugo", "Ivan", "Jack"};
        for(int a = 0; a < 10; a++){
            gerbils.put(names[a], new Gerbil(a+1, names[a]));
        }
        Set<String> nameSet = gerbils.keySet();
        Iterator<String> it = nameSet.iterator();
        String current = "";
        while(it.hasNext()){
            current = it.next();
            System.out.print(current + " ");
            gerbils.get(current).hop();
        }
        
    }
}
