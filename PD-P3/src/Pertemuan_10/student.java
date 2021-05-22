
package Inheritance;

//SUB CLASS 1
public class student extends person {
    //atribut milik class student
    private String program, studyYear;
    
    public student(String n, String gender, int age, String program, String studYear){
        //memanggil atribut class super
        super(n, gender, age); //sesuaikan dg nama parameter student
        
        //deklarasi atribut class student
        this.program = program;
        this.studyYear = studYear;
    }
    
    //method getter
    public String getProgram(){
        return program;
    }
    
    public String getStudyYear(){
        return studyYear;
    }
    
    public String getName(){
        return super.getName();
    }
    
    public String getGender(){
        return super.getGender();
    }
    
    public int getAge(){
        return super.getAge();
    }
    
    //prosedur tambahan
    public void study(){
        System.out.println("MK Pemrograman Dasar Kelas P3");
    }
    
    public void heldExam(){
        System.out.println("Hari ini tidak ada jadwal ujian");
    }
}
