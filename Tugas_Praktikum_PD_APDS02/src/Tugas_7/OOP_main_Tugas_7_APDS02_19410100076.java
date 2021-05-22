//19410100076
package Tugas_7;
import java.io.*;

public class OOP_main_Tugas_7_APDS02_19410100076 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        OOP_Object_Tugas_7_APDS02_19410100076 APDS02 
                = new OOP_Object_Tugas_7_APDS02_19410100076 ("", 0, 0);
        
        
        System.out.println("=======Program Pakai OOP_Construktor=======");
        System.out.println("");
        
        do {
            
            APDS02.out();
            System.out.print("Ketik Di Sini\t: ");
            int u = Integer.parseInt(input.readLine());
            System.out.println("");
            
            switch (u) {
                
                case 1 :
                    
                    System.out.println("===Input_Data===");
                    System.out.println("");
                    
                    System.out.print("Masukan Nama Barang\t: ");
                    String nama = input.readLine();
                    
                    System.out.print("Masukan Jumlah Barang\t: ");
                    int jml = Integer.parseInt(input.readLine());
                    
                    System.out.print("Masukan Harga Barang\t: ");
                    int harga = Integer.parseInt(input.readLine());
                    
                    
                    APDS02 = new OOP_Object_Tugas_7_APDS02_19410100076(nama, jml, harga);
//                    APDS02= new OOP_Object_Tugas_7_APDS02_19410100076(jml, harga);
                    
                    break;
                
                case 2 :
                    
                    System.out.println("===Views_Data===");
                    System.out.println("");
                    
                    System.out.println("Nama Barang\t\t: " + APDS02.getx());
                    System.out.println("Jumlah Barang\t\t: " + APDS02.getjml());
                    System.out.println("Harga Barang\t\t: " + APDS02.getharga());
                    System.out.println("Total Pembayaran\t: " + APDS02.gettotal());
                    
                    break;
                
                case 3 :
                    
                    APDS02.out_2();
                    int out2 = Integer.parseInt(input.readLine());
                    
                    switch (out2) {
            
                        case 1 :
                            
                            
                            System.out.print("Ubah nama Barang: ");
                            String n = input.readLine();
                            
                            APDS02 = new OOP_Object_Tugas_7_APDS02_19410100076(n, APDS02.getjml(), APDS02.gettotal());
                            
                            break;
                
                        case 2 :
                        
                            System.out.print("Masukan Ubah Jumlah barang: ");
                            int j = Integer.parseInt(input.readLine());
                            
                            APDS02 = new OOP_Object_Tugas_7_APDS02_19410100076(APDS02.getx(), j,APDS02.getharga() );
                            break;
            
                    } 
                    
                    
                    
                    break;
                   
                default :
                    
                    System.exit(0);
            }
        } while (true);
        
        
    }
    
}
