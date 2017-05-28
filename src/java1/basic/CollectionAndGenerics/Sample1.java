/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.CollectionAndGenerics;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author yokukuma
 */
public class Sample1 {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        // Collection<Integer> c = new ArrayList<>(); // after 1.7 above line can be written in this way 
        // with help of Collection(I) interface index element cant be added 
        // so to add element at particular index use List(I) //
        // Set(I) does not print in order 
        // for getting output in sorted  and unique form use TreeSet(C) inplace of Hashset(C)
        c.add(3);
        c.add(2);
        c.add(3);
        c.add(1);
        c.add(3);
        c.add(30);
        c.add(12);
        
        
         //Collections.sort(list);  List(I) can be sorted by Collections(C) method sort
        // there are 2 ways to fetch value from Coollection either use iterator or use enhanced for loop
        Iterator<Integer> itr = c.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//        
//        for (Integer integer : c) {
//            // System.out.println("value in array c: "+ integer);
//        }
        
        
//        Set<Integer> set = new TreeSet<>();
//        set.addAll(c);
//        List<Integer> s = new ArrayList<>();
//        s.addAll(set);
//        s.add(1, 20);
//        for (Integer integer : s) {
//            System.err.println("value in array s : " + integer);
//        }
//
//        Map<Integer, Integer> m = new HashMap<>();
//        for (Integer integer : c) {
//            if(m.containsKey(integer)){
//                Integer i = m.get(integer);
//                i= i+1;
//                m.put(integer, i);
//            }else{
//                m.put(integer, 1);
//            }
//        }
//
//        // if we want to use key value pair use Map(I)
//        // Map(I) has key.value pair
//        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//
//            System.err.println("key: " + key + " value: " + value);
//        }
//
    }

}
