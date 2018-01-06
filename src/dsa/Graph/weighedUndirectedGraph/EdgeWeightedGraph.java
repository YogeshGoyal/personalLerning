/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weighedUndirectedGraph;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yokukuma
 */
public class EdgeWeightedGraph {
    private final int V;
    private int E;
    private LinkedList<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = new LinkedList[V];
        
        for(int i =0; i<V;i++){
            adj[i] = new LinkedList<Edge>();
        }
    }
    
    public int V(){
        return V;
    }
    
    public int E(){
        return E;
    }
    
    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }
    
    public void addEdge(Edge e){
        int v = e.either();
        int w = e.other(v);
        validateVertex(v);
        validateVertex(w);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }
    
    public LinkedList<Edge> adj(int v){
        return adj[v];
    }
    
    public Iterable<Edge> edges() {
        LinkedList<Edge> list = new LinkedList<>();
        for (int v = 0; v < V; v++) {
            int selfLoops = 0;
            for (Edge e : adj(v)) {
                if (e.other(v) > v) {
                    list.add(e);
                }
                // only add one copy of each self loop (self loops will be consecutive)
                else if (e.other(v) == v) {
                    if (selfLoops % 2 == 0) list.add(e);
                    selfLoops++;
                }
            }
        }
        return list;
    }
        
    public int degree(int v){
        return adj[v].size();
    }
    
    
    public void printList() {
        for (LinkedList<Edge> linkedList : adj) {
            for (Edge edge : linkedList) {
                int v = edge.either();
                int w = edge.other(v);
                double weight = edge.getWeight();
                System.out.println(v + "-" + w+ " :"+ weight);
            }
        }
    }
}
