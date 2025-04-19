//BALANCED BINARY TREE.
package BINARYTREE;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val =val;
    }
}
public class BTree09 {
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

    public static int htOfTree(Node root){
        if(root == null){
            return 0;
        }
        int lh = htOfTree(root.left);
        int rh = htOfTree(root.right);
        return Math.max(lh,rh) + 1;
    }
    public static boolean balanceTree(Node root){     //TC = O(n2).
        if(root == null){
            return true;
        }
        boolean leftBal = balanceTree(root.left);
        boolean rightBal = balanceTree(root.right);

        int lh = htOfTree(root.left);
        int rh = htOfTree(root.right);
        int diff = Math.abs(lh - rh);

        boolean balance = false;
        if(diff <= 1){
            balance = true;
        }
        if(balance == false || leftBal == false || rightBal == false){
            return false;
        }
        else{
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){ //input:3 9 -1 -1 20 15 -1 -1 7 -1 -1
            arr[i] = sc.nextInt();
        }
        BTree09 t1 = new BTree09();
        Node root = buildTree(arr,n);
        System.out.println(balanceTree(root));
    }
                     
}
