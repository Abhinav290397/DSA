//static variables.
package OOPS;
import java.util.*;
public class oop07 {
    static class Student{
        String name;
        static int count = 0;
    
        Student(String a){
        name = a;
        count = count +1;
        }
   }
    public static void main(String[] args) {
        Student s1 = new Student("Ram");
        System.out.println(s1.count);

        Student s2 = new Student("Sam");
        System.out.println(s1.count);

        Student s3 = new Student("Shiv");
        System.out.println(s1.count);

        Student s4 = new Student("Krishn");
        System.out.println(s1.count);
    }
}
