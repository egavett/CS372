/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_3;
/**
 *
 * @author Eli Gavett
 */

//PT -- reuse PR2_1 -2
public class Gerbil {
    private int gerbilNumber;
    private String name;
    public Gerbil(int gerbilNumber, String name){
        this.gerbilNumber = gerbilNumber;
        this.name = name;
    }
    //PT -- javadoc -2
    public void hop(){
        System.out.printf("Gerbil %d is hopping.", gerbilNumber);
        System.out.println();
    }
}
