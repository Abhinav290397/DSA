//INORDER TRAVERSAL ON A BINARY TREE.
package BINARYTREE;
import java.util.*;
import java.lang.*;
import java.io.*;
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
public class BTree03 {
    static int idx = -1;
    public static Node buildtree(int arr[] , int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node node = new Node(arr[idx]);
        node.left = buildtree(arr, n);
        node.right = buildtree(arr, n);

        return node;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt(); // give input in preorder sequence:1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
    }                           // we get o/p in inorder sequence.
    BTree03 bt1 = new BTree03();
    Node root = bt1.buildtree(arr, n);
    inorder(root);
   } 
}
