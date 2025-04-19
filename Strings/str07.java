// Sort the string.
package Strings;
import java.util.*;
public class str07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[]arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(new String(arr));
    }
}
