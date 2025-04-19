//PREORDER TRAVERSAL ON A BINARY TREE.
package BINARYTREE;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class BTree02 {
    static int idx = -1;
    public static Node Buildtree(int arr[],int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node nn  = new Node(arr[idx]);
        nn.left = Buildtree(arr, n);
        nn.right = Buildtree(arr, n);
        return nn;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BTree02 t1 = new BTree02();
        Node root = t1.Buildtree(arr,n);
        preOrder(root);

    }
}
