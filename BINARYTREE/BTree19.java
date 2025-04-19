//Boundary Traversal on Binary Tree. Refer lecture of 23 December.
package BINARYTREE;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class BTree19 {
    static int idx = -1;
    public static Node buildTree(int arr[],int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node newnode = new Node(arr[idx]);
        newnode.left = buildTree(arr, n);
        newnode.right = buildTree(arr, n);
        return newnode;
    }
    
    public static void leftBoundary(Node root,ArrayList<Integer>path){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return;
        }
        if(root.left!=null){
            path.add(root.val);
            leftBoundary(root.left,path);
        }
        else if(root.right!=null){
            path.add(root.val);
            leftBoundary(root.right,path);
        }
    }

    public static void leafNodes(Node root,ArrayList<Integer>path){
        if(root == null){
            return;
        }
        if(root.left==null && root.right==null){
            path.add(root.val);
            return;
        }
        leafNodes(root.left, path);
        leafNodes(root.right, path);
    }

    public static void rightBoundary(Node root,ArrayList<Integer>path){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return;
        }
        if(root.right!=null){
            path.add(root.val);
            rightBoundary(root.right, path);
        }
        else if(root.left!=null){
            path.add(root.val);
            rightBoundary(root.left, path);
        }
    }
    public static ArrayList<Integer> boundaryTraversal(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        if(root.left==null && root.right==null){
            ans.add(root.val);
            return ans;
        }

        ArrayList<Integer> LEFT = new ArrayList<>();
        leftBoundary(root.left,LEFT);

        ArrayList<Integer> RIGHT = new ArrayList<>();
        rightBoundary(root.right,RIGHT);

        ArrayList<Integer> LEAF = new ArrayList<>();
        leafNodes(root,LEAF);

        ans.add(root.val);

        for(int i=0;i<LEFT.size();i++){
            ans.add(LEFT.get(i));
        }
        for(int i=0;i<LEAF.size();i++){
            ans.add(LEAF.get(i));
        }
        for(int i= RIGHT.size()-1;i>=0;i--){
            ans.add(RIGHT.get(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BTree19 b1 = new BTree19();
        Node root = b1.buildTree(arr, n);
        System.out.println(boundaryTraversal(root));
    }
}
