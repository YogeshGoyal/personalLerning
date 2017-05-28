/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.inBuildDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author yokukuma
 */
public class Sample1 {

    public static void main(String[] args) {
//        List<String> collection = new ArrayList<>();
//        collection.add("yogesh");
//        collection.add("kumar");
//        collection.add("goyal");
//        collection.add("mnit");
//        for (String string : collection) {
//            System.out.println(string);
//        }
//        Iterator<String> itr = collection.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        List<Integer> ls = Arrays.asList(1,3,3,5,2,4,5,2,6);
//        for (Integer l : ls) {
//            System.out.println(l);
//        } 
//            System.out.println("position of 2: " + Collections.binarySearch(ls, 2));
//            System.out.println("max of list:" + Collections.max(ls));
//          
//   
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.addFirst("yogesh");
//        linkedList.addFirst("kumar");
//        linkedList.addFirst("goyal");
//        linkedList.addLast("name");
//        linkedList.add(1, "SS");
//        for (String string : linkedList) {
//            System.out.println(string);
//        }
//        System.out.println("first element: "+ linkedList.get(0));
//
//        ListIterator<String> interator = linkedList.listIterator(linkedList.size());
//        while(interator.hasPrevious()){
//            System.out.println(interator.previous());
//        }
//        Vector<String> vector = new Vector<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        vector.add("a");
//        vector.add("c");
//        vector.add("b");
//        System.err.println(vector.get(1));
//        
//        Stack<String> stack = new Stack<>();
//        stack.push("yogesh");
//        stack.push("kumar");
//        stack.push("goyal");
//        
//        for (String string : stack) {
//            System.out.println("element are: "+ string);
//        }
//        
//        System.out.println("value seeked is: "+ stack.peek());
//        Stack<String> stack2 = (Stack<String>)stack.clone();
//        for (String string : stack2) {
//            System.out.println("element are: "+ string);
//        }

//        PriorityQueue<String> queue = new PriorityQueue<String>();
//        queue.add("Amit");
//        queue.add("Vijay");
//        queue.add("Karan");
//        queue.add("Jai");
//        queue.add("Rahul");
//        //System.out.println("head:" + queue.element());
//        //System.out.println("head:" + queue.peek());
//        //System.out.println("iterating the queue elements:");
//        Iterator itr = queue.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//        queue.remove();
//        queue.poll();
//        System.out.println("after removing two elements:");
//        Iterator<String> itr2 = queue.iterator();
//        while (itr2.hasNext()) {
//            System.out.println(itr2.next());
//        }


        HashMap<Integer,String> map = new HashMap<>();
        map.put(2, "yogesh");
        map.put(1, "zumar");
        map.put(3, "kumar");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key is: " + key + " value is: " + value);
        }
        
        System.out.println("OUTPUT: " + map.get(1));
        
    }

}
