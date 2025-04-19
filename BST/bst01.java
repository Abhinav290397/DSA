//Construction of BST. (This code is for construction of BST from preorder Array).
package BST;
import java.util.*;
public class bst01 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val > val){                     // mean that value of root is bigger than coming value.
            root.left = buildBST(root.left, val);
        }
        else{
            root.right = buildBST(root.right, val);
        }
        return root;
    }
    public static void main(String[] args) {
        int[]arr = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = buildBST(root, arr[i]);
        }
        System.out.println(root.val);
    }
}
//police and thieves 2 gfg
/*class Solution {
    public int catchThieves(char arr[], int n, int k) {
        //write code here
		ArrayList<Integer>police = new ArrayList<>();
		ArrayList<Integer>thf = new ArrayList<>();
		for(int i=0;i<n;i++){
			if(arr[i] == 'P'){
				police.add(i);
			}
			else thf.add(i);
		}
		int ans =0 ;
		int p=0;
		int t=0;
		while(p<police.size() && t<thf.size()){
			if(Math.abs(police.get(p) - thf.get(t)) <=k){
				ans++;
				p++;
				t++;
			}
			else if(police.get(p) < thf.get(t)){
				p++;
			}
			else{
				t++;
			}
		}
		return ans;*/
