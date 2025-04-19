//DIAMETER OF BINARY TREE. (Diameter of binary tree is the longest path b/w any two leaf nodes).
//Refer lecture of December of Binary Tree.
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
public class BTree10 {
    static int idx = -1;
    public static Node buildTree(int arr[],int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node node = new Node(arr[idx]);
        node.left = buildTree(arr,n);
        node.right = buildTree(arr,n);
        return node;
    }

    public static int height(Node root){
        if(root == null){
            return -1;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    public static int diaOfTree(Node root){ // TC = O(n2)
        if(root == null){
            return 0;
        }
        int lDia = diaOfTree(root.left);
        int rDia = diaOfTree(root.right);
        
        int myDia = height(root.left) + height(root.right) + 2;

        int ans = Math.max(myDia,Math.max(lDia,rDia));
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BTree10 b1 = new BTree10();
        Node root = b1.buildTree(arr, n);
        System.out.println(diaOfTree(root));
    }
}
