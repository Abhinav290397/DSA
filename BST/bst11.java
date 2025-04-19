//Construct BST from the InOrder traversal.   (Inorder of a BST is always a sorted array).
package BST;
import java.util.*;
public class bst11 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(int[]arr,int l,int r){
        if(l > r)return null;
        
        int mid = (l+r)/2;
        Node nn = new Node(arr[mid]);
        nn.left = buildBST(arr,l,mid-1);
        nn.right = buildBST(arr,mid+1,r);
        return nn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]inorder = new int[n];
        for(int i=0;i<n;i++){
            inorder[i] = sc.nextInt();
        }
        Node Root = buildBST(inorder,0,n-1);
        System.out.println(Root.val); //This prints the value of root of bst which means our bst is formed
    }                                 // (To verify kindly dryrun(if it prints correct root value then it means bst formed correctly))                                    
}
