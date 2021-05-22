package Pertemuan_7;
import java.io.*;

public class OOP_Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        
        OOP_Object oop_main = new OOP_Object();
        
        do {
            
            System.out.println("inputan :");
            System.out.println("1.) blabla");
            System.out.println("2.) blabli");
            System.out.println("3.) blablo");
            System.out.println("3.) keluar");
            System.out.print("ketik_di_sini :");
            int x = Integer.parseInt(input.readLine());
            
            switch (x) {
                
                case 1: 
                    
                    System.out.println("=====INPUTAN=====");
                    
                    System.out.print("Input merek :");
                    String y = input.readLine();
                    System.out.print("ini juga tipe : ");
                    String k = input.readLine();
                    System.out.print("ini juga warna: ");
                    String h = input.readLine();
                    System.out.print("kalok ini harganya : ");
                    double c = Double.parseDouble(input.readLine());
                    
                    
                    oop_main.smerk(y);
                    oop_main.stipe(k);
                    oop_main.swarna(h);
                    oop_main.sharga(c);
                    
                    break;
                case 2 :
                    
                    System.out.println("=====OUTPUT=====");
                    
                    System.out.println("ini adalah " + oop_main.gmerk() );
                    System.out.println("ini adalah tipe  : " + oop_main.gtipe() );
                    System.out.println("ini adalah warna : " + oop_main.gwarna() );
                    System.out.println("ini adalah harga : " + oop_main.gharga() );
                    System.out.println("ini adalah Diskon: " + oop_main.diskon() );
                    
                    break;
                case 3 :
                    
                    System.out.println("Input Sembarang :");
                    System.out.println("ini juga tipe");
                    System.out.println("ini juga warna");
                    break;
                default:
                    
                    oop_main.deskripsi();
                    System.exit(0);
                
            }
            
        } while (true);
        
        
    }
    
}
