//Minimum distance between two given numbers in ans array(portal and GFG)
package ARRAYS;
import java.util.*;
public class Array09 {
    public static int solve(int arr[],int x,int y){
        int n = arr.length;
        int prev = -1;
        int minDis = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] == x || arr[i] == y){
                if(prev != -1 && arr[prev] != arr[i]){
                    minDis = Math.min(minDis,(i - prev));
                }
                prev = i;
            }
        }
        if(minDis == Integer.MAX_VALUE)return -1;
        return minDis;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solve(nums,X,Y));
    }
}
