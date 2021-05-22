import java.io.*;

public class Tugas_4 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        System.out.println(" ========== Tugas_4_Pemrograman_Dasar ========== ");
        
        String[][] indeks = new String [3][7];
        int menu = 0, na = 0;
        String huruf = null;
        
        do {
            
            System.out.println("=========================================");
            System.out.println("            Program_Input_Nilai          ");
            System.out.println("=========================================");
            System.out.println("");
            System.out.println("     1.) Input Data Nilai Mahasiswa      ");
            System.out.println("     2.) Output Data Nilai Mahasiswa     ");
            System.out.println("     3.) Keluar Dari Program             ");
            System.out.println("");
            
            System.out.print("Ketik_Di_sini : ");
            menu = Integer.parseInt (input.readLine());
            
            switch (menu){
                
                case 1 :
                    
                    for (int i = 0; i < indeks.length; i++) {
                        
                        System.out.print("NIM         : ");
                        indeks[i][0] = input.readLine();
                        
                        System.out.print("Nama        : ");
                        indeks[i][1] = input.readLine();
                        
                        System.out.print("Nama MK     : ");
                        indeks[i][2] = input.readLine();
                        
                        System.out.print("Nilai Tugas : ");
                        indeks[i][3] = input.readLine();
                        
                        System.out.print("Nilai UTS   : ");
                        indeks[i][4] = input.readLine();
                        
                        System.out.print("Nilai UAS   : ");
                        indeks[i][5] = input.readLine();
                        
                        System.out.println("");
                        
                        na = Integer.parseInt(indeks[i][3]) * 40/100 + Integer.parseInt (indeks[i][4]) * 30/100 + Integer.parseInt (indeks[i][5]) * 30/100;
                        
                        if (na >= 80 && na <= 100){
                            
                            huruf = "A";
                            
                        }else if (na >= 75 && na <= 79){
                            
                            huruf = "B+";
                            
                        }else if (na >= 65 && na <= 74){
                            
                            huruf = "B";
                            
                        }else if (na >= 60 && na <= 64){
                            
                            huruf = "C+";
                            
                        }else if (na >= 55 && na <= 59){
                            
                            huruf = "C";
                            
                        }else if (na >= 40 && na <= 54){
                            
                            huruf = "D";
                            
                        }else {
                            
                            huruf = "E";
                            
                        }
                
                    }
                    
                case 2 :
                    
                    for (int i = 0; i < indeks.length; i++) {
                        
                        System.out.println("");
                        
                        System.out.println("NIM        : " + indeks [i][0] );
                        System.out.println("Nama       : " + indeks [i][1] );
                        System.out.println("Nama_MK    : " + indeks [i][2] );
                        System.out.println("Huruf      : " + huruf);
                        
                        System.out.println("");
                    }
                 
                default :
                    
                    System.out.println("<><><><><><><<><><><><> Terimah_Kasih <><><><><><><><><><><><>");
                    System.exit(0);
            }
            
        } while (true);
        
  
        
   
    }
}
