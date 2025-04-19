//static functions/methods.
package OOPS;
import java.util.*;
public class oop08 {
    static class Student{
        String name;
        int rollNum;

        static void bunk(){
            System.out.println("Students bunked the class");
        }
        void play(){
            System.out.println("students are playing in the ground");
        }
    }
    public static void main(String[] args) {
       Student.bunk();  //static objects can be called even without object creation.

       Student s1 = new Student();
       s1.play(); //non static function cant be called without object creation.
    }
}
