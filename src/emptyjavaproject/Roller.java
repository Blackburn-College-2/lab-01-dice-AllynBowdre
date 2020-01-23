/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author allyn.bowdre
 */
public class Roller {
    
    public Roller(){
        
    }
    
    public static int roll(){
        int num = 0;
        
        num = (int)(Math.random()*6+1);
                
        return num;
    }
}
