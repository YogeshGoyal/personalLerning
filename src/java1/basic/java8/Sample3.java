/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class Sample3 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4);
        // all general for loop and enhanced for loop called External For loop
        
        // Internal Iteration with help of STREAM API
        l.forEach(System.out::print); 
        l.forEach(System.out::println);
        l.forEach(i-> System.err.println(i));
        
        
    }
    
}
