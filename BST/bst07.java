//Insert a node ino the BST.
package BST;
import java.util.*;
public class bst07 {
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

    public static Node insertNodeInBST(Node root,int key){
        if(root == null){
            Node nn = new Node(key);
            return nn;
        }
        if(key < root.val){
            root.left = insertNodeInBST(root.left,key);
        }
        else if(key > root.val){
            root.right = insertNodeInBST(root.right,key);
        }
        return root;
    }

    public static void printpreorder(Node root){  //this function is printing the updated bst in form of preorder array.
        if(root == null)return;
        System.out.print(root.val+" ");
        if(root.left!=null){
        printpreorder(root.left);
        }
        if(root.right!=null){
        printpreorder(root.right);
        }
        }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt(); //It is the node which we have to be insert in BST.
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = null;
        for(int i=0;i<n;i++){
            root = buildBST(root,arr[i]);
        }
        Node newRoot = insertNodeInBST(root, key);
        printpreorder(newRoot);
    }
}
