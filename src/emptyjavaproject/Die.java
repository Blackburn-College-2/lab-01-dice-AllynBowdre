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
public class Die {
    int side ;
    
    public Die(){
        side = 6;

    }
    public int roll(){
        int num = 0;
        Roller run = new Roller();
        num = run.roll();
                
        return num;
    }
    

}





