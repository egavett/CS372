/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_7;
import java.util.ArrayList;
/**
 *
 * @author Eli Gavett
 */
public class CookieJar {
    private ArrayList<Cookie> theJar;
    
    public CookieJar(){
        theJar = new ArrayList<>();
    }
    
    public void addCookies(int price, int count){
        for(int a = 0; a < count; a++)
            theJar.add(new Cookie(price));
    }
    
    public int getCount(){
        return theJar.size();
    }
    
    public int getValue(){
        int value = 0;
        for(int a = 0; a < theJar.size(); a++){
            value += theJar.get(a).getPrice();
        }
        return value;
    }
    
}
