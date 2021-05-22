
package LanjutanAbstrackInterface;


public class televisi extends elektronik implements interface_Elektronik{
    //atribut khusus tv
    private String merk, jenis;
    private double harga, jumlah;
    
//    
//    public televisi(String kode, String merk, String jenis, 
//            double harga, double jumlah) {
//        super(kode);
//    }

    public televisi(String merk, String jenis, double harga, 
            double jumlah, String k) {
        super(k);
        this.merk = merk;
        this.jenis = jenis;
        this.harga = 200000;
        this.jumlah = jumlah;
    }
    
    //getter

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
    
    //memanggil function & prosedur yg ada di interface

    @Override
    public double total() {
        return getHarga()*getJumlah();
    }

    @Override
    public double diskon() {
        double d = total() * 0.05;
        //rumuskan harga setelah didiskon sekaligus
        double setelahDiskon = total()-d;
        return setelahDiskon;
    }

    @Override
    public void cetak() {
        
        System.out.println("Kode Tv\t\t: " + super.getKode());
        System.out.println("Merk Tv\t\t: " + getMerk());
        System.out.println("Jenis Tv\t: " + getJenis());
        System.out.println("Jumlah beli\t: " + getJumlah());
        System.out.println("Harga TV\t: " + getHarga()); //tetap akan mencetak 200.000
        System.out.println("Total bayar\t: "+ total());
        System.out.println("Diskon\t\t: 5%" );
        System.out.println("Total bayar setelah diskon : " + diskon());
    }
    
    

   
    
    
}
