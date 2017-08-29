/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.java8;

import java.util.function.Predicate;

/**
 * Predicate are method with single argument and return type boolean always
 * @author yokukuma
 */
public class Predicatedemo {
    public static void main(String[] args) {
        Predicate<Integer> p1 = t -> (t>20);
        System.out.println(p1.test(Integer.SIZE));
        
        // below predicate to chek if string length is greater then 5
        Predicate<String> predicateString = t->(t.length()>5);
        System.out.println(predicateString.test("xyz"));
        System.out.println(predicateString.test("xyzsdgdt"));
        
    }
 
}
