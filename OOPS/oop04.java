//(2.Parameterised Constructors).
package OOPS;
import java.util.*;
public class oop04 {
    static class Student{
        String name;
        int roll_number;
        int rank;

        Student(){
            System.out.println("Inside default constructor");
            name = "Accio";
            roll_number = 000000003;
            rank = 85;
        }

        Student(String a,int rollNum,int Rank){                         //parameterised constructor.
            System.out.println("inside parameterised constructor");
            name = a;
            roll_number = rollNum;
            rank = Rank;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(); //this calling default constructor
        Student s2 = new Student("Abhinav",1614340003,3);//this is calling parameterised constructor

        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
