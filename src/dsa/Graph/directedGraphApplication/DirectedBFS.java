/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.directedGraphApplication;

import dsa.Graph.unidirectedGraphApplcation.AdjacencyUndirectedGraph;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author yokukuma
 */
public class DirectedBFS {
    
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public DirectedBFS(Digraph g, int s) {
        this.s = s;
        marked = new boolean[g.getSize()];

        edgeTo = new int[g.getSize()];
        for (int i = 0; i < edgeTo.length; i++) {
            edgeTo[i] = -1;
            marked[i] = false;
        }
        bfs(g, s);
    }

    private void bfs(Digraph g, int source) {
        Queue<Integer> queue = new ArrayDeque();
        queue.add(source);
        marked[source] = true;

        while (!queue.isEmpty()) {
            int v = queue.remove();
            for (int w : g.getEdge(v)) {
                if (!marked[w]) {
                    queue.add(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                }
            }
        }
    }

    public boolean isConnected(int vertices) {
        return marked[vertices];
    }

    void printPath(int vertices) {
        if (marked[vertices] != Boolean.TRUE) {
            System.out.println("No path to print");
            return;
        }
        int current = vertices;
        System.out.print("Path is: ");
        while (current != s) {
            System.out.print("\t" + current);
            current = edgeTo[current];
        }
        System.out.print("\t" + s);
    }

}
