//Find the path to the given(Targeted) Node.....refer portal.
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
public class BTree21 {
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

     public static boolean rootToNodePath(Node root,int target,ArrayList<Integer>al1){
        if(root == null){
            return false;
        }
        if(root.val == target){
            al1.add(root.val);
            return true;
        }
        boolean left = rootToNodePath(root.left,target,al1);
        boolean right = rootToNodePath(root.right,target,al1);
        boolean res = left || right;
        if(res == true){
            al1.add(root.val);
        }
        return res;
    }
    /* public static ArrayList<Integer> solve(Node root,int target){
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.reverse(ans);
        return ans;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        BTree21 b1 = new BTree21();
        Node root = b1.buildTree(arr, n);
        //System.out.println(solve(root,target)); 
        ArrayList<Integer>al1 = new ArrayList<>();
        rootToNodePath(root, target, al1);
        Collections.reverse(al1);
        System.out.println(al1);
    }
}

/***Needed to be reviewed***/
