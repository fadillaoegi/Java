package Pertemuan_7;

import java.io.*;

public class main_constructor {

    
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //1. instance of class
        konstruktor c = new konstruktor("");
        konstruktor c1 = new konstruktor ("", "");
        
        //2. input data 
        System.out.print("NIM: ");
        String nim = br.readLine();
        System.out.print("Nama: ");
        String nama = br.readLine();
        
        //3. menghubungkan var class main dg var cons
        c1 = new konstruktor (nim,nama);
        
        //4.cetak
        c1.ket();
    }
    
}
