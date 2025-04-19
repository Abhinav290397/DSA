//Segregate the 0s ans 1s. (GFG)
package ARRAYS;
import java.util.*;
public class Arrays17 {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void segregate(int arr[],int n){
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i] == 1){
                swap(arr,i,j);
                j--;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        segregate(arr,n);
    }
}
