//Q.Possible Bipartition(Refer portal)...To check wheather a graph is bipartate or not.
package GRAPH;
import java.util.*;
 
public class Graph09 {
    static class Pair{    //Always made classes as local and static.
        int node;
        int colour;
        Pair(int node,int colour){
            this.node = node;
            this.colour = colour;
        }
    }
    public static boolean isBipartate(int [][]arr,int vert){
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
        for(int i=0;i<vert;i++){
            graph.add(new ArrayList<Integer>());
        }
       /*  for(int [] x :arr){             //graph construction.
            int u = x[0];
            int v = x[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }*/ // OR THIS CAN BE DONE AS...BELOW....
        for(int i=0;i<arr.length;i++){
            int u = arr[i][0];
            int v = arr[i][0];

            graph.get(u).add(v);
            graph.get(v).add(u);
        } 

        int visited[] = new int[vert];
        Queue<Pair>q1 = new LinkedList<>();

        for(int i=0;i<vert;i++){         //for all components.

            if(visited[i] != 0)continue;

            q1.add(new Pair(i,1));
            while(q1.size()>0){
                Pair curr = q1.remove();
                int Node = curr.node;
                int Color = curr.colour;

                if(visited[Node] != 0)continue;
                visited[Node] = Color;

                int oppositeColour = 0;
                if(Color == 1)oppositeColour = 2;
                else oppositeColour = 1;

                for(int nbr : graph.get(Node)){
                    if(visited[nbr] == 0)q1.add(new Pair(nbr,oppositeColour));
                    else if(visited[nbr] == Color)return false;
                    else continue;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //no. of nodes/vertices.(can be called as int vert).
        int m = sc.nextInt(); // no. of edges. (can be called as int edg).

        int edges[][] = new int[m][2];         //this time the edges are  given in form of 2D matrix.
        for(int i=0;i<m;i++){                    
            for(int j=0;j<2;j++){
                edges[i][j] = sc.nextInt();
            }
        }
        boolean ans = isBipartate(edges, n);
        if(ans == true)System.out.println("Graph is Bipartate");
        else System.out.println("Graph is not Bi-partate");
        //System.out.println(isBipartate(edges,n));
    }
}
