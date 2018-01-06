/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weightedDirectedGraph;

import dsa.Graph.weighedUndirectedGraph.Edge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class EdgeWeightedDigraph {
    private final int V;                // total number of vertices in graph
    private int E;                      // number of edges in this digraph
    private LinkedList<DirectedEdge>[] adj;
    public EdgeWeightedDigraph(int V) {
        this.V = V;
        this.E =0;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
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
    
    public void addEdge(DirectedEdge e){
        int v = e.from();
        int w = e.to();
        validateVertex(v);
        validateVertex(w);
        adj[v].add(e);
        E++;
    }
    
    public LinkedList<DirectedEdge> adj(int v){
        return adj[v];
    }
 
    public int degree(int v){
        return adj[v].size();
    }
    
    public void printList() {
        for (LinkedList<DirectedEdge> linkedList : adj) {
            for (DirectedEdge edge : linkedList) {
                int v = edge.from();
                int w = edge.to();
                double weight = edge.weight();
                System.out.println(v + "-" + w+ " :"+ weight);
            }
        }
    }
    
    public Iterable<DirectedEdge> edges() {
        LinkedList<DirectedEdge> list = new LinkedList<>();
        for (int v = 0; v < V; v++) {
            for (DirectedEdge e : adj(v)) {
                list.add(e);
            }
        }
        return list;
    }
    
    public static void main(String[] str) throws FileNotFoundException{
        File file = new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\dsa\\Graph\\weightedDirectedGraph\\weightedgraph.txt");
        Scanner sc = new Scanner(new FileReader(file));
                System.err.println("Enter number of vertices. ");
        int countOfVertices = sc.nextInt();
        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(countOfVertices);
        
        System.out.println("Number of edge you want");
        int edges = sc.nextInt();
        
        for (int i = 0; i < edges; i++) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            double weight = sc.nextDouble();
            DirectedEdge e = new DirectedEdge(row,column, weight);
            graph.addEdge(e);
        }
        
        graph.printList();
                
    }
}
