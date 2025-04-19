package Strings;
import java.util.*;
public class stringBuilder04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hawaiin Island");
        System.out.println(sb);

        /*System.out.println(sb.charAt(5)); 

        //1.setCharAt() function. ---> to change a character at a given index in the string.
        sb.setCharAt(6,'z');
        System.out.println(sb);

        //2.To insert a new character at a given index in the string.
        sb.insert(3,'a');
        System.out.println(sb);

        //3. To delete a character or substring from string.
        sb.delete(7,8);   //it deletes upto given length - 1 index.
        System.out.println(sb);*/

        //4.APPEND THE STRING...(Append means add the character in string at the last).
        sb.append(" in USA");  //In case of string we have to do like... str += "in USA"
        sb.append(" 50th state"); //                                      str += "50th state"
        System.out.println(sb);     // In string every time there is new string created as we add more words...but in string builder there is same string and changes are made at that same string only.
        System.out.println((sb.length())); // gives length of string builder.
    }
}
