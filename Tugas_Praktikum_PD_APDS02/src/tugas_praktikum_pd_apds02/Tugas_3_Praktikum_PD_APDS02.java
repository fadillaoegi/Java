
package tugas_praktikum_pd_apds02;

import java.io.*;

public class Tugas_3_Praktikum_PD_APDS02 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        String [][] data_pelanggan = new String [2][7];
        
        int total_harga = 0, diskon = 0 ;
        
        int menu = 0;
        
        System.out.println(" =================================================== ");
        System.out.println("");
        System.out.println("                     Versi_ARRAY 2D                  ");
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
                    
                    for (int i = 0; i < data_pelanggan.length ; i++) {
                        
                        System.out.print("Masukan_nomer_transaksi : ");
                        data_pelanggan[i][0] = input.readLine();
                        
                        System.out.print("Masukan_nama_pelanggan  : ");
                        data_pelanggan[i][1] = input.readLine();
                        
                        System.out.print("Masukan_judul_buku      : ");
                        data_pelanggan[i][2] = input.readLine();
                        
                        System.out.print("Masukan_harga_buku      : ");
                        data_pelanggan[i][3] = input.readLine();
                        
                        System.out.print("Masukan_jumlah_buku     : ");
                        data_pelanggan[i][4] = input.readLine();
                        
                        
                        total_harga  = Integer.parseInt ( data_pelanggan [i][3] ) * Integer.parseInt(data_pelanggan[i][4]);
                        
                        diskon       = Integer.parseInt ( data_pelanggan[i][3]) * Integer.parseInt (data_pelanggan[i][4] )* 10/100;
                        
                        if ( total_harga > 150000 ) {
                            
                            diskon = total_harga - ( total_harga * 10 / 100 );
                            data_pelanggan [i][6] = "diskon 10 %";
                            
                        } else if ( total_harga <= 150000 && total_harga >= 0  ) {
        
                            total_harga = total_harga;
                            data_pelanggan[i][6] = "tidak_mendapat_diskon" ;
                            
                        } else {
                            System.out.println("");
                        }
                        
                        data_pelanggan[i][5] = String.valueOf(total_harga);
                        data_pelanggan[i][6] = String.valueOf(diskon);
//                        data_pelanggan[i][7] = String.valueOf(total_harga);
                        
                    }
                    
                    break;
                
                case 2 :
                    
                    for (int i = 0; i < data_pelanggan.length; i++) {
                        
                    System.out.println("");
                    
                    System.out.println("No.Transaksi   : " + data_pelanggan[i][0]    );
                    System.out.println("Nama_Pelanggan : " + data_pelanggan[i][1]    );
                    System.out.println("Judul_Buku     : " + data_pelanggan[i][2]    );
                    System.out.println("Jumlah_Buku    : " + data_pelanggan[i][3]    );
                    System.out.println("Harga_Buku     : " + data_pelanggan[i][4]    );
                    System.out.println("Total_Harga    : " + total_harga             );
                    System.out.println("Harga_Diskon   : " + diskon                  );
                    System.out.println("Diskon         : " + data_pelanggan[i][0]    );
                    
                    System.out.println("");
                        
                    }
                    
                    
                    
                    break;
                
                default :
                    
                    System.out.println("Terimah_kasih_atas_kunjungan_Anda");
                    System.exit(0);
                    
            }
            
        } while (true);
        
        
        
    }

    
    
}
