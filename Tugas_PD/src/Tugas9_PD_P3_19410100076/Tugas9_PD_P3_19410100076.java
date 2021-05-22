//19410100076
package Tugas9_PD_P3_19410100076;

import java.io.*;

public class Tugas9_PD_P3_19410100076 {
    
    static BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
    protected static int p, l, l_k;
    protected static double j, t_v;
    
    protected static void sub_1 () {
        
        System.out.println("==== Menu ====");
        System.out.println("1.) Kerajinan Kayu");
        System.out.println("2.) Kerajinan Rotan");
        System.out.println("3.) Exit Program");
        System.out.print("Ketik Di sini\t: ");
        
    }
    
    protected static void sub_2 () {
        
        System.out.println("===Kerajian Kayu===");
        System.out.println("");
        
    }
    
    protected static void sub_3 (){
        
        System.out.println("===Kerajian Rotan===");
        System.out.println("");
        
    }
    
    protected static int keliling_kayu () {
        
        int r_k = ( 2 * p + 2 * l );
        
        return (r_k);
    }
    
    protected static int luas_kayu(){
        
        l_k = p * l;
        
        return l_k;
    }
    
    protected static double luas_bola (){
        
        double l_b = (4 * Math.PI * j * j);
        
        return l_b;
    }
    
    protected static double volume_bola () {
        
        t_v = 4/3 * Math.PI * j * j;
        
        return t_v;
    }
    
    protected static void exit(){
        
        System.out.println("");
        System.out.println("!!! Sampai Jumpa Lagi !!!");
        System.out.println("");
        
    }
    
    public static void main(String[] args) throws IOException {
        
        do {
            
            sub_1();
            int x = Integer.parseInt (input.readLine());
            
            switch (x) {
                
                case 1 :
                    
                    sub_2();
                    System.out.print("Inputkan Jenis Kerajinan kayu : ");
                    String k = input.readLine();
                    System.out.print("Input Panjang\t\t\t: ");
                    p = Integer.parseInt (input.readLine());
                    System.out.print("Input Lebar\t\t\t: ");
                    l = Integer.parseInt (input.readLine());
                    
                    System.out.println("");
                    System.out.println("Keliling\t: " + keliling_kayu() + "cm");
                    System.out.println("Luas\t: " + luas_kayu() + "cm");
                    
                    break;
                   
                case 2 :
                    
                    sub_3();
                    System.out.print("Inputkan Jenis Kerajinan Rotan : ");
                    String r = input.readLine();
                    System.out.print("Input Jari-jari\t\t: ");
                    j = Double.parseDouble (input.readLine());

                    System.out.println("Luas\t\t\t: " + luas_bola() + "cm");
                    System.out.println("Volume\t\t\t: " + volume_bola() + "cm");
                    
                    break;
                    
                default :
                    
                    exit();
                    System.exit(0);
                
            }
            
        } while (true);
        
        
    }
    
}
