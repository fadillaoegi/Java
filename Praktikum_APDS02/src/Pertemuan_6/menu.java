
import java.io.*;


public class menu {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int pilihan=0, harga=0, jumlah=0, total=0;
    static String[][] data = new String[2][5]; 
//    datanya kodebarang, namabarang, harga, jumlah beli, total
    public static void main(String[] args) throws IOException{
        do{
            menu();
            switchCase();
        }while(true);
    }
    
    private static void menu() throws IOException{
        System.out.println("==Toko Barang==");
        System.out.println("1. Input Barang");
        System.out.println("2. Lihat Barang");
        System.out.println("3. Keluar");
        System.out.print("Silakan plih menu : ");
        pilihan =Integer.parseInt(br.readLine());
    }
    
    private static void switchCase() throws IOException{
        switch(pilihan){
            case 1:
                inputData(data);
                break;
            case 2:
                lihatData(data);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
        }
    }
    
    private static void inputData(String[][] input) throws IOException{
        System.out.println("==Input Barang==");
        for(int i=0;i<input.length;i++){
            System.out.print("Kode Barang : ");
            input[i][0]=br.readLine();
            System.out.print("Nama Barang :");
            input[i][1]=br.readLine();
            System.out.print("Harga Barang : ");
            input[i][2]=br.readLine();
            harga=Integer.parseInt(input[i][2]);
            System.out.print("Jumlah Beli :");
            input[i][3]=br.readLine();
            jumlah=Integer.parseInt(input[i][3]);
            hitungTotal();
            input[i][4]=String.valueOf(total);
            System.out.println("");
        }
    }
       
    private static void lihatData(String[][] view) throws IOException{
        System.out.println("==Lihat Barang==");
        for(int i=0;i<view.length;i++){
            System.out.println("Kode Barang : "+view[i][0]);
            System.out.println("Nama Barang : "+view[i][1]);
            System.out.println("Harga Barang : Rp"+view[i][2]);
            System.out.println("Jumlah Beli : "+view[i][3]);
            System.out.println("Total Pembelian : Rp"+view[i][4]);
            System.out.println("");
        }
    }
     
    private static int hitungTotal(){
        total = harga*jumlah;
        return total;
    }
}
