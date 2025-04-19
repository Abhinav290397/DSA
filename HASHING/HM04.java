//Missing Numbers(portal).
/*Given two arrays of integers, find which elements in the second array are missing from the first array. If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number. Return the missing numbers sorted in ascending order. Only include a missing number once, even if it is missing multiple times.

Note
If there is no element that is to be printed, print -1.

Output Format
Output array of integers (in increasing order) which tells you elements of second array not present in the first array

Example 1
Input
10 
203 204 205 206 207 208 203 204 205 206 
13 
203 204 204 205 206 207 205 208 203 206 205 206 204

Output
204 205 206*/

package HASHING;
import java.util.*;
public class HM04 {
   
    public static void missingNum(int arr[],int n,int brr[],int m){
        int cnt1[] = new int[10001];
        int cnt2[] = new int[10001];
        for(int i=0;i<n;i++){ 
            cnt1[arr[i]]++;
        }
        for(int i=0;i<m;i++){
            cnt2[brr[i]]++;
        }
        boolean flag = false;
        for(int index=0;index<=10000;index++){
            if(cnt2[index] >0 && cnt1[index]==0){
                System.out.print(index+" ");
                flag = true;
            }
            else if(cnt2[index]>0 && cnt1[index]>0 && cnt2[index]!= cnt1[index]){
                System.out.print(index+" ");
                flag = true;
                
            }
        }
        if(flag == false){
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0;i<m;i++){
            brr[i] = sc.nextInt();
        }
       // missingNum(arr, n, brr, m);
    }
}
