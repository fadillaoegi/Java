package tugas_praktikum_pd_apds02;

import java.io.*;

public class Tugas_2_Praktikum_PD_APDS02 {

    public static void main(String[] args) throws IOException {
       
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        int total = 0, hb = 0, menu = 0, jm = 0, f = 0;
        String br, nt, np, diskon, jb;
        
        br     = null;
        nt     = null;
        np     = null;
        diskon = "";
        jb     = null;
        
        System.out.println(" =================================================== ");
        System.out.println("");
        System.out.println("                  Transaksi_Penjualan                ");
        System.out.println("                       Toko_Buku                     ");
        System.out.println("                       'Undika'                      ");
        System.out.println("              Jl.Gunangwangsa Kec.Rungkut            ");
        System.out.println("");
        System.out.println(" =================================================== ");
        
        
        do {
            
            System.out.println("");
            System.out.println(" ======= Menu_Operasi ======= ");
            System.out.println("");
            System.out.println("1.) Input_Data     ");
            System.out.println("2.) Output_Data    ");
            System.out.println("3.) Keluar_Program ");
            System.out.println("");
            System.out.print("Silahkan_Ketik_di_sini : ");
            menu = Integer.parseInt ( input.readLine () );
            
            switch ( menu ) {
                
                case 1 :
                    
                    System.out.println("");
                    
                    System.out.print("Masukan_No_Trasaksi    : ");
                    nt = input.readLine();
                    
                    System.out.print("Masukan_Nama_Pelanggan : ");
                    np = input.readLine();
                    
                    System.out.print("Masukan_judul_Buku     : ");
                    jb = input.readLine ();
                    
                    System.out.print("Masukan_Jumlah_Buku    : ");
                    jm = Integer.parseInt ( input.readLine() );
                    
                    System.out.print("Masukan_Harga_Buku     : ");
                    hb = Integer.parseInt(input.readLine());
                    
                    total = jm * hb ;
                    
                    if ( total > 150000 ) {
                        
                        f      = total -  (total * 10 / 100 );
                        diskon = "Diskon 10% ";
                        
                    } else if ( total <= 150000 && total >= 0 ) {
                        
                        f      = total;
                        diskon = "Tidak ada";
                        
                    } else {
                        System.out.println("");
                    }
                    
                    break;
                
                case 2 :
                    
                   
                    
                    
                    System.out.println("");
                    
                    System.out.println("No.Transaksi   : " + nt    );
                    System.out.println("Nama_Pelanggan : " + np    );
                    System.out.println("Judul_Buku     : " + jb    );
                    System.out.println("Jumlah_Buku    : " + jm    );
                    System.out.println("Harga_Buku     : " + hb    );
                    System.out.println("Total_Harga    : " + total );
                    System.out.println("Harga_Diskon   : " + f     );
                    System.out.println("Diskon         : " + diskon);
                    
                    System.out.println("");
                    
                    break;
                    
                default:
                    System.out.println(" ======= Terimah_Kasih_Telah_Berkunjung_Di_toko_Kami =======");
                    System.exit (0);
                
            }
                    
            
        } while ( true );
        
    }
    
}
