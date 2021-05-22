/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.apds02.pkg19410100076;


public class UAS_Model {
    
    private String nama, tipe, gajiH, jumlah, gajiK, potonganpph, Potonganbpjs, gajiB;

    public UAS_Model(String nama, String tipe, String gajiH, String jumlah, String gajiK, String potonganpph, String Potonganbpjs, String gajiB) {
        this.nama = nama;
        this.tipe = tipe;
        this.gajiH = gajiH;
        this.jumlah = jumlah;
        this.gajiK = gajiK;
        this.potonganpph = potonganpph;
        this.Potonganbpjs = Potonganbpjs;
        this.gajiB = gajiB;
    }

    public UAS_Model() {
        
        
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setGajiH(String gajiH) {
        this.gajiH = gajiH;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public void setGajiK(String gajiK) {
        this.gajiK = gajiK;
    }

    public void setPotonganpph(String potonganpph) {
        this.potonganpph = potonganpph;
    }

    public void setPotonganbpjs(String Potonganbpjs) {
        this.Potonganbpjs = Potonganbpjs;
    }

    public void setGajiB(String gajiB) {
        this.gajiB = gajiB;
    }

    public String getNama() {
        return nama;
    }

    public String getTipe() {
        return tipe;
    }

    public String getGajiH() {
        return gajiH;
    }

    public String getJumlah() {
        return jumlah;
    }

    public String getGajiK() {
        return gajiK;
    }

    public String getPotonganpph() {
        return potonganpph;
    }

    public String getPotonganbpjs() {
        return Potonganbpjs;
    }

    public String getGajiB() {
        return gajiB;
    }
    
    
    
    
    
}
