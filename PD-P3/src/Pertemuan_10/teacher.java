package Inheritance;

//SUB CLASS 2
public final class teacher extends person{
    //atribut milik class teacher
    private String designation;
    private int salary;
    
    //construction
    public teacher (String name, String gender, int age, String d, int s){
        super(name, gender, age);
        designation = d;
        salary = s;
    }
    
    //getter
    public String getDesignation(){
        return designation;
    }
    
    public int getSalary(){
        return salary;
    }
    
    //method tambahan
    public void teach(){
        System.out.println("teach");
    }
    
    public void takeExam(){
        System.out.println("take exam");
    }
}
