//Problem With Given Difference(portal).

/*Given an one-dimensional unsorted array A containing N integers.
You are also given an integer B. Find if there exists a pair of elements in the array whose difference is B.
Print 1 if any such pair exists else print 0.*/
/*Example 
Input
6
5 10 3 2 50 80
78

Output
1

Explanation
Pair (80, 2) gives a difference of 78.*/


package HASHING;
import java.util.*;
public class HM05 {
    //***USING HASHMAP ***
     public static int solution1(int arr[],int n,int k){
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i]+k)|| hm.containsKey(arr[i]-k)){
                return 1;
            }
            else{
                hm.put(arr[i],1);
            }
        }
        return 0;
    }
    //***USING BRITTE FORCE***
    /*public static int solution2(int arr[],int n,int k){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]-arr[j]==k || arr[j]-arr[i]==k){
                    return 1;
                }
            }
        }
        return 0;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution1(arr, n, k));
        //System.out.println(solution2(arr, n, k));
    }
}
