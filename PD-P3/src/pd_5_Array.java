import java.io.*;

public class pd_5_Array {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        
        try { 
            
            String [] nama = new String [3], nim = new String [3], mk = new String [3], nh = new String [3] ;
            int [] na = new int [3], uts = new int [3] , tugas = new int [3], uas = new int [3] ;
            int total;
            
            for (int i = 0; i < nim.length ; i++) {
                
                System.out.println("ini adalah indek ke- " + i );
                
                System.out.print("Nim               : ");
                nim [i] = input.readLine();
                System.out.println("");
                
                System.out.print("Nama              : ");
                nama [i] = input.readLine();
                System.out.println("");
                
                System.out.println("Input_Mk        :");
                mk [i] = input.readLine();
                System.out.println("");
                
                
                System.out.print("input_nilai_tugas : ");
                tugas [i] = Integer.parseInt ( input.readLine() );
                System.out.println("");
                
                System.out.print("input_nilai_UTS   : ");
                uts [i] = Integer.parseInt ( input.readLine ()) ;
                System.out.println("");
                
                System.out.print("input_nilai_UAS   : ");
                uas [i] = Integer.parseInt ( input.readLine() );
                System.out.println("");
                
//                Hitung_Nilai
                
                na [i] = ( tugas [i] * 4/100 ) + ( uts[i] * 30/100 ) + ( uas [i] * 30/100 );
                System.out.println("Nilai_Anda      : " + na [i]);
                
            }
        
        } catch (Exception e) {
            
        }
        
    }
    
}
