/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.apds02.pkg19410100076;



//import java.util.AbstractList;
import java.util.ArrayList;
//import java.util.*;

public class UAS_Controller {
    
    private ArrayList<UAS_Model> daftarGaji = new ArrayList <>();

    public UAS_Controller() {
        
        
    }
    
    public UAS_Controller (ArrayList<UAS_Model> daftarGaji) {
        
        this.daftarGaji = daftarGaji;
        
    }

    public void setDaftarGaji(ArrayList<UAS_Model> daftarGaji) {
        this.daftarGaji = daftarGaji;
    }
    
    public void insert(String nama, String tipe, String gajiH, String jumlah, 
            String gajiK, String potonganpph, String Potonganbpjs, String gajiB) {
        
        
        UAS_Model md = new UAS_Model (nama, tipe, gajiH, jumlah, gajiK, potonganpph, Potonganbpjs, gajiB);
            
            daftarGaji.add(md);
            
            System.out.println("Data Telah di Insert !!");
            
   
        public int getArraylist () {
            
            return daftarGaji.size
                    
        }
        
        
        
        
        
    }
    
    
}
