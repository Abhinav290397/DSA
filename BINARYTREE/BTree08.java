//HEIGHT/DEPTH OF A BINARY TREE.
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
public class BTree08 {
   static int idx = -1;
   public static Node buildtree(int arr[],int n){
    idx++;
    if(arr[idx] == -1){
        return null;
    }
    Node node = new Node(arr[idx]);
    node.left = buildtree(arr,n);
    node.right = buildtree(arr,n);
    return node;
   }
   public static int htOfTree(Node root){
    if(root == null){
        return 0;
    }
    int lh = htOfTree(root.left);
    int rh = htOfTree(root.right);
    return Math.max(lh,rh) + 1;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); //In these ques..(previous also)...give input in-
        }                           //-form of preorder sequence array only.                         
        BTree08 t1 = new BTree08();
        Node root = t1.buildtree(arr,n);
        System.out.println(htOfTree(root));
    }
}
