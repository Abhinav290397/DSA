//Construction of Graph.(this method is not recommended for graph formation).
package GRAPH;
import java.util.*;
public class Gph01 {
    public static ArrayList<ArrayList<Integer>>  constructGraph(ArrayList<ArrayList<Integer>>ans,int noOfvertices){

        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
        for(int i=0;i<noOfvertices;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(ArrayList<Integer>var :ans ){ //var variable jo ans 1D AL me jaayega or har AL ek-ek karke access karega.
            int u = var.get(0); //har 1D AL ke value access karega.
            int v = var.get(1); //har 1D AL me 2 hi value h(nodes jo apas me connected h)i.e why we use u and v.

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }
    public static void main(String[] args) {   //Input is given in 2D AL and we have to construct graph and return it into form of 2D AL as well. 
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> al1 = new ArrayList<>(); //al1 is 2D AL of edges.
        
        for(int i=0;i<edges;i++){
            ArrayList<Integer>data = new ArrayList<>(); //we create data ALs inside al1 
            data.add(sc.nextInt()); //we add nodes in data AL which are connected through edges
            data.add(sc.nextInt());  //data Al me 2 values(nodes)add kar rahe h jo apas me connected h.
            al1.add(data); // Now we add all data ALs to al1 AL.
        }
        System.out.println(constructGraph(al1,vertices));
    }
}