//CONSTRUCTION OF A BINARY TREE.
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
public class BTree01 {
    static int idx = -1; // idx is variable initaialize at -1..
    public static Node buildTree(int arr[],int n){
        idx++;               //firstly idx increases from -1 to 0 ans we check arr[0]....and so on..
        if(arr[idx] == -1){
            return null;
        }
        Node nn = new Node(arr[idx]);
        nn.left = buildTree(arr,n);
        nn.right = buildTree(arr, n);
        return nn;       //At last root node will return.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); // Give array in Preoeder format.
        }
        BTree01 t1 = new BTree01();
        Node root = t1.buildTree(arr,n);
        System.out.println(root.val);    //Finally prints the value of root node.
    }
}
