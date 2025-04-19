//'this'keyword in function .(imp.)
package OOPS;
import java.util.*;
class Students{
    String name = "Abhinav";
    int rollNum = 19;
    int classNum = 9;
    
    void study(int classNum,int rollNum){
        System.out.println(this.rollNum);
        System.out.println(this.classNum); //if we dont use 'this' keyword then the function will print value-
    }                                       //that we are passing to it. 
}                                       //But as we use 'this' it refers to the values(attributes) of class.
public class oop005 {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.study(1225,1614340003);
        
    }
}
