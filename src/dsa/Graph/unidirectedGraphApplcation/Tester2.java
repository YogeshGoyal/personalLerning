/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.unidirectedGraphApplcation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class Tester2 {
    public static void main(String[] args) throws FileNotFoundException {
        
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
        
        CycleUnDirectedGraph cycle = new CycleUnDirectedGraph(am);
        if(cycle.isCycleExist(am)){
            System.out.println("Cycle exists");
        }   
    }
}
