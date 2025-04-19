//Find the node which has maximum value in BST.
package BST;
import java.util.*;
public class bst04 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node node,int val){    //  root/node....same thing
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val < node.val)node.left = buildBST(node.left,val);
        else if(val > node.val)node.right = buildBST(node.right,val);
        return node;
    }

    public static int findMaxNode(Node root){
        /*Node temp = root;                               //iterative code.
        while(temp.right != null)temp = temp.right;    //we go right becoz we find largest node in right only.
        return temp.val;*/
        if(root.right == null)return root.val;     //recursive code.
        return findMaxNode(root.right);
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
        System.out.println(findMaxNode(root));
    }
}
