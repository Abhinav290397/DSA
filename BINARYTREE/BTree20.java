//Cousions in Binary Tree.
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
public class BTree20 {
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

    public static boolean isCousions(Node root,int A,int B){
        if(root == null){
            return false;
        }
        Queue<Node>q1 = new LinkedList<>();
        q1.add(root);
        while(q1.size() > 0){
            int size = q1.size();

            boolean foundA = false;
            boolean foundB = false;
            int parentOfA = -1;
            int parentOfB = -1;

            for(int i=0;i<size;i++){
                Node temp = q1.remove();
                if(temp.left!=null){
                    if(temp.left.val == A){
                        foundA = true;
                        parentOfA = temp.val;
                    }
                    else if(temp.left.val == B){
                        foundB = true;
                        parentOfB = temp.val;
                    }
                    q1.add(temp.left);
                }
                if(temp.right!=null){
                    if(temp.right.val == A){
                        foundA = true;
                        parentOfA = temp.val;
                    }
                    else if(temp.right.val == B){
                        foundB = true;
                        parentOfB = temp.val;
                    }
                    q1.add(temp.right);
                }
            }
            if(foundA == true && foundB == true){
                if(parentOfA == parentOfB){
                    return false;
                }
                else{
                    return true;
                }
            }
            if(foundA == true || foundB == true){
                return false;
            }
        }
        return false;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        BTree20 b1 = new BTree20();
        Node root = b1.buildTree(arr, n);
        System.out.println(isCousions(root, a, b));
   }   
}
