/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc;

/**
 *
 * @author Fuck_Boy
 */

import java.util.AbstractList;
import java.util.ArrayList;

public class Controller {
    
    private ArrayList <Model> DaftarMhs = new ArrayList <> ();

    public Controller() {
        
        
    }
    
    
    public Controller (ArrayList<Model> DaftarMhs) {
        
        this.DaftarMhs = DaftarMhs;
        
    }

    public void setDaftarMhs(ArrayList<Model> DaftarMhs) {
        this.DaftarMhs = DaftarMhs;
    }

    public ArrayList<Model> getDaftarMhs() {
        return DaftarMhs;
    }
    
    
    public void insertData (String nim, String nama, String jk, String prodi, String tgl_lahir) {
        
        Model md = new Model (nim, nama, jk, prodi, tgl_lahir);
        
        DaftarMhs.add (md);
        
//        Optional Tampil Terminal
        System.out.println("Input Data Success !!!");
        
    }
    
    public int getArrayListSize () {
        
        return DaftarMhs.size();
        
    }
}
