//'this' keyword in constructor.
package OOPS;
import java.util.*;
class Student{
    String name = "Abhinav";
    int rollNum = 1614340003;
    int classNum = 1124;

    Student(String name,int rollNum,int classNum){
        this.name = name;// This means that "Abhinav" becomes "Accio".(It means this.name becomes name)
        this.rollNum = rollNum;//This means that 1614340003 becomes 991
        this.classNum = classNum;//This means that 1124 becomes 44.
    }
}
public class oop0005 {
    public static void main(String[] args) {
        Student s1 = new Student("Accio",991,44);
        System.out.println(s1.name);
        System.out.println(s1.rollNum);
        System.out.println(s1.classNum);
    }
}
