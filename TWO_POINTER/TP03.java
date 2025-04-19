//4Sum (without unique quqdruplates).
package TWO_POINTER;
import java.util.*;
public class TP03 {
    public static ArrayList<ArrayList<Integer>> FourSum(int arr[],int target){
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int i=0;
        while(i<n){
            int j = i+1;
            while(j<n){
                int l = j+1;
                int r = n-1;
                int newTarget = target - (arr[i] + arr[j]); //i.e sum of arr[l] + arr[r] should be equal to target-(arr[i]+arr[j])
                while(l<r){
                    int currSum = arr[l]+arr[r];
                    if(currSum == newTarget){
                        ArrayList<Integer>al1 = new ArrayList<>();
                        al1.add(arr[i]);
                        al1.add(arr[j]);
                        al1.add(arr[l]);
                        al1.add(arr[r]);
                        ans.add(al1);
                        l++;
                        while(l<r && arr[l] == arr[l-1])l++;

                        r--;
                        while(r>l && arr[r] == arr[r+1])r--;
                    }
                    else if(currSum > newTarget){
                       r--;
                        while(r>l && arr[r] == arr[r+1])r--;
                    }
                    else if(currSum < newTarget){
                        l++;
                        while(l<r && arr[l] == arr[l+1])l++;
                    }    
                }
                j++;
                while(j<n && arr[j] == arr[j-1])j++;
            }
            i++;
            while(i<n && arr[i] == arr[i-1])i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int targetSum = sc.nextInt();
        int[]nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(FourSum(nums,targetSum));
    }
}
