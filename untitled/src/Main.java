//The template of this code is inspired by geeksforgeeks website:
// https://www.geeksforgeeks.org/prims-mst-for-adjacency-list-representation-greedy-algo-6/
import java.util.ArrayList;
public class Main {

    public static void main(String[] args)    {

        int V = 16;

        prims.Graph graph = new prims.Graph(V);

        prims e = new prims();
        //Eskildstrup
        e.addEdge(graph, 0, 7, 28);
        e.addEdge(graph, 0, 11, 13);
        e.addEdge(graph, 0, 12, 24);
        //Haslev
        e.addEdge(graph, 1, 5, 60);
        e.addEdge(graph, 1, 6, 24);
        e.addEdge(graph, 1, 8, 25);
        e.addEdge(graph, 1, 9, 19);
        e.addEdge(graph, 1, 13, 47);
        e.addEdge(graph, 1, 10, 48);
        e.addEdge(graph, 1, 14, 34);
        e.addEdge(graph, 1, 12, 40);
        //Holbæk
        e.addEdge(graph, 2, 3, 34);
        e.addEdge(graph, 2, 4, 44);
        e.addEdge(graph, 2, 5, 66);
        e.addEdge(graph, 2, 9, 36);
        e.addEdge(graph, 2, 13, 32);
        e.addEdge(graph, 2, 10, 46);
        e.addEdge(graph, 2, 14, 34);
        //Jærgerspris
        e.addEdge(graph, 3, 5, 95);
        e.addEdge(graph, 3, 6, 58);
        e.addEdge(graph, 3, 9, 56);
        e.addEdge(graph, 3, 13, 33);
        e.addEdge(graph, 3, 10, 74);
        e.addEdge(graph, 3, 14, 63);
        //Kalundborg
        e.addEdge(graph, 4, 9, 62);
        e.addEdge(graph, 4, 13, 70);
        e.addEdge(graph, 4, 10, 39);
        e.addEdge(graph, 4, 14, 51);
        //Korsør
        e.addEdge(graph, 5, 8, 45);
        e.addEdge(graph, 5, 10, 20);
        //Køge
        e.addEdge(graph, 6, 8, 45);
        e.addEdge(graph, 6, 9, 28);
        e.addEdge(graph, 6, 13, 25);
        e.addEdge(graph, 6, 12, 60);
        //Maribo
        e.addEdge(graph, 7, 15, 27);
        e.addEdge(graph, 7, 11, 26);
        //Næstved
        e.addEdge(graph, 8, 13, 57);
        e.addEdge(graph, 8, 9, 26);
        e.addEdge(graph, 8, 10, 37);
        e.addEdge(graph, 8, 14, 32);
        e.addEdge(graph, 8, 12, 28);
        //Ringsted
        e.addEdge(graph, 9, 13, 31);
        e.addEdge(graph, 9, 14, 15);
        e.addEdge(graph, 9, 12, 58);
        //Slagelse
        e.addEdge(graph, 10, 14, 14);

        // Method invoked
        e.prims_mst(graph);
    }
}
