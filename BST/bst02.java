//Size of BST.
package BST;
import java.util.*;

public class bst02 {
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
        else root.right = buildBST(root.right,val);
        return root;
    }

    public static int size(Node Root){
        if(Root == null)return 0;
        int lsize = size(Root.left);
        int rsize = size(Root.right);
        return lsize + rsize +1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = null;
        for(int i=0;i<n;i++){
            root = buildBST(root,arr[i]);
        }
        System.out.println(size(root));
    }
}
