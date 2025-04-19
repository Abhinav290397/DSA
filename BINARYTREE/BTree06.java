//FIND THE SUM OF TREE(sum of tree is the sum of values of all nodes).
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
public class BTree06 {
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
    public static int sumOfTree(Node root){
        if(root == null){
            return 0;
        }
        int ls = sumOfTree(root.left);
        int rs = sumOfTree(root.right);
        return ls + rs + root.val;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BTree06 t1 = new BTree06();
        Node root = t1.buildtree(arr,n);
        System.out.println(sumOfTree(root));
    }
}
