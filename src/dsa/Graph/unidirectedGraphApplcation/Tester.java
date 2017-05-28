/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.unidirectedGraphApplcation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class Tester {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\DSA\\src\\dsa\\Graph\\graph.txt");
        File file2 = new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\dsa\\Graph\\graph.txt");
        Scanner sc = new Scanner(new FileReader(file2));
        System.err.println("Enter number of vertices. ");
        int countOfVertices = sc.nextInt();
        AdjacencyUndirectedGraph am = new AdjacencyUndirectedGraph(countOfVertices);
        
        System.out.println("Number of edge you want");
        int edges = sc.nextInt();
        
        for(int i =0;i< edges;i++){
            int row = sc.nextInt();
            int column = sc.nextInt();
            am.makeEdge(row, column);
        }

        am.printList();
        System.out.println("degree of vertices 1 is: "+ am.degree(1));
        System.out.println("degree of vertices heighest is: "+ am.maxDegree());
        
        ConnectedComponent depthFirstGraphs = new ConnectedComponent(am);
        if(depthFirstGraphs.isConnected(2, 0)){
            System.out.println("connected");
        }
        
        System.out.println("total number of component in given graphs are: " + depthFirstGraphs.TotalComponent());
        
        
            
    BipartiteGraphWithBFS bg = new BipartiteGraphWithBFS(am, 0);
    if(bg.isBiPartite(am, 0)){
        System.out.println("given graph is bipartite");
    }else{
        System.out.println("not bipartite");
    }
    }
}

