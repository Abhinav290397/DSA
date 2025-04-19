//Attribites and functions of class.
package OOPS;
import java.util.*;
public class oop02 {
    static class Student{
        String name;
        int rollnum;
        int rank;

        void study(){
            System.out.println("students are studying");
        }
        void play(){


            System.out.println("students are playing");
        }
        void project(){
            System.out.println("students have to build their projects");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study();
        s1.play();
        s1.project();
    }
}
