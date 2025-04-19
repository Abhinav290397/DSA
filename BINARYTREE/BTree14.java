//BINARY TREE ZIG ZAG ORDER TRAVERSAL.
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
public class BTree14 {
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
   
    public static ArrayList<ArrayList<Integer>> zigZagTrav(Node root){
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> q1 = new LinkedList<>();
        q1.add(root);
        int level = 0;
        while(q1.size() > 0){
            int size = q1.size();
            ArrayList<Integer> al1 = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp = q1.remove();
                al1.add(temp.val);
                if(temp.left!=null){
                    q1.add(temp.left);
                }
                if(temp.right!= null){
                    q1.add(temp.right);
                }
            }
            if(level %2 == 0){
                ans.add(al1);
            }
            else{
                Collections.reverse(al1);
                ans.add(al1);
            }
            level++;
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
        BTree14 b1 = new BTree14();
        Node root = b1.buildTree(arr, n);
        System.out.println(zigZagTrav(root));
    }
}
