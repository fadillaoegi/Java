//194101000076
package Tugas_7;

import java.io.*;

public class OOP_Object_Tugas_7_APDS02_19410100076 {

    private String x;
    private int jml, harga;

    public OOP_Object_Tugas_7_APDS02_19410100076() {

    }


    public OOP_Object_Tugas_7_APDS02_19410100076(String x, int jml, int harga) {
        this.x = x;
        this.jml = jml;
        this.harga = harga;
    }

    public String getx() {

        return x;

    }


    public int getjml() {

        return jml;

    }

    public int getharga() {

        return harga;

    }

    public int gettotal() {

        int total = getjml() * getharga();

        return total;

    }

    public void out() {

        System.out.println("=====Menu=====");
        System.out.println("1.) Input_Data");
        System.out.println("2.) Views_Data");
        System.out.println("3.) Edit_Data");
        System.out.println("4.) Keluar_Program");

    }

    public void out_2() {

        System.out.println("===Edit_Data===");
        System.out.println("");

        System.out.println("1.) Ubah Nama");
        System.out.println("2.) Ubah Harga");
        System.out.print("ketik di sini\t: ");

    }

}
