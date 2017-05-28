/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.directedGraphApplication;

/**
 *
 * @author yokukuma
 */
public class KosarajuSharirSCC {

    private boolean[] marked;     // marked[v] = has vertex v been visited?
    private int[] id;             // id[v] = id of strong component containing v
    private int count;            // number of strongly-connected components

    public KosarajuSharirSCC(Digraph g) {

        // compute reverse postorder of reverse graph
        DepthFirstOrder dfo = new DepthFirstOrder(g.reverse(g));

        marked = new boolean[g.V()];
        id = new int[g.V()];

        for (int v : dfo.reversePost()) {
            if (!marked[v]) {
                dfs(g, v);
                count++;
            }
        }

    }

    // DFS on graph G
    private void dfs(Digraph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.getEdge(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    public boolean stronglyConnected(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        return id[v] == id[w];
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
        }
    }

    // return number of strong component
    public int count() {
        return count;
    }

    public int id(int v) {
        validateVertex(v);
        return id[v];
    }

}
