/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph.undirectedGraphApplcation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class AdjacencyUndirectedGraph {

    private final Map<Integer, List<Integer>> adj_list;
    private final int size;

    public AdjacencyUndirectedGraph(int numberOfVerties) {
        this.size = numberOfVerties;
        this.adj_list = new HashMap<>();
        for (int i = 0; i < numberOfVerties; i++) {
            adj_list.put(i, new LinkedList<>());
        }
    }

    public int getSize() {
        return size;
    }

    public void makeEdge(int from, int to) {
        if ((from > size) || (to > size)) {
            System.out.println("Vertiex enttred not present");
            return;
        }
        List<Integer> slist = adj_list.get(from);
        slist.add(to);
        List<Integer> dlist = adj_list.get(to);
        dlist.add(from);
    }

    public void removeEdge(int from, int to) {
        if ((from > size) || (to > size)) {
            System.out.println("Vertiex enttred for removing not present");
            return;
        }
        List<Integer> slist = adj_list.get(from);
        slist.remove(to);
        slist.remove(Integer.valueOf(to));
        List<Integer> dlist = adj_list.get(to);
        dlist.remove(Integer.valueOf(from));

    }

    public void printList() {
        for (Map.Entry<Integer, List<Integer>> val : adj_list.entrySet()) {
            Integer key = val.getKey();
            for (Integer integer : val.getValue()) {
                System.out.println(key + "->" + integer);
            }
        }
    }

    public List<Integer> getEdge(int source) {
        return adj_list.get(source);
    }

    public int degree(int vertices) {
        return adj_list.get(vertices).size();
    }

    public int maxDegree() {
        int max_size = 0;
        for (int i = 0; i < size; i++) {
            if (max_size < adj_list.get(i).size()) {
                max_size = adj_list.get(i).size();
            }
        }
        return max_size;
    }
    public int numberOfSelfLoop(){
        int numberOfLoop=0;
        for (int i = 0; i < size; i++) {
            if(adj_list.get(i).indexOf(i) != -1){
                numberOfLoop++;
            }
        }
        return numberOfLoop;
    }
}
