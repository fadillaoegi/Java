/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Pradita Maulidya
 */
public class doctor extends person {
    
    private String a, b;
    
    public doctor(String n, String g, int age, String a, String b){
        super(n, g, age);
        this.a = a;
        this.b = b;
    }
    
    
}
