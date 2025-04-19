//PATH SUM 2....Refer LC-112 ans december lecture.

/*Given the root of a binary tree and an integer target, return true 
if the tree has a root-to-leaf path such that adding up all the values 
along the path equals target.*/

package BINARYTREE;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class BTree22 {
    static int idx = -1;
    public static Node buildTree(int arr[],int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node newnode = new Node(arr[idx]);
        newnode.left = buildTree(arr, n);
        newnode.right = buildTree(arr, n);
        return newnode;
    }

    public static boolean solvePathSum(Node root, int sum,int target){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            if((sum + root.val) == target){
                return true;
            }
            else{
                return false;
            }
        }
        boolean left = solvePathSum(root.left,sum+root.val,target);
        boolean right = solvePathSum(root.right,sum+root.val,target);
        boolean res = left || right;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        int target = sc.nextInt();
        BTree22 b1 = new BTree22();
        Node root = b1.buildTree(arr, n);
        System.out.println(solvePathSum(root, 0, target));
    }
}
