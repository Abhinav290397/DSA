//1.Inheritance.
package OOPS;
import java.util.*;
class Vehicle{
    int numOfWheels;
    String colour;

    void sound(){
        System.out.println("Vehicles are making sound");
    }
}
class Car extends Vehicle{
    int model_num;
    void carSound(){
        System.out.println("car is making sound");
    }
}
class Bike extends Vehicle{
    int milage;
    void runs(){
        System.out.println("Bike runs faster");
    }
}
public class oop09 {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.model_num = 991;
        c1.numOfWheels = 4;  //child class have all the attributes of parent class.
        c1.colour = "White";

        System.out.println(c1.model_num+" "+c1.numOfWheels+" "+c1.colour);

        c1.carSound();
        c1.sound();

        Bike b1 = new Bike();  //for bike class we use vehicle class as parent class, hence Inheritance promote-
        b1.milage = 35;          //-reusability of code.
        b1.numOfWheels = 2;    //child class have all the attributes of parent class.
        b1.colour = "white";
        System.out.println(b1.milage+" "+b1.numOfWheels+" "+b1.colour);
        b1.runs();
    }
}
