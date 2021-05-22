package Pertemuan_4;

import java.io.*;

public class Pertemuan_4 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
//        Array 1D
        
        String[] nama_pelanggan = new String [2];
        String[] nama_baju      = new String [2];
        String[] ukuran         = new String [2];
        
        int[] harga  = new int [2];
        int[] jumlah = new int [2];
        int[] total  = new int [2];
        
        
        for ( int i = 0 ; i < nama_pelanggan.length ; i++ ) {
            
            System.out.print("Nama_Pelanggan : ");
            nama_pelanggan[i] = input.readLine ();
            
            System.out.print("Nama_baju      : ");
            nama_baju[i] = input.readLine ();
            
            System.out.print("Ukuran         : ");
            ukuran [i]   = input.readLine ();
            
            System.out.print("Harga_Baju     : ");
            harga [i] = Integer.parseInt (input.readLine());
            
            System.out.print("Jumlah_baju    : ");
            jumlah [i] = Integer.parseInt (input.readLine());
            
        }
        
        for (int t = 0; t < nama_pelanggan.length; t++) {
            
            
            
        }
    }
    
}
