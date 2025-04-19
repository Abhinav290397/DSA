//Find the node which has minimum value in BST.
package BST;
import java.util.*;
public class bst05 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val)root.left = buildBST(root.left,val);
        else if(val > root.val)root.right = buildBST(root.right,val);
        return root;
    }
    public static int findMinNode(Node root){
        /*Node curr = root;        //iterative code
        while(curr.left != null)curr = curr.left; //we goes left becoz we find smallest node in left only.
        return curr.val;*/
        if(root.left == null){       //recursive code.
            return root.val;
        }
        return findMinNode(root.left);
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
        System.out.println(findMinNode(root));
    }
}
