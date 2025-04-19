//Sum of nodes in BST.
package BST;
import java.util.*;
public class bst03 {
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
        if(val < Root.val) Root.left = buildBST(Root.left,val);
        else Root.right = buildBST(Root.right,val);
        return Root;
    }

    public static int sumOfBST(Node root){
        if(root == null)return 0;
    
        int lSum = sumOfBST(root.left);
        int rSum = sumOfBST(root.right);
         
        return lSum + rSum + root.val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = null;
        for(int i=0;i<n;i++){
            root = buildBST(root,arr[i]);
        }
        System.out.println(sumOfBST(root));
    }
}
