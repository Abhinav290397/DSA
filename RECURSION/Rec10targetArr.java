//Find the index of target element in array using recursion
package RECURSION;
import java.util.*;
public class Rec10targetArr {
    public static int find_Index(int index,int arr[],int target){
      if(index == arr.length){
        return -1;
      }
      int sAns = find_Index(index+1,arr,target);
      int ans=0;
      if(arr[index]==target){
        ans = index;
      }
      else{
        ans = sAns;
      }
      return ans;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int index=0;
    int target = sc.nextInt();
    int n = sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(find_Index(index,arr,target));
  }  
}
