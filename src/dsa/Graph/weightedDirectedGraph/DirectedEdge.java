/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weightedDirectedGraph;

/**
 *
 * @author yokukuma
 */
public class DirectedEdge {
    private int v;
    private int w;
    private double weight;

    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }
    
    public int from(){
        return v;
    }
    
    public int to(){
        return w;
    }
    
    public double weight(){
        return weight;
    }
    
    public String toString() {
        return v + "->" + w + " " + String.format("%5.2f", weight);
    }
    
    public static void main(String[] args) {
        DirectedEdge e = new DirectedEdge(12, 34, 5.67);
        System.out.println(e);
    }
    
}
