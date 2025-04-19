//VERTICLE ORDER TRAVERSAL.
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

public class BTree15 {
    static class Pair{
        Node node;
        int scale;
        Pair(Node node,int scale){
            this.node = node;
            this.scale = scale;
        }
    }
    static int idx = -1;
    public static Node buildTree(int arr[],int n){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node newnode = new Node(arr[idx]);
        newnode.left = buildTree(arr, n);
        newnode.right = buildTree(arr,n);
        return newnode;
    }
    public static ArrayList<ArrayList<Integer>>verticalOrderTrav(Node root){
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        HashMap<Integer,ArrayList<Integer>>hm = new HashMap<>();
        Queue<Pair>q1 = new LinkedList<>();
        int minScale = Integer.MAX_VALUE;
        int maxScale = Integer.MIN_VALUE;

        q1.add(new Pair(root,0));
        while(q1.size() > 0){
            int size = q1.size();
            for(int i=0;i<size;i++){
                Pair info = q1.remove();
                Node temp = info.node;
                int currScale = info.scale;

                minScale = Math.min(minScale,currScale);
                maxScale = Math.max(maxScale,currScale);

                if(hm.containsKey(currScale)){
                    ArrayList<Integer>oldlist = hm.get(currScale);
                    oldlist.add(temp.val);
                    hm.put(currScale,oldlist);
                }
                else{
                    ArrayList<Integer>newlist = new ArrayList<>();
                    newlist.add(temp.val);
                    hm.put(currScale,newlist);
                }

                if(temp.left != null)q1.add(new Pair(temp.left,currScale-1));
                if(temp.right != null)q1.add(new Pair(temp.right,currScale+1));
            }
        }
        for(int i=minScale;i<=maxScale;i++){
            ArrayList<Integer>al1 = hm.get(i);
            ans.add(al1);
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
        BTree15 b1 = new BTree15();
        Node root = b1.buildTree(arr, n);
        System.out.println(verticalOrderTrav(root));
    }
}
