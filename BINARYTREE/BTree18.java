//BOTTOM VIEW OF BINARY TREE.
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
class Pair{
    Node node;
    int scale;
    Pair(Node node,int scale){
        this.node = node;
        this.scale = scale;
    }
}
public class BTree18 {
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
public static ArrayList<Integer> bottomView(Node root){
    ArrayList<Integer>ans = new ArrayList<>();
    if(root == null){
        return ans;
    }
    HashMap<Integer,Integer> hm = new HashMap<>();
    Queue<Pair>q1 = new LinkedList<>();
    q1.add(new Pair(root,0));

     int maxScale = Integer.MIN_VALUE;
     int minScale = Integer.MAX_VALUE;

    while(q1.size() >0){
        int size = q1.size();
        for(int i=0;i<size;i++){
            Pair info = q1.remove();
            Node temp = info.node;
            int currScale = info.scale;

            maxScale = Math.max(maxScale,currScale);
            minScale = Math.min(minScale,currScale);

            hm.put(currScale,temp.val);

            if(temp.left!=null){
                q1.add(new Pair(temp.left,currScale-1));
            }
            if(temp.right!=null){
                q1.add(new Pair(temp.right,currScale+1));
            }
        }
    }
    for(int i=minScale;i<=maxScale;i++){
        ans.add(hm.get(i));
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
        BTree18 b1 = new BTree18();
        Node root = b1.buildTree(arr, n);
        System.out.println(bottomView(root));
    }   
}
