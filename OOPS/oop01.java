package OOPS;
import java.util.*;
public class oop01 {
    static class Student{
        String name;
        int roll_number;
        int class_number;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ram";
        s1.roll_number = 25;
        s1.class_number = 11;

        Student s2 = new Student();
        s2.name = "Laxman";
        s2.roll_number = 29;
        s2.class_number = 10;

        System.out.println(s1.name+" "+s2.name);
    }
}
