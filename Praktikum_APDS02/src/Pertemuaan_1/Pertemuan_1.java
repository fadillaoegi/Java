
package Pertemuaan_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pertemuan_1 {

                     
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader (System.in) );
        
        int x, y, z ;
        
        int rumus ;
        
        System.out.print("Silahkan_Nilai_sisi : ");
        x = Integer.parseInt(input.readLine());
        
        rumus = x * 4;
        
        System.out.println("jadi keliling persegi adalah " + rumus);
      
    }
    
}
