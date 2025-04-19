//Set bit at kth position
import java.util.*;
public class BM04 {
    public static int solve(int n,int k){
        int x = 1;
        x <<= k;
        int ans = n | x;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  bitNum = sc.nextInt(); // which kth bit we have to set.
        System.out.println(solve(n,bitNum));
    }
}
