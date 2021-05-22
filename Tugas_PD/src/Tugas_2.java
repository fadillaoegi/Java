import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas_2 {

    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        int z,x, f, r, w, total, biaya_ppn;
        
        System.out.println(" ====================================================================== ");
        System.out.println(" ====================== Tugas_2_Pemrograman_Dasar ===================== ");
        System.out.println(" ====================================================================== ");
        
        System.out.println("");
        System.out.println(">>>>>>>>>>>>>>>>>>>>> Selamat_datang_di_Sekolah_Koding <<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("");

        System.out.println("Silahkan_mau_beli_paket_apa_?");
        System.out.println("");
        System.out.println("1.)12 Bulan");
        System.out.println("2.)90 Hari");
        System.out.println("3.)30 bulan");
        System.out.println("");
        System.out.print("Ketik_di_sini : ");
        z = Integer.parseInt(input.readLine());

        System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Transaksi <<<<<<<<<<<<<<<<<<<<<<<<<<<<< ");

        if ( z == 1 ) {

            f = 750000;
            biaya_ppn = 2000;
            total = f + biaya_ppn;
            
            System.out.println("");
            System.out.println("Paket_12 Bulan_di_kenakan_biaya_sebesar : Rp.750.000");
            System.out.println("");
            System.out.println("Apakah_anda_mau_mengambil_baju_sekolah_koding_(Free) : ");
            System.out.println("");
            System.out.println("1.)ya");
            System.out.println("2.)tidak perlu");
            System.out.println("");
            System.out.print("Ketik_di_sini : ");
            x = Integer.parseInt(input.readLine());
            System.out.println("");

            System.out.println("Pembelian_paket_12_bulan");
            System.out.println("");
            System.out.println("Total_Pembayaran_anda : " + f);
            System.out.println("Silahkan_transfer_ke_bank : BCA_18790098765");
            System.out.println("");

            if ( x == 1 ) {

                System.out.println("karna_anda_telah_membeli_paket_12_bulan");
                System.out.println("");
                System.out.println("Anda_mendapatkan_1_buah_baju_sekolah_koding");

            }
            
        } else if ( z == 2 ) {
            
            r = 350000;
            biaya_ppn = 2000;
            total = r + biaya_ppn;
            
            System.out.println("");
            System.out.println("Paket_90_hari_di_kenakan_biaya_sebesar : Rp.350.000");
            System.out.println("");
            System.out.println("Apakah_anda_mau_membeli_juga_baju_sekolah_koding");
            System.out.println("seharga_Rp.50.0000");
            System.out.println("");
            System.out.println("1.)ya");
            System.out.println("2.)tidak perlu");
            System.out.println("");
            System.out.print("Ketik_di_sini : ");
            x = Integer.parseInt(input.readLine());

            System.out.println("");
            System.out.println("Total_Pembayaran_anda : " + total);
            System.out.println("Silahkan_transfer_ke_bank : BCA_18790098765");
            System.out.println("");
            
                if ( x == 1 ) {
                    
                    total = total + 50000;
                    
                    System.out.println("Anda_telah_membeli_baju_sekolah_koding");
                    System.out.println("harga_sebesar_Rp.50.0000");
                    System.out.println("");
                    
                    System.out.println("Pembelian_paket_90_hari_dan_baju");
                    System.out.println("Total_Pembayaran_anda : " + total);
                    
                }
            
        } else if ( z == 3 ) {
            
            w = 200000;
            biaya_ppn = 2000;
            total = w + biaya_ppn;
            
            System.out.println("");
            System.out.println("Paket_30 hari_di_kenakan_biaya_sebesar : Rp.200.000");
            System.out.println("");
            System.out.println("Apakah_anda_mau_membeli_juga_baju_sekolah_koding");
            System.out.println("seharga_Rp.50.0000");
            System.out.println("");
            System.out.println("1.)ya");
            System.out.println("2.)tidak perlu");
            System.out.println("");
            System.out.print("Ketik_di_sini : ");
            x = Integer.parseInt(input.readLine());
            
            System.out.println("");
            System.out.println("Total_Pembayaran_anda : " + w);
            System.out.println("Silahkan_transfer_ke_bank : BCA_18790098765");
            System.out.println("");
            
            if ( x == 1 ) {
                
                total = total + 50000;
                
                System.out.println("Anda_telah_membeli_baju_sekolah_koding");
                System.out.println("harga_sebesar_Rp.50.0000");
                System.out.println("");
                
                System.out.println("Pembelian_paket_30_hari_dan_baju");
                System.out.println("Total_Pembayaran_anda : " + total);
                    
            }
            
        }
        
        System.out.println("");
        System.out.println(" >>>>>>>>>>>>>>>>>>> Terimah_kasih_telah_melakukan_pembelian_paket_sekolah_koding <<<<<<<<<<<<<<<<<");
}
    
}
        


