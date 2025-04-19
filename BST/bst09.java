//Validate BST  (It means check wheather the given tree is a BST or not).
package BST;
import java.util.*;
public class bst09 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node Root,int val){
        if(Root == null){
            Root = new Node(val);
            return Root;
        }
        if(Root.val > val)Root.left = buildBST(Root.left,val);
        else if(Root.val < val)Root.right = buildBST(Root.right,val);
        return Root;
    }


    public static boolean isValid(Node root,int l,int r){
        if(root == null)return true;

        if(root.val < l && root.val > r)return false;
        boolean isLeftValid = isValid(root.left,l,root.val-1);
        boolean isRightValid = isValid(root.right,root.val+1,r);
       
        if(isLeftValid == true && isRightValid == true)return true;
        return false;
    }
    public static boolean solve(Node root){
        Boolean ans = isValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(ans == true)return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node ROOT = null;
        for(int i=0;i<n;i++){
            ROOT  = buildBST(ROOT,arr[i]);
        }
        boolean res = solve(ROOT);
        if(res == true)System.out.println("BST is Valid");
        else System.out.println("BST is not Valid");
    }
}
