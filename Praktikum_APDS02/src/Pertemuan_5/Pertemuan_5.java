package Pertemuan_5;

import java.io.*;

public class Pertemuan_5 {
    
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //deklarasi array
        String[][] mhs = {{"19001","Adi"},{"19002","Dia"},{"19003","Ida"}};
        String[][] kuliah = {
            {"MK01", "PD", "19001"},
            {"MK02", "DBD", "19001"},
            {"MK03", "PD", "19002"},
            {"MK04", "AUDIT TI", "19002"},
            {"MK05", "TATA KELOLA", "19003"}
        };
        
        int pilihan_menu = 0, pilihan_menu_2 = 0;
        String nama_mk = "";
        ///perulangan menu
        do {            
            System.out.println("== MENU ==");
            System.out.println("1. Menampilkan data mahasiswa");
            System.out.println("2. Menampilkan data kuliah");
            System.out.println("\t 1. Tampilkan semua data");
            System.out.println("\t 2. Tampilkan berdasarkan nama MK");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan menu : ");
            pilihan_menu = Integer.parseInt(br.readLine());
            
            switch(pilihan_menu) {
                case 1 :
                    System.out.println("-- Menampilkan data mahasisawa --");
                    for (int i = 0; i < mhs.length; i++) { //cetak baris
                        for (int j = 0; j < 2; j++) { //cetak isi kolom
                            System.out.println(mhs[i][j] + " "); //19001, Adi    
                        }
                        System.out.println("");
                        
                        
                    }
                    break;
                case 2 :
                    System.out.println("-- Menampilkan data kuliah --");
                    do {                        
                        System.out.println("1. Tampilkan semua data");
                        System.out.println("2. Tampilkan berdasarkan MK");
                        System.out.println("3. Tampilkan data kuliah dengan range nilai");
                        System.out.print("Masukkan pilihan menu 2 : ");
                        pilihan_menu_2 = Integer.parseInt(br.readLine());
                        switch(pilihan_menu_2) {
                            case 1:
                                System.out.println("1. Tampilkan semua data");
                                for (int i = 0; i < kuliah.length; i++) { //cetak baris
                                    for (int j = 0; j < 3; j++) {
                                        System.out.println(kuliah[i][j]);    
                                    }
                                    System.out.println("");
                                }
                                
                                   
                                break;
                            case 2:
                                int ditemukan = 0; //untuk informasi (jika 0 = data tidak ada, 1 = data ada)
                                System.out.println("1. Tampilkan berdasarkan MK");
                                System.out.print("Nama MK : ");
                                nama_mk = br.readLine();
                                //cek dulu dengan perulangan di semua data
                                for (int i = 0; i < kuliah.length; i++) {
                                    //cek apakah data di array kuliah ada yang sesuai dengan inputan kita
                                    if (kuliah[i][1].toLowerCase().contains(nama_mk.toLowerCase())) {
                                        //info data ditemukan
                                        //lower case = mengubah textCase ke huruf kecil semua
                                        //equals = mencocokkan text tanpa memperhatikan
                                        ditemukan += 1;
                                        //cetak kode MK dan nama MK
                                        System.out.println(kuliah[i][0] + " " + kuliah[i][1]);
                                    }
                                }
                                if (ditemukan==0) {
                                    System.out.println("Data tidak ada");
                                }
                                break;
                               
                            case 3 :
                                
                                System.out.println("\tTampilkan data kuliah dengan range nilai");
                                
                                
                                
                                break;
                                
                            default:
                                System.exit(0);
                        }
                    } while (true);
                
                case 3 :
                    System.exit(0);
                    break;
                    
            }
        } while (true);
        
    }
    
}
