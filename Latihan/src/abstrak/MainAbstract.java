
package abstrak;

/*
 *
 * @author 19410100076
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAbstract {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
//        Instance Of Class
        shape triangel = new triangel(0.0, 0.0);
        shape circle = new Circle (0.0);
        
        do {
            
            System.out.println("Pilih Ssalah sat program abstract");
            System.out.println("");
            System.out.println("1.) Menghitung Luas Lingkaran");
            System.out.println("2.) Menghitung Luas Segitiga");
            System.out.println("3.) Keluar Program");
            System.out.println("");
            System.out.print("Ketik_disini : " );
            int m1 = Integer.parseInt(input.readLine());
            
            switch (m1){
                
                case 1 :
                    
                    System.out.println("Menhitung Luas Lingkaran");
                    System.out.println("");
                    System.out.print("Masukan Nilai Radius\t: ");
                    double r = Double.parseDouble(input.readLine());
                    
//                  Dimasukan kedalam constructor
                    circle = new Circle(r);
                    
//                    Untuk Mencetak jika setelah dimasukan Ke contructor
                    circle.GetArea();
                    
                    System.out.println("===Selesai===");
                    break;
                
                case 2 :
                    
                    System.out.println("Menghitung Luas Segitiga");
                    System.out.println("");
                    System.out.print("Masukan Nilai Base\t: ");
                    double b = Double.parseDouble(input.readLine());
                    System.out.print("Masukan Nilai Heigth\t: ");
                    double h = Double.parseDouble(input.readLine());
                    
//                    Dimasukan Ke Kontruktor
                    triangel = new triangel(b, h);
                    
//                    Untuk Mencetak jika setelah dimasukan Ke contructor
                    triangel.GetArea();
                    
                    System.out.println("===Selesai===");
                    break;
                default :
                    
                    System.out.println("Terimah kasi telah mencoba Program saya !");
                    System.exit(0);
            }
            
        } while (true);
        
    }
    
}
