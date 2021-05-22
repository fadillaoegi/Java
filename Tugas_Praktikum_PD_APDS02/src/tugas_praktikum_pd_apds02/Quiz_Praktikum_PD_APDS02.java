package tugas_praktikum_pd_apds02;

import java.io.*;

public class Quiz_Praktikum_PD_APDS02 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        int menu = 0,  pasien = 0, kode = 0;
        
        System.out.println("=============== Quiz Pemrograman Dasar Java ===============");
        System.out.println("");
        
//        Random kp = new Random ();
//        Random kk = new Random ();
           
        int bd =  100000;
        int total;
        
        
        do {
            
            String f;
            
            System.out.print("Inputkan_Jumlah_Pasien : ");
            pasien = Integer.parseInt (input.readLine());
        
            String[][] datapasien       = new String [pasien][8];
            
            System.out.println("=============== Rumah Sakit Prediksi Jaya ===============");
            System.out.println("");
            System.out.println("\t\t 1.) Input Pemeriksaan");
            System.out.println("\t\t 2.) Print Tagihan");
            System.out.println("\t\t 3.) Keluar Program");
            System.out.println("");
            
            System.out.print("Ketik Di sini : ");
            menu = Integer.parseInt(input.readLine());
            
            
            switch (menu) {
                
                case 1 :
                    
                    for (int i = 0; i < datapasien.length; i++) {
                
                    
                        System.out.print("Kode Pasien              : " );
                        datapasien[i][0] = input.readLine();
                    
                        System.out.print("NIK Pasien               : ");
                        datapasien[i][1] = input.readLine();
                        
                        System.out.print("Nama Pasien              : ");
                        datapasien[i][2] = input.readLine();
                        
                        System.out.print("Alamat Pasien            : ");
                        datapasien[i][3] = input.readLine();
                        
                        System.out.print("Diagnosa Penyakit Pasien :  ");
                        datapasien[i][4] = input.readLine();
                        
                        System.out.println("Pilih_Jenis_Perawatan : ");
                        System.out.println("");
                        System.out.println("1.) Rawat Inap");
                        System.out.println("2.) Rawat Jalan");
                        System.out.println("");
                        System.out.print("Ketik di sini : ");
                        int jenisr = Integer.parseInt(input.readLine());
                        
                        if ( jenisr == 1 ) {
                            
                            datapasien[i][5] = "Rawat Inap";
                            int inap = 250000;
                            
                            System.out.print("Berapa hari : ");
                            datapasien[i][6] = input.readLine();
                            
                            total = Integer.parseInt(datapasien[i][6]) * inap;
                            
                            datapasien[i][7] = String.valueOf(total);
                            
                            break;
                            
                            
                            
                        } else {
                            
                            datapasien[i][5] = "Rawat Jalan";
                            
                            int jalan = 150000;
                            
                            total = Integer.parseInt(datapasien[i][6]) * jalan;
                            
                            datapasien[i][7] = String.valueOf(total);
                            
                        }
                        
                
                    }
                    
                    System.out.println("");
                    System.out.println("=========== Input Selesai =========");
                    System.out.println("");
                    
                    break;
                
                case 2 :
                    
                    System.out.println("Masukan Kode Pasien : ");
                    String g = input.readLine();
                    
                    for (int i = 0; i < datapasien.length; i++) {
                    
                        if ( g.equalsIgnoreCase(datapasien [i][0]) ) {
                        
                            System.out.println("Kode pasien      : " + datapasien[i][0]);
                            System.out.println("Nama Paien       : " + datapasien[i][2]);
                            System.out.println("Jenis Perawatan  : " + datapasien[i][5]);
                            System.out.println("Jumlah hari Inap : " + datapasien[i][6]);
                            System.out.println("Total Pembayaran : " + datapasien[i][7]);
                        
                        }
                        
                        
                        
                    }
                    
                    
                    break;
                    
                default :
                    
                    System.out.println(" ========== Terimah Kasih dan Semoga Sehat Selalu ========== ");
                    System.exit(0);
                   
            }
            
            
        } while (true);
        
        
    }
    
}
