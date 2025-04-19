//Construct BST from Level Order Traversal.
package BST;
import java.util.*;
public class bst14 {
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
    public static Node BSTfromLevelorder(int arr[],int n){
        
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int levelOrder[] = new int[n];
    for(int i=0;i<n;i++){
        levelOrder[i] = sc.nextInt();
    }

   } 
}
