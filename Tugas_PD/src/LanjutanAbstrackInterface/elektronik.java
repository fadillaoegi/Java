
package LanjutanAbstrackInterface;


abstract class elektronik {
    
    //atribut umum
    protected String kode;
    
    //abstract boleh memiliki constructor, setter, getter
    public elektronik(String k){
        kode = k;
    }
    
    public String getKode(){
        return kode;
    }
    
    //abstract method
//    abstract void cetak();
//    abstract double total();
    
    //tuliskan semua method abstractnya
}
