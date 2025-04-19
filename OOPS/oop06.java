//'static' keyword.
package OOPS;
import java.util.*;
public class oop06 {
    static class Car{
        int model_Num;
        String  owner_name;
         static String company = "Toyota";
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model_Num = 559;

        Car c2 = new Car();
        c2.model_Num = 994;

        Car c3 = new Car();
        c2.model_Num = 470;

        System.out.println(c1.company);
        System.out.println(c2.company);
        System.out.println(c3.company);

        c1.company = "Mahindra";
        
        System.out.println(c1.company);
        System.out.println(c2.company);
        System.out.println(c3.company);
         
    }
}
