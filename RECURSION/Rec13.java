//Return the Arraylist containing all the subdequence of given string//Tough*
/*package RECURSION;
import java.util.*;
public class Rec13 {
    public static ArrayList<String> getSubsequences(String str){
        if(str.length()==0){ // means if there is no element in string create an arraylist fill it by that empty string an dreturn it.
            ArrayList<String>al1 = new ArrayList<>();
            al1.add("");
            return al1;
        }
        char first_Char = str.charAt(0);
        String small_string = str.substring(1);
        ArrayList<String> sAns = getSubsequences(small_string);
        ArrayList<String>ans = new ArrayList<>();

        for(int i=0;i<sAns.size();i++){
            String sub = sAns.get(i);
            ans.add(sub);
        }

        for(int i=0;i<sAns.size();i++){
            String sub = sAns.get(i);
            String ansSub = first_Char+sub;
            ans.add(ansSub);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> subseq = getSubsequences("abcd");
        System.out.println(subseq);
    }
}*/
