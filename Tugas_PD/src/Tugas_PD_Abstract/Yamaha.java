package Tugas_PD_Abstract;

/**
 *
 * @author 19410100076
 */
public class Yamaha extends Kendaraan {
    
    private double jumlah, harga;
//    private String Warna;

    public Yamaha(double jumlah, double harga) {
        this.jumlah = jumlah;
        this.harga = harga;
//        this.warna = warna;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }
    
    
    

    @Override
    double GetHarga() {
        
        System.out.println("Motor Yamaha");
        
        double total = ( getJumlah() * getHarga() );
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Total Pembelian motor Yamaha\t: " + total);

        return total;
                
    }

//    @Override
//    public String Getwarna() {
//        
//        String warna = Warna;
//        
//        return super.Getwarna(); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
}
