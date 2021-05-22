
package Inheritance;

import java.io.*;
public class main_person {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        //instance of class
        /*inheritance = sub2 class, super class bisa dipanggil dg instance of class
            jika ada method yg perlu ditampilkan
        */
        
        student s = new student("", "", 0, "", "");
        teacher t = new teacher("", "", 0, "", 0);
        person p = new person("", "", 0);
        
        String nama, gender, program, studyYear;
        int age;
        
        System.out.println("--- INPUT SUB CLASS STUDENT ---");
        System.out.print("Nama : ");
        nama = br.readLine();
        System.out.print("Gender : ");
        gender = br.readLine();
        System.out.print("Age : ");
        age = Integer.parseInt(br.readLine());
        System.out.print("Program : ");
        program = br.readLine();
        System.out.print("Study Year : ");
        studyYear = br.readLine();
        
        s = new student(nama, gender, age, program, studyYear);
        
        System.out.println("-- OUTPUT --");
        System.out.println(s.getName());
        System.out.println(s.getGender());
        System.out.println(s.getAge());
        System.out.println(s.getProgram());
        System.out.println(s.getStudyYear());
        s.study();
        s.heldExam();
        
        
    }
    
}
