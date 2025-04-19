//Find the targeted node in the BST, If it exists return true else return false.
package BST;
import java.util.*;
public class bst06 {
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
        if(val < root.val)root.left = buildBST(root.left,val);
        else root.right = buildBST(root.right,val);
        return root; 
    }

    public static boolean findNode(Node root,int target){
        if(root == null)return false;

        if(root.val == target)return true;
        
        else if(root.val > target){
            boolean findInleft = findNode(root.left,target);
            return findInleft;
        }
        else if(root.val < target){
            boolean findInright = findNode(root.right,target);
            return findInright;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        Node root = null;
        for(int i=0;i<n;i++){
            root = buildBST(root,arr[i]);
        }

        boolean ans = findNode(root,target);
        if(ans == true)System.out.println("target node is present in BST");
        else System.out.println("target node is not present in BST");
    }
}
