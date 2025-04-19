//Pangram checker.
// A Pangram is a sentence or string in which all letters of english is used atleast once.
package Strings;
import java.util.*;
public class str03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int freq[] = new int [26];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ')continue;
            freq[(str.charAt(i)) - 'a'] = 1;//we dont increase freq for each character instead we just put 1 for
        }                                 //each character. for eg if we have 'a' we put 1 in freq array ....and 
        int sum = 0;                   // if we find 'a' again then we repalce the previous 1 with newer 1(we dont increase it to 2)
        for(int i=0;i<26;i++){
            sum += freq[i];
        }
        if(sum == 26)System.out.println("Pangram");
        else System.out.println("Not Pangram");
    }
}
