
package Inheritance;

//SUPER CLASS / INDUK
public class person {
    //atribut : name, age, gender
    protected String name, gender;
    protected int age;
    
    //constructor
    public person(String name, String gender, int usia){
        this.name = name;
        this.gender = gender;
        age = usia;        
    }
    
    //method
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public int getAge(){
        return age;
    }
    
    //custom method
    //prosedur 
    public void eat(){
        System.out.println("Orang Indonesia makan nasi");
    }
    
    public void walk(){
        System.out.println("Berjalan");
    }
}
