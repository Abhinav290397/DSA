//NGER(Next Greater element in right) in array.(portal)//Rfere janauary lectures for nger,ngel,nser,nsel.
package Stacks;
import java.util.*;
public class Stacks07 {
    //Approach 1
   /*public static void NGE(int arr[],int n){
        Stack <Integer> st1 = new Stack<>();
        int ans [] = new int[n];
        for(int i=n-1;i>=0;i--){
            if(st1.size()==0){
                ans[i] = -1;
            }
            else{
                while(!st1.empty() && st1.peek() <= arr[i]){
                    st1.pop();
                }
                if(st1.size()==0){
                 ans[i] = -1;
                }
                else{
                    ans[i] = st1.peek();
                }
            }f
            st1.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        } 
    }*/
    //Approach 2 [Using indices of array]  Monotonic stack.
    public static void NGE(int arr[],int n){
    Stack<Integer> st1 = new Stack<>();
    int ans[] = new int [n];
     for(int i=0;i<n;i++){
        while(st1.size() >0 && arr[st1.peek()] <= arr[i]){  
            int idx = st1.pop();
            ans[idx] = arr[i];
        }
    
        st1.push(i);
     }
        while(st1.size() > 0){
            int idx = st1.pop();
            ans[idx] = -1;
        }
        for(int idx=0;idx<n;idx++){
           System.out.print(ans[idx]+" ");
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       } 
       NGE(arr, n);
    }
}
