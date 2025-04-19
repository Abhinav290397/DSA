//  COUNT NO. OF PAIRS IN ARRAY WHOSE SUM IS DIVISIBLE BY k.
/*Given an array arr of integers hvaing size n and an integer k..Count the no. of pairs in array whose sum-
-is divisible by k.
Input :
n=5, k=4
arr = {1,2,3,4,5}
Output: 2
....explanation : possible pairs are (1,3) and (3,5)*/


package HASHING;
import java.util.*;
public class HM06 {
    public static int countPairs(int arr[],int n,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count =0;
        for(int i=0;i<n;i++){
            int rem = arr[i]%k;
            if(rem == 0){
                int val = hm.getOrDefault(rem,0); //here...it will go to hashmap and find the rem..if-
                count = count + val;     //it is present in hashmap then it will return the associated value..if rem-
            }                          //-is not present in hashmap then it will return 0 and we store it in val.
            else{
                int val = hm.getOrDefault(k-rem,0);//here...it will go to hashmap and find the k-rem..if-
                count = count + val;   //it is present in hashmap then it will return the associated value..if k-rem-
            }                         //-is not present in hashmap then it will return 0  and we store it in val.           
           
            int oldval = hm.getOrDefault(rem,0);//here...it will go to hashmap and find the rem. if rem 
            hm.put(rem,oldval+1);//-is not present in hm then it will return 0 that we stores in oldval and then we 
        }                             //put the rem in hm and increase oldval by 1 
        return count;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(countPairs(arr, n, k));
 }   
}
