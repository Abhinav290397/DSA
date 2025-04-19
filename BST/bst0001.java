//Print Inorder Traversal of BST.
package BST;
import java.util.*;
public class bst0001 {
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
        if(root.val > val)root.left = buildBST(root.left,val);
        else if(root.val < val)root.right = buildBST(root.right,val);
        return root;
    }
    public static void printInorder(Node root){
        if(root == null)return;

        if(root.left != null)printInorder(root.left);
        System.out.print(root.val+" ");
        if(root.right != null)printInorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){       //Give input in preorder.
            arr[i] = sc.nextInt();
        }
        Node root = null;
        for(int i=0;i<n;i++){
            root = buildBST(root,arr[i]);
        }
        printInorder(root);
    }
}
