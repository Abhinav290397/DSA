package Collections_Framework;
import java.util.*;
public class LearnArraysClass {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12}; 

         //1.Binary Search. //Array must be sorted.
         int idx =  Arrays.binarySearch(arr,7);
         System.out.println(idx);

         //2.Sorting.
         int[]nums = {47,12,25,31,36,78,97,101,3,1,7,1002};
         Arrays.sort(nums);
         for(int i:nums){
            System.out.print(i+" ");
         }
         //3.fill
         int []brr = new int[8];
         Arrays.fill(brr,-1);
    }
}
