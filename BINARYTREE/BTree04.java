//  POSTORDER TRAVERSAL.
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
public class BTree04 {
    static int idx = -1;
    public static Node buildTree(int arr[],int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node node = new Node(arr[idx]);
        node.left = buildTree(arr, n);
        node.right = buildTree(arr, n);

        return node;
    }
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
         postOrder(root.left);
         postOrder(root.right);
         System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); // give input in preorder :1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
        }                          // we get output in postorder sequence.
        BTree04 b1 = new BTree04();
        Node root = b1.buildTree(arr, n);
        postOrder(root);

    }
}
