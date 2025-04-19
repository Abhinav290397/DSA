//Check whether K-th bit is set(i.e 1) or not
import java.util.*;
public class BM03 {
    public static boolean solve(int n,int k){
        int x = 1;
        x <<= k;
        if((n&x) > 0)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bitNumber = sc.nextInt();
        System.out.println(solve(n,bitNumber));
    }
}
