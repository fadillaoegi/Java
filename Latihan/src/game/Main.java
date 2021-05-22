package game;

import game.Shape;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String pilih="";
        String color="";

        System.out.println("pilih bentuk");
        System.out.println("1.kotak");
        System.out.println("2.segitiga");
        System.out.println("3.segitiga");
        
        System.out.print("Masukan bentuk bangun ruang : ");
        pilih = br.readLine();

        System.out.print("Input warna : ");
        color = br.readLine();

        if(pilih.equalsIgnoreCase("bulat")){
            Shape Bulat=new Bulat();
            Bulat.draw();
            Bulat.color(color);
        }
        if(pilih.equalsIgnoreCase("kotak")){
            Kotak Kotak=new Kotak();
            Kotak.draw();
            Kotak.color(color);
        }
        if(pilih.equalsIgnoreCase("segitiga")){
            Shape Segitiga= new Segitiga();
            Segitiga.draw();
            Segitiga.color(color);
        }



    }


}
