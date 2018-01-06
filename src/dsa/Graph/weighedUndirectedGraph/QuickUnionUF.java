/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weighedUndirectedGraph;

/**
 *
 * @author yokukuma
 */
public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for(int i =0; i< N; i++){
            id[i] = i;
        }
    }
    
    private int root(int i){
        while(i != id[i]){
            id[i] = id[id[i]];   // this line will compress long tree , and will make complexity to linear
            i = id[i];
        }
        return i;
    }
    
    // union complexity for N element is N
    public boolean conncted(int v, int w){
        return root(v)== root(w);
    }
    
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
        
    }
    
    
}
