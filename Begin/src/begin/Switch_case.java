/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package begin;

import java.util.*;
/**
 *
 * @author Fuck_Boy
 */
public class Switch_case {
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner (System.in);
        
//        System.out.println("Masukan Nilai nya, GOBLOK...!!");
//        int x = scan.nextInt();
//        
//        String y = "Bilangan Prima";
//        
//        if (x >= 2) {
//            
//            for (int z = 2; z < x; z++) {
//                
//                if (x % z == 0 ){
//                    
//                    System.out.println("Bukan Bilangan Prima");
//                    break;
//                }
//                
//            }
//        
//        }else {
//            System.out.println("Ganjil,COK...");
//        }
//        
//        System.out.println("Bilangan " + x + " adalah " + );
       
//        System.out.println("Melbokno COk inputan mu :");
//        int x = 1;
        
    // Ganjil Genap
//      for (int x = 1; x <= 10 ; x++){
//        
//        if ( x % 2 == 0 ) {
//            System.out.println("Bilangan " + x + " = " + "Genap");
//        }else {
//            System.out.println("Bilangan " + x + " = " + "Ganjil");
//        }
        
    //Ganjil, Genap, Prima
    
      String jenis, bilangan;
      
      int batas = 0;
      
      if (batas >= 2){
          
          jenis = "Bilangan Prima";
          
          for (int x = 2; x <= batas ; x++){
              
              if ( x % 2 == 0){
                  
                  bilangan = "genap";
                  
              }else {
                  
                  bilangan = "ganjil";
                  
              }
              
              for (int f = 2; x < f; f++){
                  
                  if (f%x==0){
                      
                      jenis = "Bilangan bukan prima";
                      break;
                  
              }
              
          }
          
              System.out.println("Angka " + x + " bilangan " + bilangan + " dan " + jenis);
      }
        
    }
        
        
    }
    
    
     
    
    
    
    
    
}
  