/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_2;
import java.util.*;
/**
 *
 * @author Eli Gavett
 */
public class PR2_2{

    public static void main(String[] args) {
        ArrayList<Gerbil> list = new ArrayList<>();
        for(int a = 0; a < 10; a++){
            list.add(new Gerbil(a+1));
        }
        Iterator<Gerbil> it = list.iterator();
        while(it.hasNext()){
            it.next().hop();
        }
    }  
}
