package Tugas_PD_Abstract;

/**
 *
 * @author 19410100076
 */
abstract class Kendaraan {
    
     public String warna ;
    
 //   Method abstract
    abstract double GetHarga ();
    
 //   Method non-abstract
    public String Getwarna (){
        
        return warna;
        
    }
    
}
