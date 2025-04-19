//Construct BST from Preorder Traversal.
package BST;
import java.util.*;
public class bst12 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    static int idx;
    public static Node Construct(int arr[],int n,int l,int r){
        if(idx == n)return null;

        if(arr[idx] < l || arr[idx] > r)return null;

        Node nn = new Node(arr[idx]);
        idx++;
        nn.left = Construct(arr,n,l,nn.val-1);
        nn.right = Construct(arr,n,nn.val+1,r);
        return nn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int preorder[] = new int[n];
        for(int i=0;i<n;i++){
            preorder[i] = sc.nextInt();
        }
        idx = 0;
        Node root = Construct(preorder,n,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(root.val);
    }
}
