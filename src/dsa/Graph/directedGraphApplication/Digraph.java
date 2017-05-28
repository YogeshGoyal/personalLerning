/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.directedGraphApplication;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yokukuma
 */
public class Digraph {

    private final Map<Integer, List<Integer>> adj_list;
    private final int V;
    private int E =0;
    
    public Digraph(int numberOfVerties) {
        this.V = numberOfVerties;
        this.adj_list = new HashMap<>();
        for (int i = 0; i < numberOfVerties; i++) {
            adj_list.put(i, new LinkedList<>());
        }
    }

    public int getSize() {
        return V;
    }
    
// throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }
    
    public void makeEdge(int from, int to) {
        validateVertex(from);
        validateVertex(to);
        if ((from > V) || (to > V)) {
            System.out.println("Vertiex enttred not present");
            return;
        }
        List<Integer> slist = adj_list.get(from);
        slist.add(to);
        E++;
    }

     /**
     * Returns the number of edges in this digraph.
     *
     * @return the number of edges in this digraph
     */
    public int E() {
        return E;
    }

    /**
     * Returns the number of vertices in this digraph.
     *
     * @return the number of vertices in this digraph
     */    
    public int V() {
        return V;
    }
    
    
    public void removeEdge(int from, int to) {
        if ((from > V) || (to > V)) {
            System.out.println("Vertiex enttred for removing not present");
            return;
        }
        List<Integer> slist = adj_list.get(from);
        slist.remove(Integer.valueOf(to));
    }

    public void printList() {
        for (Map.Entry<Integer, List<Integer>> val : adj_list.entrySet()) {
            Integer key = val.getKey();
            for (Integer integer : val.getValue()) {
                System.out.println(key + "->" + integer);
            }
        }
    }

    public List<Integer> getEdge(int source) {
        validateVertex(source);
        return adj_list.get(source);
    }

    public int degree(int vertices) {
        validateVertex(vertices);
        return adj_list.get(vertices).size();
    }

    public int maxDegree() {
        int max_size = 0;
        for (int i = 0; i < V; i++) {
            if (max_size < adj_list.get(i).size()) {
                max_size = adj_list.get(i).size();
            }
        }
        return max_size;
    }
    
    public Digraph reverse(Digraph g){
        Digraph reverse = new Digraph(g.getSize());
        for(int i = 0; i< g.getSize();i++){
            for(int w : g.getEdge(i)){
                reverse.makeEdge(w, i);
            }
        }
        return reverse;
    }
}
