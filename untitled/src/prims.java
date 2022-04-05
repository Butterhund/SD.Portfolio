import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Comparator;

public class prims {
    static class node1 {
        // Stores destination vertex in adjacency list
        int dest;
        // Stores weight of a vertex in the adjacency list
        int weight;

        // Constructor
        node1(int a, int b) {
            dest = a;
            weight = b;
        }
    }

    static class Graph {

        // Number of vertices in the graph
        int V;

        // List of adjacent nodes of a given vertex
        LinkedList<node1>[] adj;

        // Constructor
        Graph(int e) {
            V = e;
            adj = new LinkedList[V];
            for (int o = 0; o < V; o++)
                adj[o] = new LinkedList<>();
        }
    }

    // class to represent a node in PriorityQueue
    // Stores a vertex and its corresponding
    // key value
    static class node {
        int vertex;
        int key;
    }

    // Comparator class created for PriorityQueue
    // returns 1 if node0.key > node1.key
    // returns 0 if node0.key < node1.key and
    // returns -1 otherwise
    static class comparator implements Comparator<node> {

        @Override
        public int compare(node node0, node node1) {
            return node0.key - node1.key;
        }
    }

    // method to add an edge
    // between two vertices
    void addEdge(Graph graph, int src, int dest, int weight) {

        node1 node0 = new node1(dest, weight);
        node1 node = new node1(src, weight);
        graph.adj[src].addLast(node0);
        graph.adj[dest].addLast(node);
    }

    // method used to find the mst
    void prims_mst(Graph graph) {

        // Whether a vertex is in PriorityQueue or not
        Boolean[] mstset = new Boolean[graph.V];
        node[] e = new node[graph.V];

        // Stores the parents of a vertex
        int[] parent = new int[graph.V];

        for (int o = 0; o < graph.V; o++)
            e[o] = new node();

        for (int o = 0; o < graph.V; o++) {

            // Initialize to false
            mstset[o] = false;

            // Initialize key values to infinity
            e[o].key = Integer.MAX_VALUE;
            e[o].vertex = o;
            parent[o] = -1;
        }
        // Set total Value;
        int totalKm = 0;

        // Include the source vertex in mstset
        mstset[0] = true;

        // Set key value to 0
        // so that it is extracted first
        // out of PriorityQueue
        e[0].key = 0;

        // Use TreeSet instead of PriorityQueue as the remove function of the PQ is O(n) in java.
        TreeSet<node> queue = new TreeSet<>(new comparator());

        for (int o = 0; o < graph.V; o++)
            queue.add(e[o]);

        // Loops until the queue is not empty
        while (!queue.isEmpty()) {

            // Extracts a node with min key value
            node node0 = queue.pollFirst();

            //Add the weights to a total value
            totalKm += node0.key;
            if(node0.key!=0) {
                System.out.println("Edge used: " + node0.key);
            }
            // Include that node into mstset
            mstset[node0.vertex] = true;

            // For all adjacent vertex of the extracted vertex V
            for (node1 iterator : graph.adj[node0.vertex]) {

                // If V is in queue
                if (!mstset[iterator.dest]) {
                    // If the key value of the adjacent vertex is
                    // more than the extracted key
                    // update the key value of adjacent vertex
                    // to update first remove and add the updated vertex
                    if (e[iterator.dest].key > iterator.weight) {
                        queue.remove(e[iterator.dest]);
                        e[iterator.dest].key = iterator.weight;
                        queue.add(e[iterator.dest]);
                        parent[iterator.dest] = node0.vertex;
                    }
                }
            }
        }
        // Convert cost to DKK 1000,- pr. km.
        int totalKr = totalKm*1000000;

        // Prints the vertex pair of mst
        for (int o = 1; o < graph.V; o++) {
            System.out.println();

            // Print "from vertex"
            switch (parent[o]) {
                case 0 -> System.out.print("Eskildstrup" + " - ");
                case 1 -> System.out.print("Haslev" + " - ");
                case 2 -> System.out.print("Holbæk" + " - ");
                case 3 -> System.out.print("Jærgerspris" + " - ");
                case 4 -> System.out.print("Kalundborg" + " - ");
                case 5 -> System.out.print("Korsør" + " - ");
                case 6 -> System.out.print("Køge" + " - ");
                case 7 -> System.out.print("Maribo" + " - ");
                case 8 -> System.out.print("Næstved" + " - ");
                case 9 -> System.out.print("Ringsted" + " - ");
                case 10 -> System.out.print("Slagelse" + " - ");
                case 11 -> System.out.print("Nykøbing F" + " - ");
                case 12 -> System.out.print("Vordingborg" + " - ");
                case 13 -> System.out.print("Roskilde" + " - ");
                case 14 -> System.out.print("Sorø" + " - ");
                case 15 -> System.out.print("Nakskov" + " - ");
            }
            //Print to vertex
            switch (o) {
                case 0 -> System.out.print("Eskildstrup");
                case 1 -> System.out.print("Haslev");
                case 2 -> System.out.print("Holbæk");
                case 3 -> System.out.print("Jærgerspris");
                case 4 -> System.out.print("Kalundborg");
                case 5 -> System.out.print("Korsør");
                case 6 -> System.out.print("Køge");
                case 7 -> System.out.print("Maribo");
                case 8 -> System.out.print("Næstved");
                case 9 -> System.out.print("Ringsted");
                case 10 -> System.out.print("Slagelse");
                case 11 -> System.out.print("Nykøbing F");
                case 12 -> System.out.print("Vordingborg");
                case 13 -> System.out.print("Roskilde");
                case 14 -> System.out.print("Sorø");
                case 15 -> System.out.print("Nakskov");
            }
        }
        //Print the totalValue of Prims:
        System.out.println();
        System.out.println();
        System.out.println("The minimum km required are: " + totalKm);
        System.out.println("The minimum cost is: " + totalKr + ",- DKK");
    }
}
