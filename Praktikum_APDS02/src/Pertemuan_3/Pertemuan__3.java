package Pertemuan_3;

import java.io.*;

public class Pertemuan__3 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        int usia;
        System.out.print("Masukan_usia : ");
        usia = Integer.parseInt ( input.readLine() );
        
        if ( usia == 17 ){
            
            System.out.println("Anda_sudah_dapat_mengurus_KTP");
            
        } else {
            
            System.out.println("Anda_belum_dapat_mengurus_KTP");
        }
        
        int x, y ;
        
        System.out.print("Inputkan_Angka");
        x = Integer.parseInt ( input.readLine() );
        
    }
    
}
