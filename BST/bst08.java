//delete the node from BST.
package BST;
import java.util.*;
public class bst08 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int findMin(Node root){
        if(root.left == null)return root.val;
        return findMin(root.left);
    }
    public static Node buildBST(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val > val)root.left = buildBST(root.left,val);
        else if(root.val < val)root.right = buildBST(root.right,val);
        return root;
    }

    public static Node deleteNode(Node root,int key){
        if(root == null)return null;

        if(root.val == key){
            if(root.right == null && root.left == null)return null;                   //means node is leaf node.
           
            else if(root.left != null && root.right == null) return root.left;        //means node has only left child.
            
            else if(root.left == null && root.right != null) return root.right;        //means node has only right child.
            
            else if(root.left != null && root.right != null){                           //means node has both child.
                int minFromRight = findMin(root.right);  //here we find the minimum node from sight subtree(RST) using findmin function
                root.val = minFromRight;                   //now we replace the key with that minimum node.
                root.right = deleteNode(root.right,minFromRight); //here we deleted that minimum node from RST
            }
            return root;
        }
        else if(root.val > key){
            root.left = deleteNode(root.left,key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right,key);
        }
        return root;
    }

    public static void printPreorder(Node Root){
        if(Root == null)return;
        System.out.print(Root.val+" ");
        if(Root.left != null)printPreorder(Root.left);
        if(Root.right != null)printPreorder(Root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // The Node which we have to deleted.
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = null;
        for(int i=0;i<n;i++){
            root = buildBST(root,arr[i]);
        }
        Node newRoot = deleteNode(root,k);
        printPreorder(newRoot);
    }
}
