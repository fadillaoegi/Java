/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package begin;

import java.util.Scanner;

import java.util.*;

/**
 *
 * @author Fuck_Boy
 */
public class Begin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("====================Program ");
        System.out.println("Undika====================");
        System.out.println(" ");
        System.out.println("Silahkan pilih Program : \n 1.Biodata \n 2.Menghitung NA");
        f = scan.nextInt();
        System.out.println(" ");
        System.out.print("====================");
        System.out.println("====================");
        System.out.print("====================");
        System.out.println("====================");
        System.out.println(" ");
         
         if ( f == 1){
             
             System.out.print("====================Program ");
             System.out.println("Biodata====================");
             System.out.println(" ");
            
             System.out.println("Silahkan masukan nama anda :");
             String nama = scan.next();
             
             System.out.println("Silahkan masukan umur anda :");
             int umur = scan.nextInt();
                       
             System.out.println("Silahkan masukan Asal sekolah anda :");
             String asal = scan.next();
             
             System.out.println("Silahkan masukan berat badan :");
             int bb = scan.nextInt();
             
             System.out.println("Silahkan masukan tinggi anda :");
             int tinggi = scan.nextInt();
             
             System.out.println(" ");
             System.out.print("====================");
             System.out.println("====================");
             System.out.print("====================");
             System.out.println("====================");
             System.out.println(" ");
             
             System.out.println("Nama              : " + nama);
             System.out.println("Umur              : " + umur + " tahun");
             System.out.println("Asal Sekolah      : " + asal);
             System.out.println("Berat Badan       : " + bb + " Kg");
             System.out.println("Tinggi Badan      : " + tinggi + " cm");
             
             System.out.println(" ");
             System.out.print("====================");
             System.out.println("====================");
             System.out.println(" ");
            
                     
        } else if (f == 2) {
            
            System.out.print("====================Program");
            System.out.println(" Menghitung NA====================");
             
            System.out.println("Silahkan masukan nama anda :");
            String nama = scan.next();
             
            System.out.println("Silahkan masukan nilai anda :");
            int nilai = scan.nextInt();
            
            System.out.println(" ");
            System.out.print("====================");
            System.out.println("====================");
            System.out.println(" ");
            
            System.out.println("Nama       : " + nama);
            
            int Na = 0;
            
            if ( nilai <= 54 ) {
                
                System.out.println("Nilai anda : " + nilai);
                System.out.println("Grade      : " + "D");
                
            } else if ( nilai >= 55&& nilai <=59){
                
                 System.out.println("Nilai anda : " + nilai);
                 System.out.println("Grade      : " + "C");
            
            } else if ( nilai >= 60 && nilai <= 64 ){
            
                System.out.println("Nilai anda : " + nilai);
                System.out.println("Grade      : " + "C+");
            
            }else if ( nilai >= 65 && nilai <= 74 ) {
            
                System.out.println("Nilai anda : " + nilai);
                System.out.println("Grade      : " + "B");
            
            } else if ( nilai >= 75 && nilai >= 79 ) {
            
                System.out.println("Nilai anda : " + nilai);
                System.out.println("Grade      : " + "B+");
            } else if ( nilai >= 80 && nilai >= 100 ) {
            
                System.out.println("Nilai anda : " + nilai);
                System.out.println("Grade      : " + "A");
            
            }else {
            
                 System.out.println("Maaf, inputan anda tidak ada dalam daftar");
                 System.out.println(" ");
                 System.out.print("====================");
                 System.out.println("====================");
                 System.out.print("====================");
                 System.out.println("====================");
            
                }
         
      
        } else {
            System.out.println("Maaf, inputan anda tidak ada dalam daftar");
             System.out.println(" ");
            System.out.print("====================");
            System.out.println("====================");
            System.out.print("====================");
            System.out.println("====================");
        }

    }
    
}
