/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

/**
 *
 * @author Eli Gavett
 */
public class PiCalculator {
    PiCalculator(){
        
    }
    public double calculate(int it){
        double est = 0;
        int div = 1;
        for(int a = 0; a < it; a++){
            if(a % 2 == 0){
                est += (double)(4.0/div);
                div += 2;
            }
            else{
                est -= (double)(4.0/div);
                div += 2;
                
            }
        }
        return est;
    }
    
    public void calculateAll(int it){
        double est = 0;
        int div = 1;
        for(int a = 0; a < it; a++){
            if(a % 2 == 0){
                est += (double)(4.0/div);
                div += 2;
            }
            else{
                est -= (double)(4.0/div);
                div += 2;
                
            }
         System.out.print((a+1) + ": ");
         System.out.println(est);
        }

    }
}
