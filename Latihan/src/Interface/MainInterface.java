
package Interface;

/**
 *
 * @author 19410100076
 */

import java.io.*;

public class MainInterface {
 
    public static void main(String[] args) throws IOException {
        
    
        BufferedReader input = new BufferedReader ( new InputStreamReader (System.in) );
        
//        Instance Of class cara 1
        Phone p = new Xiomi();
        
//       Instance Of class cara  2
        PhoneUser pu = new PhoneUser(p);
        
        do {
            
            System.out.println("==Menu Operation==");
            System.out.println("");
            System.out.println("1.) Cara 1");
            System.out.println("2.) Cara 2");
            System.out.println("");
            System.out.print("Ketik disini : " );
            int x = Integer.parseInt(input.readLine());
            
            switch (x) {
                
                case 1 :
                    
                    System.out.println("Cara 1");
                    System.out.println("");
                    p.poweron();
                    p.poweroff();
                    
                    break;
                    
                case 2:
                    
                    System.out.println("");
                    System.out.println("Cara 2");
                    System.out.println("");
                    pu.makePhoneLouder();
                    pu.makePhoneSilent();
                    
                    break;
                    
                default :
                    
                    System.out.println("===Thank You===");
                    System.exit(0);
            }
            
        } while (true);
        
        
    }
    
}
