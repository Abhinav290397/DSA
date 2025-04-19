//Maximum Distance(Find the maximum distance bw any 2 same elements in array)
package ARRAYS;
import java.util.*;
public class Arrays15 {
    /*public static int findMaxDistance(int[]arr,int n){    //O(n2).
        int maxD = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int dist = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    dist = (j-i);
                    maxD = Math.max(maxD,dist);
                }
            }
        }
        return maxD;
    }*/
    public static int findMaxDistance(int arr[],int n){
        HashMap<Integer,Integer>hm = new HashMap<>();
        int maxlen = -1;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],i);
            }
            else{
                int len = i - hm.get(arr[i]);
                maxlen = Math.max(maxlen,len);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(findMaxDistance(nums, n));
    }
}
