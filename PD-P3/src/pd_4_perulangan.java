import java.io.*;

public class pd_4_perulangan {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader (System.in) );
        
//        int x;
//                
//        for ( x = 1; x <= 10 ; x++ ){
//            
//            System.out.println("No "+ x +" Saya tidak akan bercanda lagi");
//        
//    }

//            For Loop Nested

//        for ( int f = 1 ; f <= 5 ; f++ ) {
//            
//            for ( int z = 1 ; z <= f ; z ++ ) {
//                
//                System.out.print(z +" ? ");
//            }
//            
//            System.out.println("");
//        
//    }

//            while Loop
//        int u = 1;
//
//        while (u < 11){
//            
//            System.out.println("Nomer ke- " + u);
//            
//            u++;
//        }
    
//        DO while
        
//        double s, d ;
//        s = 0.0;
//        d =0.0;
//        
//        s += d ;
//        
//        do {
//            
//            System.out.println("Masukan_Angka_Berformat_Double : ");
//            s = Double.parseDouble ( input.readLine() );
//            
//        } while ( s != 0.0 );

        int pilihan, jml, total;
        String nama;
        
        nama = null;
        pilihan = 0;
        
        do {
            
            System.out.println(" ======= Menu_Pilihan =======");
            System.out.println("");
            
            System.out.println("1.) Makanan");
            System.out.println("2.) Minuman");
            System.out.println("3.) Keluar_program");
            System.out.println("");
            
            System.out.println("");
            System.out.print("Masukan)pilihan_anda : ");
            
            switch (pilihan) {
                
                case 1 :
                    
                    System.out.println("======= Makanan =======");
                    System.out.println("Masukan_nama_makanan   : ");
//                    nama = readLine ();
                    
                    System.out.println("Masukan_Jumlah_makanan : ");
                    
                    System.out.println("Masukan_harga_makanan  : ");
                    break;
                
                case 2 :
                    
                   System.out.println("======= Minuman =======");
                   break;
                
                default:
                    
                    System.out.println("Terimah_Kasih_Atas_Kunjungan_Anda");
                    System.exit (0);
            }
            
        } while (true);
}
}
