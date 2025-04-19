//Toggle the string.(i.e change uppercase letter to lowercase and vice vera).
//e.g => AbhInaV --> aBHiNAv  ; MAthUr@#1& --> maTHuR@#1&.
package Strings;
import java.util.*;
public class str05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[]arr = s.toCharArray(); //converting string to character array.
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(ch >= 65 && ch <= 90){    //65 - 90 ASCII value for A TO Z.
                char toggle =(char) (ch + 32); //adding 32 to ascaii value of capital letter will convert it into small letter
                arr[i] = toggle;
            }
            else if(ch>=97 && ch<=123){    //97 - 123 ASCII value for a to z.
                char toggle = (char)(ch - 32); //subtracting 32 from ascii of small letter will convert it into capital letter
                arr[i] = toggle;
            }
        }
        String ans = new String(arr); //It doing the same task as below done by for loop. but it takes very less time.
       /* String ans = "";
        for(int i=0;i<arr.length;i++){  //In this case every time a new string object is created thats why take large time.
            ans += arr[i];
        }*/
        System.out.println(ans);
    }
}
