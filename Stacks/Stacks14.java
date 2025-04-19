//Monster Battle 1...contest question (Refer contest discussion class of 14 may).
package Stacks;
import java.util.*;

public class Stacks14 {
    public static int minimumAttackNeeded(int arr[],int k){
        int attack = 0;
        while(arr[k] > 0){
            for(int i=0;i<arr.length;i++){
                if(arr[i] > 0){
                    attack++;
                    arr[i]--;
                }
                if(arr[k] == 0)return attack;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();      //it is the index of captain monster.
    int arr[] = new int [n];
    for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
    }    
    System.out.println(minimumAttackNeeded(arr,k));
    }
}
