//Constructor.(1.Default/Non-parameterised constructors).
package OOPS;
import java.util.*;
public class oop03 {
    static class Student{
        String name;
        int rollNum;
        int rank;
        Student(){
            System.out.println("this is the constructor of student class");
        }
    }
    static class Car{
        String name;
        int modelNum;
        int speed;
        Car(){
            System.out.println("This is the constructor of car class");
            name = "XUV700";
            modelNum = 5525;
            speed = 235;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Car c1 = new Car();

        System.out.println(c1.name);
        c1.name = "Cadilac";
        System.out.println(c1.name);
    }
}
