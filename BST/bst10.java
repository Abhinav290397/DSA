//LCA of BST (Find Lowest Common Ancestor of BST).
package BST;
import java.util.*;
public class bst10 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node Root,int val){
        if(Root == null){
            Root = new Node(val);
            return Root;
        }
        if(Root.val > val)Root.left = buildBST(Root.left,val);
        else if(Root.val < val)Root.right = buildBST(Root.right,val);
        return Root;
    }
     public static int findLCA(Node root,int n1,int n2){
        if(n1 < root.val && n2 < root.val){
            return findLCA(root.left,n1,n2);
        }
        else if(n1 > root.val && n2 > root.val){
            return findLCA(root.right,n1,n2);
        }
        return root.val;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int node1 = sc.nextInt();
        int node2 = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = null;
        for(int i=0;i<n;i++){
            root = buildBST(root,arr[i]);
        }
        System.out.println(findLCA(root,node1,node2));
    }
}
