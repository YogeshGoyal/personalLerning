/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weighedGraph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author yokukuma
 */
public class LazyPrimMST {

    private boolean[] marked;
    private Queue<Edge> mst;
    private Queue<Edge> pq;

    public LazyPrimMST(EdgeWeightedGraph g) {
        pq = new PriorityQueue<>();
        mst = new LinkedList<>();
        marked = new boolean[g.V()];
        
        
        for(int i =0;i<g.V();i++){
            if (!marked[i]) prim(g, i);
        }
    }

    private void prim(EdgeWeightedGraph g, int i){
        scan(g,i);
        while(!pq.isEmpty()){
            Edge e = pq.remove();
            int v = e.either();
            int w = e.other(v);
            assert marked[v] || marked[w];
            if (marked[v] && marked[w]) continue;      // lazy, both v and w already scanned
            mst.add(e);
            
            if(!marked[v]) scan(g, v);
            if(!marked[w]) scan(g, w);
            String str = "yogesh";
            str.hashCode();
            
        }
        
    }
    public Iterable<Edge> edges() {
        return mst;
    }
    
    // add all edges e incident to v onto pq if the other endpoint has not yet been scanned
    private void scan(EdgeWeightedGraph G, int v) {
        assert !marked[v];
        marked[v] = true;
        for (Edge e : G.adj(v))
            if (!marked[e.other(v)]) pq.add(e);
    }
}
