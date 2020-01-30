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
    
    public int roll(){
        int ans, num = 12;

        ans = (int)(Math.random()*num+1);
                
        return ans;
    }
}
