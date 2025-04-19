//Print Preorder traversal of BST.
package BST;
import java.util.*;
public class bst001 {
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
    public static void printPreorder(Node root){
        if(root == null)return;

        System.out.print(root.val+" ");
        if(root.left != null)printPreorder(root.left);
        if(root.right != null)printPreorder(root.right);

    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    Node Root = null;
    for(int i=0;i<n;i++){
        Root = buildBST(Root,arr[i]);
    }
    printPreorder(Root);
   }
}
