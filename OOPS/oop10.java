//Calling of constructor from parent , child and grand child class.(run this code on gdb online. not working here
// properly).
package OOPS;
import java.util.*;
class Vehicle{
    int wheels;
    Vehicle(){
        System.out.println("Inside Vehicle constructor");
    }
}
class Car extends Vehicle{
    int modelNum;
    Car(){
        System.out.println("We are inside Car constructor");
    }
}
class Tata extends Car{
    String ownerName;
    Tata(){
        System.out.println("We are inside the tata constructor");
    }
}
public class oop10 {
    public static void main(String[] args) {
        Tata t1 = new Tata();

    }
}
