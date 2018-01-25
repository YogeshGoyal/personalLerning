/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.CollectionAndGenerics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author yokukuma
 */
public class MapSample {

    public static void main(String[] args) {
        // hashSet does not maintain sequence of keys 
        //  Hashtable (C) can be used inplace of hashMap which is Synchronized
        // hashtable and hashMap difference of synchronization  and 
        // hashmap is fast and allows  one null key but hashtable doesn't
        //HashMap is not thread safe
        
        // in hasmap and hashtable insertion order is not fixed, to acchive fixed insert
        // order use LINKEDHASHMAP 
        // TREEHASHMAP all element are sorted 
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "yogesh");
        map.put(3, "kumar");
        map.put(2, "goyal");
        map.put(2, "goyal");
        map.put(22, "goyal");
        map.put(12, "goyal");

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println("key: " + key + " value: " + map.get(key));
        }
    }
}
