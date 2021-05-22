import java.io.*;

public class Tugas_3 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        int jm = 0 , menu = 0 , total = 0 , hb = 0 , pg = 0 ;
        String  nb = null ;
              
        System.out.println(" ============ Tugas_3_Pemrograman_dasar =========== ");
        System.out.println("");
        
        
        do {
            
            System.out.println(" ================================================== ");
            System.out.println("");
            
            System.out.println("               Menu_Pilihan_Program                 ");
            System.out.println("               1.) Program_Transaksi             ");
            System.out.println("               2.) Program_Menampilkan_Gambar       ");
            System.out.println("               3.) Keluar_dari_program              ");
            System.out.println("");
            
            System.out.println(" ================================================== ");
            System.out.println("");
            
            System.out.print("Ketik_di_sini : ");
            menu = Integer.parseInt ( input.readLine() );
            
            switch ( menu ) {
                
                case 1 :
                    
                    System.out.println(" ============== Anda_memilih_Program_input =============== ");
                    System.out.println("");
                    
                    System.out.println(" >>>>>>>>>> Input <<<<<<<<<< ");
                    
                    System.out.print(" Masukan_Nama_barang   :  ");
                    nb = input.readLine();
                    
                    System.out.print(" Masukan_Harga_barang  :  ");
                    hb = Integer.parseInt ( input.readLine() );
                    
                    System.out.print(" Masukan_Jumlah_Barang :  ");
                    jm = Integer.parseInt ( input.readLine() );
                    
                    System.out.println("");
                    
                    total = hb * jm ;
                    
                    System.out.println(" >>>>>>>>>> Output <<<<<<<<<< ");
                    
                    System.out.println("Nama_Barang   : " + nb      );
                    System.out.println("Harga_Barang  : " + hb      );
                    System.out.println("Jumlah_Barang : " + jm      );
                    System.out.println("Total_Harga   : " + total   );
                    
                    break;
                    
                case 2 :
                    
                    System.out.println(" ============== Anda_memilih_Program_Gambar =============== ");
                    
                    do {
                        
                        System.out.println(" ===== Menu_Pilihan_Gambar ===== ");
                        System.out.println("1.) Gambar_Segitiga_Siku-siku    ");
                        System.out.println("2.) Gambar_Persegi_Panjang       ");
                        System.out.println("3.) Gambar_Diamond               ");
                        System.out.println("4.) Keluar_dari_Program          ");
                        System.out.println("");
                        System.out.print("Ketik_di_sini : ");
                        pg = Integer.parseInt ( input.readLine() );
                        
                        switch ( pg ) {
                            
                            case 1 :
                                
                                for ( int i = 1; i < 9 ; i++ ){
                                    
                                    for ( int o = 1; o < i ; o++ ) {
                                        
                                        System.out.print(" ?");
                                    }
                                    
                                    System.out.println(" ");
                                }
                                break;
                                    
                            case 2 :
                                
                                for ( int i = 1 ; i <= 7 ; i++ ) {
                                    
                                    for ( int o = 1 ; o <= 8 ; o++ ){
                                        
                                        if ( i == 1 || i == 7 || o == 1 || o == 8 ) {
                                            
                                            System.out.print("?");
                                            
                                        } else {
                                            
                                            System.out.print(" ");
                                            
                                        }
                                    }
                                    
                                    System.out.println(" ");
                                    
                                }
                                break;
                            
                            case 3 :
                                
                                for (int i=1;i<=4;i++){
                                    for(int j=4;j>=i;j--){
                                        System.out.print(" ");
                                    }
                                    for(int k=1;k<=i;k++){
                                        System.out.print("*");
                                    }
                                    for (int l=1;l<=i-1;l++){
                                        System.out.print("*");
                                    }
                                    
                                System.out.println();
                                
                                }
                                for (int i=1;i<=5;i++){
                                    for(int j=1;j<=i-1;j++){
                                        System.out.print(" ");
                                    }
                                    for(int z=5;z>=i;z--){
                                        System.out.print("*");
                                    }
                                    for(int k=4;k>=i;k--){
                                        System.out.print("*");
                                    }
                                    
                                System.out.println("");
                                
                                }
                                
                                
                            default :
                                
                                System.out.println(" =========== Terimah_Kasih_Telah_Mencoba_Program_Saya ========== ");
                                System.exit (0);
                                
                                
                        }
                        
                    }while ( true );
                    
                    
                default :
                    
                    System.out.println(" =========== Terimah_Kasih_Telah_Mencoba_Program_Saya ========== ");
                    System.exit (0);
            
            }
            
            
        } while ( true );
        
        
    }
}
  
        

    
   

