/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.CollectionAndGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author yokukuma
 */
public class SetSample {
    public static void main(String[] args) {
        //Set always have uniqu value only
        // hashSet(C) print all value randomly whereas TreeSet(C) will print value in incresing order
        Set<Integer> s = new TreeSet<Integer>();
        s.add(1);
        s.add(9);
        s.add(2);
        s.add(1);
        s.forEach(System.out::println);
    }
}
