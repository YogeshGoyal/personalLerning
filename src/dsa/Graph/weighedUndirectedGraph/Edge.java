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
public class Edge implements Comparable<Edge>{
    private int v;
    private int w;
    private double weight;

    public Edge(int v, int w, double weight) {
        
        if(v < 0 || w < 0){
            throw  new IllegalArgumentException("vertex index must be a nonnegative integer");
        }
        if(Double.isNaN(weight)){
            throw new IllegalArgumentException("Weight is NaN");
        }
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    
    public int either(){
        return v;
    }
    
    public int other(int vertex){
        if(vertex == v) return w;
        if(vertex == w) return w;
        else throw new IllegalArgumentException("illegal endpoint");
    }
    
    @Override
    public int compareTo(Edge o) {
        return Double.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return String.format("%d-%d :%.5f", v,w,weight);
    }
    
    public static void main(String[] args) {
        Edge edge = new Edge(1, 2, 5.4);
        System.out.println(edge);
    }
    
    
}
