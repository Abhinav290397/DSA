//  LEFT VIEW OF BINARY TREE.
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
public class BTree12 {
    static int idx = -1;
    public static Node buildTree(int arr[],int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node node = new Node(arr[idx]);
        node.left = buildTree(arr, n);
        node.right = buildTree(arr, n);

        return node;
    }
    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer>ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> q1 = new LinkedList<>();
        q1.add(root);
        while(q1.size() > 0){
            int size = q1.size();
            for(int i=0;i<size;i++){
                Node temp = q1.remove();
                if(i==0){
                    ans.add(temp.val);
                }
                if(temp.left!= null){
                    q1.add(temp.left);
                }
                if(temp.right!= null){
                    q1.add(temp.right);
                }
            }
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
        BTree12 t1 = new BTree12();
        Node root = t1.buildTree(arr, n);
        System.out.println(leftView(root));
    }
}
