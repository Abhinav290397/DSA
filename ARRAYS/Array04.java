//Given an sorted array and a target. find the index of target if it is found in array.If target is not present
//in array then find index in which it will placed if it is present.(only in sorted array).
package ARRAYS;
import java.util.*;
public class Array04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
            if(arr[i] < target){
                index++;
            }
        }
        System.out.println(index);
    }
}
