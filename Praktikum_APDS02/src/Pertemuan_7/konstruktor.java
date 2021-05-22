
package Pertemuan_7;
import java.io.*;

public class konstruktor {
    private String nim, nama;
    
    //constructor : menyimpan data/set data/isi data
    //1. diawali dg public
    //2. nama const harus sama dgn nama class
    //3. setter boleh dihilangkan jika suda ada cons
    //4. cons bisa diisi/dibuat lebih dr 1 asalkan jumlah parameternya berbeda
    
    public konstruktor(){
        //nilai default diletakkan disini
        
    }
    
    public konstruktor (String nim){
        this.nim = nim;
    }
    
    public konstruktor (String n, String nama){
        nim = n;
        this.nama = nama;
    }
    
    //getter
    public String getnama(){
        return nama;
    }
    
    public String getnim(){
        return nim;
    }
    //custom method
    public void ket(){
        System.out.println(getnim() + " " + getnama());
    }
    
}
