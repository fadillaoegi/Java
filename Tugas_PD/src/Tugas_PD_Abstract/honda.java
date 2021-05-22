
package Tugas_PD_Abstract;

/**
 *
 * @author 19410100076
 */
public class honda extends Kendaraan {
    
    private double hrg, jml;
//    private String Warna;

    public honda(double hrg, double jml) {
        this.hrg = hrg;
        this.jml = jml;
//        this.Warna = Warna;
    }

//    public String getWarna() {
//        return Warna;
//    }

    
    public double getHrg() {
        return hrg;
    }

    public double getJml() {
        return jml;
    }
    
    

    @Override
    double GetHarga() {
        
        System.out.println("Motor Honda");
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        double total = ( hrg * jml );
        
        System.out.println("");
        System.out.println("Total Pembelian Motor Honda :" + total);

    return total;

    }

//    @Override
//    public String Getwarna() {
//        String warna = Warna;
//        return super.Getwarna(); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
    
}
