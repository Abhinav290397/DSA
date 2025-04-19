//Construct BST from Postorder Traversal.
package BST;
import java.util.*;
public class bst13 {
   static class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
         this.val = val;
         this.left = null;
         this.right = null;
      }
   }
   static int idx;
   public static Node buildBST(int[]arr,int n,int l,int r){
      if(idx < 0)return null;

      if(arr[idx] < l || arr[idx] > r)return null;

      Node nn = new Node(arr[idx]);
      idx--;
      nn.right = buildBST(arr,n,nn.val+1,r);
      nn.left = buildBST(arr,n,l,nn.val-1);
      return nn;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int postorder[] = new int[n];
    for(int i=0;i<n;i++){
      postorder[i] = sc.nextInt();
    }
    idx = n-1;
    Node root = buildBST(postorder,n,Integer.MIN_VALUE,Integer.MAX_VALUE);
    System.out.println(root.val);
   } 
}
