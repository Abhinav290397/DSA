//Count no. of words in string.(*words not characters).
package Strings;
import java.util.*;
public class str02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /*String []arr = str.split(" "); //If we give string as s = "Hellow my name is Neural Edge",it will give an array = {"Hello","my","name","is","neural","edge"}...hence no. of words = 6.
        System.out.println(arr.length);*/
        int countSpaces = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ')countSpaces++;
        }
        System.out.println(countSpaces+1);
    }
}
