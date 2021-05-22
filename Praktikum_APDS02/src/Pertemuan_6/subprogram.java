package Pertemuan_6;




import java.io.*;
public class subprogram {

//DEKLARASI VARIABLE
    static String nama = "Denny", nim="0181";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int tugas=0, uts=0, uas=0, na=0;
    
    
    public static void main(String[] args) throws IOException{
//        namaMhs();
//        System.out.println(tambah());
        
    hitungNilai();

    }
    
//  tempat menulis prosedur/function 
    
    
//    prosedur nama mahasiswa
    private static void namaMhs() throws IOException{
        System.out.print("NIM : ");
        nim = br.readLine();
        System.out.print("Nama : ");
        nama= br.readLine();
        System.out.println("");
        
        System.out.println("NIM Mhs : "+nim);
        System.out.println("Nama Mhs : "+nama);
    }
    
//    function
    private static int tambah(){
        int a=10, b=20, total;
        
        total = a + b;
        
//        error kalau tipe data yang direturn beda
        return total;
    }
    
    private static void hitungNilai() throws IOException{
        System.out.print("Nilai Tugas : ");
        tugas = Integer.parseInt(br.readLine());
        System.out.print("Nilai UTS : ");
        uts = Integer.parseInt(br.readLine());
        System.out.print("Nilai UAS : ");
        uas = Integer.parseInt(br.readLine());
        System.out.println("");
        
         System.out.println("Nilai Akhir : "+nilai(tugas,uts,uas));
    }
    
    private static int nilai(int ntugas, int nuts, int nuas) throws IOException{


        na = (ntugas*40/100)+ (nuts*30/100)+ (nuas*30/100);
//                System.out.println(nilaiakhir);
       
        return na;
    }
}
