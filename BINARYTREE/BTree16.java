//Maximum Width of a Binary Tree........Refer portal...Jan lecture..
package BINARYTREE;
import java.util.*;
class Node{
    long val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class Pair{
    Node node;
    int index;
    Pair(Node node,int index){
        this.node = node;
        this.index = index;
    }
}
public class BTree16 {
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
    

    public static int mxmWidth(Node root){
        Queue<Pair>q1 = new LinkedList<>();
        q1.add(new Pair(root,1));
        int width = 0;
        while(q1.size() > 0){
            int size = q1.size();

            int minIdx = Integer.MAX_VALUE;
            int maxIdx = Integer.MIN_VALUE;

            for(int i=0;i<size;i++){
                Pair info = q1.remove();

                Node temp = info.node;
                int currIdx = info.index;

                minIdx = Math.min(minIdx,currIdx);
                maxIdx = Math.max(maxIdx,currIdx);

                if(temp.left!=null){
                    q1.add(new Pair(temp.left,2*currIdx));
                }
                if(temp.right!=null){
                    q1.add(new Pair(temp.right,2*currIdx+1));
                }
            }
            int currWidth = maxIdx - minIdx +1;
            width = Math.max(width,currWidth);
        }
        return width;
    }
       
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BTree16 b1 = new BTree16();
        Node root = b1.buildTree(arr, n);
        System.out.println(mxmWidth(root));
   } 
}
