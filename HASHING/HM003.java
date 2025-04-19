//First Element to Occur K Times in an array(portal).
//*** BY USING HASHMAP.***
package HASHING;
import java.util.*;
public class HM003 {
    public static void solve2(int arr[],int n,int k){
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{                         //means if(hm.containsKey(arr[i])).
                int oldval = hm.get(arr[i]); // oldval stores the value associated with arr[i]
                hm.put(arr[i],oldval+1);      //update(increase) the value associated with arr[i] by 1,
            }
            if(hm.get(arr[i]) == k){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        solve2(arr, n, k);
    }
}
