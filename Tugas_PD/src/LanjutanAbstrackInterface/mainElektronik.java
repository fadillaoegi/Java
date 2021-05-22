
package LanjutanAbstrackInterface;

import java.io.*;
public class mainElektronik {

    public static void main(String[] args) throws IOException {
         BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        //instance of class menggunakan class abstract atau langsung ke sub class
        televisi tv = new televisi(null, null, 0, 0, null);
        kipas kipas = new kipas (null, null, 0, 0, null);
        speaker speaker = new speaker (null, null, 0, 0, null);
               
        do {
            
            System.out.println("==== Menu Pilihan ====");
            System.out.println("");
            System.out.println("1.) Beli Televisi");
            System.out.println("2.) Beli Kipas");
            System.out.println("3.) Beli Speaker");
            System.out.println("4.) Keluar_program");
            System.out.println("");
            System.out.print("Ketik_disini\t: ");
            int menu = Integer.parseInt(input.readLine());
            
            switch (menu) {
                
                case 1 :
                    
                    System.out.println("==== Beli Televisi ====");
                    System.out.println("");
                    
                    System.out.print("Kode Tv\t\t: ");
                    String k = input.readLine();
                    System.out.print("Merk Tv\t\t: ");
                    String merk = input.readLine();
                    System.out.print("Jenis Tv\t: ");
                    String jns = input.readLine();
                    System.out.print("Jumlah Tv\t: ");
                    int jml = Integer.parseInt(input.readLine());
                    
                    System.out.println("");
                    System.out.println("=======================");
        
                    //menghubungkan constructor yg ada di class televisi
                    tv = new televisi(merk, jns, 0, jml, k);
                    tv.cetak();
                    
                    break;
                    
                case 2 :
                    
                    System.out.println("==== Beli Kipas ====");
                    System.out.println("");
                    
                    System.out.print("Kode Kipas\t: ");
                    String ko = input.readLine();
                    System.out.print("Merk Kipas\t: ");
                    String m = input.readLine();
                    System.out.print("Jenis Kipas\t: ");
                    String jn = input.readLine();
                    System.out.print("Jumlah Kipas\t: ");
                    int j = Integer.parseInt(input.readLine());
                    
                    System.out.println("");
                    System.out.println("=====================");
        
                    //menghubungkan constructor yg ada di class televisi
                    kipas = new kipas(m, jn, 0, j, ko);
                    kipas.cetak();
                    
                    break;
                    
                case 3 :
                    
                    System.out.println("==== Beli Speaker ====");
                    System.out.println("");
                    
                    System.out.print("Kode Speaker\t: ");
                    String kod = input.readLine();
                    System.out.print("Merk Speaker\t: ");
                    String me = input.readLine();
                    System.out.print("Jenis Speaker\t: ");
                    String jun = input.readLine();
                    System.out.print("Jumlah Speaker\t: ");
                    int jum = Integer.parseInt(input.readLine());
                    System.out.println("");
                    
                    System.out.println("");
                    System.out.println("=====================");
                    
                    speaker = new speaker(me, jun, 0, jum, kod);
                    speaker.cetak();
                    
                    break;
                    
                default:
                    
                    System.out.println("Terimah Kasih Mencoba Program Saya,Bu!");
                    System.exit(0);
                    
                    
            }
            
        } while (true);
        
        
        
        
        
        
        
    }
    
}
