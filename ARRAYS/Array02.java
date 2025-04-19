//Find the avarage.
package ARRAYS;
import java.util.*;
public class Array02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    float sum=0;
    for(int i=0;i<n;i++){
        sum = sum+arr[i];
    }
    float avg = sum/n;
    System.out.println(avg);
  }   
}
