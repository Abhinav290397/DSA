//Column Shooter...contest question (Refer contest discussion class of 14 may).
package Stacks;
import java.util.*;
public class Stacks13 {

    public static int findScore(int arr[],int n){
        Stack<Integer>st1 = new Stack<>();
        int ngel[] = new int[n];       //**needed to be reviewed not working properly
        for(int i=n-1;i>=0;i--){
            while(st1.size() > 0 && arr[st1.peek()] <= arr[i]){
                int idx = st1.pop();
                ngel[idx] = arr[i];
            }
            st1.push(i);
        }
        while(st1.size() > 0){
            int idx = st1.pop();
            ngel[idx] = -1;
        }
        int ans = 0;
        for(int i=0;i<ngel.length;i++){
            if(ngel[i] == -1)continue;
            int distance = i - ngel[i];
            int diff = arr[ngel[i]] - arr[i];
            int score = diff * distance;
            ans = Math.max(ans,score);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findScore(arr, n));
    }
}
