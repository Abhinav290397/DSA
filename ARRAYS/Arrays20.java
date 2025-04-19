//Delete an element from the given index in an array.
import java.util.Scanner;

public class Arrays20 {
    public static void solve(int arr[],int idx){
        int n = arr.length;
        int ans[] = new int[n-1];
        for(int i=0;i<n;i++){
            if(i < idx){
                ans[i] = arr[i];
            }
            else if(i == idx)continue;
            else{
                ans[i-1] = arr[i];
            }
            
        }
        for(int i=0;i<ans.length;i++){
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
        int idx = sc.nextInt();

        solve(arr,idx);
    }
}
