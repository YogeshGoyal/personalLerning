/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weightedDirectedGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author yokukuma
 */
public class DijkstraShortestPath {

    private double[] distTo; // distTo[v] = distance  of shortest s->v path
    private DirectedEdge[] edgeTo; // edgeTo[v] = last edge on shortest s->v path
    private Queue<KeyValue> pq;    // priority queue of vertices

    public DijkstraShortestPath(EdgeWeightedDigraph g, int s) {
        for (DirectedEdge edge : g.edges()) {
            if (edge.weight() < 0) {
                throw new IllegalArgumentException("edge " + edge + " has negative weight");
            }
        }

        distTo = new double[g.V()];
        edgeTo = new DirectedEdge[g.V()];

        for (int i = 0; i < g.V(); i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0;

        // relax vertices in order of distance from s
        pq = new PriorityQueue<>(g.V());
        pq.add(new KeyValue(0, 0));
        while (!pq.isEmpty()) {
            KeyValue k = pq.remove();
            for (DirectedEdge e : g.adj(k.key)) {
                relax(e);
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
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
            DirectedEdge e = new DirectedEdge(row, column, weight);
            graph.addEdge(e);
        }

        DijkstraShortestPath sp = new DijkstraShortestPath(graph, 0);

        // print shortest path
        for (int t = 0; t < graph.V(); t++) {
            if (sp.hasPathTo(t)) {
                System.out.println("0 to "+  t +" weight "+ sp.distTo(t));
                for (DirectedEdge e : sp.pathTo(t)) {
                    System.out.println(e + "   ");
                }
                System.out.println();
            } else {
                System.out.println("no path from 0 to "+t+ "\n");
            }
        }

    }

    public Iterable<DirectedEdge> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<DirectedEdge> path = new Stack<>();
        for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
            path.push(e);
        }
        return path;
    }

    public double distTo(int v){
        return distTo[v];
    }
    
    private void relax(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        if (distTo[w] > distTo[v] + e.weight()) {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;

            pq.add(new KeyValue(distTo[w], w));
        }
    }

    public boolean hasPathTo(int v) {
        return distTo[v] < Double.POSITIVE_INFINITY;
    }

}

class KeyValue implements Comparable<KeyValue> {

    double value;
    int key;

    KeyValue(double v, int k) {
        this.key = k;
        this.value = v;
    }

    public int compareTo(KeyValue o) {
        if (o.key < this.key) {
            return 1;
        } else if (o.key > this.key) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        KeyValue kv = (KeyValue) obj;
        if (kv.value == this.value) {
            return true;
        } else {
            return false;
        }
    }

}
