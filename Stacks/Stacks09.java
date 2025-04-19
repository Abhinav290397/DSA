//Next Greater Element in Left(NGEL)in array(In portal refer it as Previous Greater Element).
package Stacks;
import java.util.*;
public class Stacks09 {
   /*  public static void NGEL(int arr[],int n){
        int ans[] = new int[n];
        Stack<Integer>st1  =new Stack<>();
        for(int i=0;i<n;i++){
            if(st1.size()==0){
                ans[i] = -1;
            }
            else{
                while(st1.size()>0 && st1.peek() <= arr[i]){
                    st1.pop();
                }
                    if(st1.size()==0){
                        ans[i]= -1;
                    }
                    else{
                        ans[i] = st1.peek();
                    }
            }
            st1.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }*/

    public static void NGEL(int arr[],int n){
        Stack<Integer>st1 = new Stack<>();
        int ans[] = new int[n];
        for(int i=n-1;i>=0;i--){
            while(st1.size() > 0 && arr[st1.peek()] <= arr[i]){
                int idx = st1.pop();
                ans[idx] = arr[i];
            }
            st1.push(i);
        }
        while(st1.size()>0){
            int idx = st1.pop();
            ans[idx] = -1;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    NGEL(arr, n);
   } 
}
