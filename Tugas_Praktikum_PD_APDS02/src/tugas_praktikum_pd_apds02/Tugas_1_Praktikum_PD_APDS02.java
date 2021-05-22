package praktikum_pemrograman_dasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas_1_Praktikum_PD_APDS02 {

   
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader (System.in) );
        
        System.out.println(" =================================================================== ");
        System.out.println(" =============== Tugas_1_Praktikum_Pemrograman_Dasar =============== ");
        System.out.println(" =================================================================== ");
        
        int hb, jb, total ;
        String kb, nb;
        
        try {
            
            System.out.println("");
            System.out.println(" ================= Proses_Penginputan_barang =================== ");
            System.out.println("");
            
            System.out.print("Silahkan_inputkan_kode_barang   : ");
            kb = input.readLine();
            
            System.out.print("Silahkan_inputkan_nama_barang   : ");
            nb = input.readLine();
            
            System.out.print("Silahkan_inputkan_harga_barang  : ");
            hb = Integer.parseInt( input.readLine() );
            
            System.out.print("Silahkan_inputkan_jumlah_barang : ");
            jb = Integer.parseInt ( input.readLine() );
            
            
            System.out.println("");
            System.out.println(" ======================= Output_barang ========================== ");
            System.out.println("");
            
            System.out.println("Kode_barang_adalah   : " + kb );
            System.out.println("");
            System.out.println("Nama_barang_adalah   : " + nb );
            System.out.println("");
            System.out.println("Harga_barang_adalah  : " + hb );
            System.out.println("");
            System.out.println("Jumlah_barang_adalah : " + jb );
            System.out.println("");
            
            total = jb * hb;
            System.out.println("Total : " + total );
            
        } catch  (Exception e)  {
            
            System.out.println("Penginputan_tidak_sesuai_format");
            
        }
        
    }
    
}
