/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weighedGraph;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author yokukuma
 */
public class KruskalMST {
    private Queue<Edge> mst;

    public KruskalMST(EdgeWeightedGraph g) {
        Queue<Edge> pq = new PriorityQueue<>();
        for (Edge edge : g.edges()) {
            pq.add(edge);
        }
        
        QuickFindUF uf = new QuickFindUF(g.V());
        while(!pq.isEmpty() && mst.size()< g.V()-1){
            Edge e = pq.remove();
            int v = e.either();
            int w = e.other(v);
            if(! uf.conncted(v, w)){
                uf.union(v, w);
                mst.add(e);
            }
        }
    }
    
    public Iterable<Edge> edges(){
        return mst;
    }
    
    
}
