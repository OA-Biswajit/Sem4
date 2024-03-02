import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer>[] adjList;

    Graph(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjList[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    void DFS(int v) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        visited[v] = true;
        stack.push(v);

        while (!stack.isEmpty()) {
            v = stack.pop();
            System.out.print(v + " ");

            Iterator<Integer> iterator = adjList[v].listIterator();
            while (iterator.hasNext()) {
                int n = iterator.next();
                if (!visited[n]) {
                    visited[n] = true;
                    stack.push(n);
                }
            }
        }
    }
}

public class A1Q1 {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Depth First Traversal (starting from vertex 2):");
        graph.DFS(2);
    }
}
