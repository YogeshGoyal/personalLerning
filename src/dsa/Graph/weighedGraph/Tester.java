/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.weighedGraph;

import dsa.Graph.directedGraphApplication.Digraph;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\dsa\\Graph\\weighedGraph\\weightedgraph.txt");
        Scanner sc = new Scanner(new FileReader(file));
        System.err.println("Enter number of vertices. ");
        int countOfVertices = sc.nextInt();
        EdgeWeightedGraph am = new EdgeWeightedGraph(countOfVertices);

        System.out.println("Number of edge you want");
        int edges = sc.nextInt();

        for (int i = 0; i < edges; i++) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            double weight = sc.nextDouble();
            Edge e = new Edge(row,column, weight);
            am.addEdge(e);
        }
        

        am.printList();
    }
        
}
