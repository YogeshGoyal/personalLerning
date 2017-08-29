/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.java8;

import java.util.function.Function;

/**
 *
 * @author yokukuma
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<String,Integer> f = (t) -> (t.length());
        
        System.out.println(f.apply("yogesh"));
                
    }
}
