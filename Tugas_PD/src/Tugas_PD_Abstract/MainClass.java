package Tugas_PD_Abstract;

/**
 *
 * @author 19410100076
 */
import java.io.*;

public class MainClass  {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        Kendaraan yamaha1  = new Yamaha (0.0, 0.0);
        Kendaraan honda1 = new honda ( 0.0, 0.0);
        
        do {
            
            System.out.println("==== Pilih Merek Kendaraan ====");
            System.out.println("");
            System.out.println("1.) Kendaraan Yamaha");
            System.out.println("2.) Kendaraan Honda");
                    
            System.out.println("3.) Keluar Program");
            System.out.println("");
            System.out.print("Ketik_disini : " );
            int m1 = Integer.parseInt(input.readLine());
            
            switch (m1){
                
                case 1 :
                    
                    System.out.println("Merek Yamaha");
                    System.out.println("");
                    System.out.print("Masukan Harga Kendaraan: ");
                    double h = Double.parseDouble(input.readLine());
                    System.out.print("Masukan jumlah Kendaraan: ");
                    double j = Double.parseDouble(input.readLine());
                    System.out.print("Masukan Warna Pilihan: ");
                    String w = input.readLine();
                    
//                  Dimasukan kedalam constructor
                    yamaha1 = new Yamaha(h,j);
                    
//                    Untuk Mencetak jika setelah dimasukan Ke contructor
                    yamaha1.GetHarga();
//                    yamaha.Getwarna();
                    
                    System.out.println("===Selesai===");
                    break;
                
                case 2 :
                    
                    System.out.println("Menghitung Luas Segitiga");
                    System.out.println("");
                    System.out.print("Masukan Harga Kendaraan\t: ");
                    double hh = Double.parseDouble(input.readLine());
                    System.out.print("Masukan Jumlah Kendaraan\t: ");
                    double hj = Double.parseDouble(input.readLine());
                    System.out.println("Masukan Warna Kendaraan");
                    String hw = input.readLine();
                    
//                    Dimasukan Ke Kontruktor
                    
                    honda1 = new honda(hh, hj);
                    
//                    Untuk Mencetak jika setelah dimasukan Ke contructor
                    honda1.GetHarga();
//                    honda.Getwarna();
                    
                    System.out.println("===Selesai===");
                    break;
                default :
                    
                    System.out.println("Terimah kasi telah mencoba Program saya !");
                    System.exit(0);
            }
            
        } while (true);
        
    }
    
    
}
