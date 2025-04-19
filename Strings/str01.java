//3.Basics of strings.
package Strings;
import java.util.*;
public class str01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //** space is also a character in string.
        //** indexing in string also starts from 0.

        //1.Creationn of Strings.
        String s = "Hellow my name is Neural Edge";
        System.out.println(s);//print the string

        //2.To find length of string.
        System.out.println(s.length());

        //3.To find character at given index.
        System.out.println(s.charAt(4));

        //4.To find index of given character.
        System.out.println(s.indexOf('o'));

        //5.To find index of a character after a certain index.
        System.out.println(s.indexOf('o',6));

        //6.To convert entire string into upper case.
        System.out.println(s.toUpperCase());

        //7.To convert entire string into lower case.
        System.out.println(s.toLowerCase());
 
        //8.Replace the one character from other character in string.
        System.out.println(s.replace('l','z'));

        //9.Replace a substring with another.
        System.out.println(s.replace("Hellow","how is the"));
        

        //10.Split functions in string.
        //String [] arr = s.split(""); //In this we are splitting string from where there is space as we write s.split(" ") and convert it into array,We can alse spliting on basis of other characters e.g my/name/is/world...we can writes...split("/").
        String []arr = s.split("e");// split string from 'y'and convert it into array.
        for(String x : arr){
            System.out.println(x);
        }
        //** If there are 2 spaces adjacent and we applied split function around spaces..then adjacent to this space an 
        //-empty string will form. e.g str = "How are you  then that" ==> {"How","are","you","","then","that"}.


        //11.Input taking for string.
        //String t = sc.nextLine(); // It reads the character beyond the space.
       // String t = sc.next(); // It reads the input untill it get space or it gets a new line.
        //System.out.println(t);

        //12.To convert string into character array.
        char []brr = s.toCharArray(); // using this we can convert string into a array of characters. e,g= s = "Falcon Heavy" => arr = {'F','a','l','c','o','n',' ','H','e','a','v','y'}
        System.out.println(s.toCharArray());

        //13. .equals function.Always use this functions while comparing the strings.
        /*String s1 = "hello";
        String s2 = "hello";
        if(s1 == s2)System.out.println("same"); //'==' works here.
        else System.out.println("not same");*/

        String s1 = new String("hello");
        String s2 = new String("hello");

        if(s1 == s2)System.out.println("same"); //'==' fails here,when string created as string objects.
        else System.out.println("not same");

        if(s1.equals(s2))System.out.println("same");//Thats why we use .equals function.
        else System.out.println("not same");

        //14.substring function.
        //Substrings ==> any countigious part of string.
        System.out.println(s.substring(2,11)); //it does not return 11th index..(it return substring.length()-1)
        System.out.println(s.substring(5));


        //15.Strings in java are immutable...i.e once string is made we cant make any change in that.

       //16.Converting string to integer
        String str = "85,90,114,0241,58745,2,21,1";
        String [] StrArray = str.split(","); // array of strings created.
		int[]Arr = new int[StrArray.length-1];  //here we created integer array of size StrArray to store each string as integer.
		for(int i=0;i<StrArray.length-1;i++){
			Arr[i] = Integer.parseInt(StrArray[i]);  //converting each string to integer.
		}
        //Converting string to integer-
        Integer.parseInt("7754843662");
        //17.To convert a int into String
        String.valueOf(108);

        //18.To check a character is Uppercase or not in a string.
        for(int i=0;i<s.length();i++){
            Character.isUpperCase(s.charAt(i));
        }

        //19.To check a character is Uppercase or not in a string.
        for(int i=0;i<s.length();i++){
            Character.isLowerCase(s.charAt(i));
        }

        //20. To convert numeric character to integer we have to do---> ch - '0';
        char ch = '7';
        int x = ch - '0';
        System.out.println(x);

    }
}

