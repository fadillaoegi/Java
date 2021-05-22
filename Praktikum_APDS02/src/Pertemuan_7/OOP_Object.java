package Pertemuan_7;
import java.io.*;

public class OOP_Object {
    
//    Atribut = Variabel
//    Method  = Proseur / fungsi (sub program)
    
//    deklarasi atribut 
//    [access modifier] [Tipe Data] [Nama Variabel]
    
//    private String x,y, u;
    private String merk, tipe, warna;
    private double harga;
    
//    SETTER
    public void smerk (String merk) {
        
        this.merk = merk;
        
//        this. = Untuk membedakan variable class dan variable parameter jika sama; 
    }
    
    public void stipe (String tipe) {
        
        this.tipe = tipe;
        
    }
    
    public void swarna (String warnas) {
        
        warna = warnas;
        
//        Jika Variable class dan Parameternya beda tidak usah pake "this.";
        
    }
    
    public void sharga (double harga) {
        
        this.harga = harga;
        
    }
    
//    GETTER
    public String gmerk(){
        
        return this.merk;
        
    }
    
    public String gtipe(){
        
        return this.tipe;
        
    }
    
    public String gwarna(){
        
        return this.warna;
        
    }
    
    public double gharga(){
        
        return this.harga;
        
    }
    
    public double diskon (){
        
        double d = 0.5 * gharga();
        double total = gharga() - d;
        
        return total;
            
    }
    
    public void deskripsi(){
        
        System.out.println("Thank You");
        
    }
    
}
