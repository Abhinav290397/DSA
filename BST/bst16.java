//Recover BST(portal).

//  THIS PROGRAM WILL NOT RUN BECOZ THIS REQUIRES A WRONG BST FOR INPUT . BUT I DONT KNOW HOW TO MADE WRONG BST.
package BST;
import java.util.*;
public class bst16 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }
    public static Node buildBST(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val > val)root.left = buildBST(root.left,val);
        else if(root.val < val)root.right = buildBST(root.right,val);
        return root;
    }

    public static Node getInorder(Stack<Pair>st1){
        while(st1.size() > 0){
            Pair top = st1.peek();
            if(top.state == 1){
                top.state++;
                if(top.node.left != null)st1.push(new Pair(top.node.left,1));
            }
            else if(top.state == 2){
                top.state++;
                if(top.node.right != null)st1.push(new Pair(top.node.right,1));
                return top.node;
            }
            else if(top.node.val == 3){
                st1.pop();
            }
        }
        return null;
    }
    public static Node recoverBST(Node root){
        Stack<Pair>st = new Stack<>();
        st.push(new Pair(root,1));

        Node prev = null;
        Node curr = getInorder(st);

        Node a = null;
        Node b = null;

        while(curr != null){
            if(prev == null){
                prev = curr;
                curr = getInorder(st);
            }
            else{
                if(prev.val > curr.val){
                    if(a == null){
                        a = prev;
                        b = curr;
                    }
                    else{
                        b = curr;
                    }
                }
            }
            prev = curr;
            curr = getInorder(st);
        }
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
        return root;
    }
    public static void printPreorder(Node root){
        if(root == null)return;

        System.out.print(root.val+" ");

        if(root.left != null)printPreorder(root.left);
        if(root.right != null)printPreorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node Root = null;
        for(int i=0;i<n;i++){
            Root = buildBST(Root,arr[i]);
        }
        Node res = recoverBST(Root);
        printPreorder(res);
    }
}
