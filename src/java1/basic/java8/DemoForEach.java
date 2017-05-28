/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.java8;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5);
        List<Integer> ls1 = new ArrayList<>();
        ls1.add(1);
        ls1.add(2);
        ls1.add(3);
        ls1.add(4);
        
        //enhanced loop also called External for Loops
//        for (Integer l : ls) {
//            System.err.println(l);
//        }


        // new addition to java 1.8 forEach also called internal for loops
        // foreach expect always Lambda
        ls1.forEach(i-> System.out.println(i));
        // in above code "i-> System.out.println(i)" is implemantation of Consumer interface
        
        // in below way we are using method referece
        // in java 8 metho reference is given by :: , so for exampe
        // if here we are having method hello() we can pass reference as ::hello
        // in below example println method belongs to out object which is defined as
        // static object in System class.
        //  in below way we are calling by METHOD AS REFERENCE (call by method reference)
        ls.forEach(System.out::println);
        // in below example I am creating my own method and passing reference of it.
        ls.forEach(DemoForEach::hello);
        
        
    }
    static void hello(int i){
        System.err.println("hello "+ i);
        }
}
