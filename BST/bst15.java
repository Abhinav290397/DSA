//Given a BST, print the preorder,inorder and postorder traversals iteratively(by using iterative DFS) (i.e without using recursion).
package BST;
import java.util.*;
public class bst15 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        } 
    }
    static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }
    public static Node buildBST(int[]arr,int l,int r){
        if(l>r)return null;

        int mid = (l+r)/2;

        Node nn = new Node(arr[mid]);
        nn.left = buildBST(arr,l,mid-1);
        nn.right = buildBST(arr,mid+1,r);
        return nn;
    }
    public static void iterativeDFS(Node root){    //In this function we print the pre,in and post order-
        Stack<Pair> st1 = new Stack<>();            //- traversal of a BST iteratively.
        
        ArrayList<Integer>pre = new ArrayList<>();
        ArrayList<Integer>in = new ArrayList<>();
        ArrayList<Integer>post = new ArrayList<>();

        st1.push(new Pair(root,1));
        while(st1.size()> 0){
            Pair top  = st1.peek();

            if(top.state == 1){
                pre.add(top.node.val);
                top.state++;
                if(top.node.left != null)st1.push(new Pair(top.node.left,1));
            }
            else if(top.state == 2){
                in.add(top.node.val);
                top.state++;
                if(top.node.right != null)st1.push(new Pair(top.node.right,1));
            }
            else if(top.state == 3){
                post.add(top.node.val);
                st1.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int inorder[] = new int[n];     
    for(int i=0;i<n;i++){        //Here we used Inorder traversal to construct BST.
        inorder[i] = sc.nextInt();
    }
    Node Root = buildBST(inorder,0,n-1);
    iterativeDFS(Root);
   } 
}
