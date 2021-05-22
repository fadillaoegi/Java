
package LanjutanAbstrackInterface;

/**
 *
 * @author 19410100076
 */
public class kipas extends elektronik implements interface_Elektronik {
    
    private String merk, jenis;
    private double harga, jumlah;

    public kipas(String merk, String jenis, double harga, double jumlah, String k) {
        super(k);
        this.merk = merk;
        this.jenis = jenis;
        this.harga = 100000;
        this.jumlah = jumlah;
    }

    public String getMerk() {
        return merk;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    public double getJumlah() {
        return jumlah;
    }
    
    

    @Override
    public double total() {
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return getHarga()*getJumlah();

    }

    @Override
    public double diskon() {
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0.0;

    }

    @Override
    public void cetak() {
      
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kode kipas\t\t: " + super.getKode());
        System.out.println("Merk kipas\t\t: " + getMerk());
        System.out.println("Jenis kipas\t\t: " + getJenis());
        System.out.println("Jumlah Beli kipas\t: " + getJumlah());
        System.out.println("Harga kipas\t\t: " + getHarga()); 
        System.out.println("Total bayar\t\t: "+ total());
        
    }
    
    
}
