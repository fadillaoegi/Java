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
public class Model {
    
    
    private String nim, nama, prodi, jk, tgl_lahir;
    
    

    public Model(String nim, String nama, String prodi, String jk, String tgl_lahir) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.jk = jk;
        this.tgl_lahir = tgl_lahir;
    }

    public Model() {
        
        
    }
 
    
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getJk() {
        return jk;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }
    
    
   
    
    
}
