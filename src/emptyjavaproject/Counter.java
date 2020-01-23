
package emptyjavaproject;

/**
 *
 * @author allyn.bowdre
 */
import java.util.Scanner;
public class Counter {
    
    public Counter(){
        
    }
    
    public void count(){
        int [] amnts;
        amnts = new int [7];
        int m,n;
        Scanner in = new Scanner(System.in);
        System.out.print("How often should I print: ");
        n = in.nextInt();
        int idk = 2, num = 0;
        int percent;
        
        for(int i = 1 ; i<idk; i++){
            idk ++; 
            
             num = Roller.roll();
             
             amnts[num]++;
             
             if(i%n==0){
                 System.out.println("After " + i +" rolls, the distribution is:");
                 for (int x = 1; x<amnts.length;x++){
                     percent=(int)(Math.round(((double)amnts[x]/i)*100));
                     System.out.println(x + " was rolled " + amnts[x] + " times (+" + percent+"%)");
                 }
             }
        }
        
       
    }
}
