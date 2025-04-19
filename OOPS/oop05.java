//'this' keyword.
package OOPS;
import java.util.*;
public class oop05 {
    static class Student{
        String name;
        int roll_Number;
        int rank;
        Student(){
            name = "Accio";
            roll_Number = 1;
            rank = 19;
        }
        Student(String a,int rollNum,int r){
            name = "Abhinav";
            this.name = "Anjali Mathur"; 
            
            roll_Number = 1614340003;

            rank = 1;
        }
        void project(){
            System.out.println("students are building their projects");
        }
        void makeNoise(){
            System.out.println("students are making noise!!!!");
            this.project(); //using 'this' keyword we are calling other function from inside a function.
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Mathur",19,5);
        System.out.println(s1.name);
        System.out.println(s2.name);
        s1.makeNoise();
    }
}
