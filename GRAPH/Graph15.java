//Count the components of Graph.
package GRAPH;
import java.util.*;
public class Graph15 {
    public static void dfs(ArrayList<ArrayList<Integer>>Graf,boolean visited[],int currNode){
        visited[currNode] = true;

        for(int j=0;j<Graf.get(currNode).size();j++){
            if(Graf.get(currNode).get(j) == 1){
                if(visited[j] == false)dfs(Graf,visited,j);
            }
        }
    }
    public static int countComponents(ArrayList<ArrayList<Integer>>Graph,int vert){
        int count = 0;
        boolean vis[] = new boolean[vert];

        for(int i=0;i<vert;i++){
            if(vis[i] == true)continue;
            count++;
            dfs(Graph,vis,i);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //it represents size of matrix(as well as no. of vertices).

        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();

        for(int i=0;i<n;i++){                           //In this type of Graph formation- firstly the Graph formed is a matrix type,-.
            ArrayList<Integer>temp = new ArrayList<>();//-secondly we give input in form of 0 and 1. (0 means nodes are not connected while 1 means nodes are connected)
            for(int j=0;j<n;j++){                       //We are making matrix but by using 2D AL.
                temp.add(sc.nextInt());
            }
            graph.add(temp);  //here the graph formed(but in form of square matrix contains only o and 1).
        }

        System.out.println(countComponents(graph, n));
    }
}
