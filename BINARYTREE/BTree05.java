//FIND THE SIZE OF BINARY TREE (size of binary tree is equql to total no. of nodes.).
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
public class BTree05 {
    static int idx = -1;
    public static Node buildtree(int arr[],int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node node = new Node(arr[idx]);
        node.left = buildtree(arr, n);
        node.right = buildtree(arr, n);

        return node;
    }
    public static int getSize(Node root){
        if(root == null){
            return 0;
        }
        int ls = getSize(root.left);
        int rs = getSize(root.right);
        return ls + rs +1; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BTree05 b1 = new BTree05();
        Node root = b1.buildtree(arr, n);
        System.out.println(getSize(root));
    }
}
