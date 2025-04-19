//Max Distance(portal)....Max index(GFG).
package MISCELANEOUS;
import java.util.*;
public class prog02 {
    public static int solve(int arr[],int n){
        int leftMin[] = new int[n];
        leftMin[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMin[i] = Math.min(arr[i],leftMin[i-1]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }
        int maxLen = 0;
        int i=0;//i will moves on leftMin array.
        int j=0;//j will moves on rightMax array.
        while(i<n && j<n){
            if(leftMin[i] <= rightMax[j]){
                int len = j-i;
                maxLen = Math.max(maxLen,len);
                j++;
            }
            else i++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(solve(arr,n));   
    }
}
