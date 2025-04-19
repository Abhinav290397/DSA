//FIND THE MAXIMUM VALUE IN TREE.(Node having maximum value).
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
public class BTree07 {
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
    public static int maxOfTree(Node root){
        if(root == null){
            return 0;
        }
        int lmax = maxOfTree(root.left);
        int rmax = maxOfTree(root.right);
        int ans = Math.max(root.val, Math.max(lmax,rmax));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BTree07 t1 = new BTree07();
        Node root = buildtree(arr,n);
        System.out.println(maxOfTree(root));
    }
}
