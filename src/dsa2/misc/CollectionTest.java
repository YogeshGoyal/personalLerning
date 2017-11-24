/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa2.misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author yokukuma
 */
public class CollectionTest {

    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(335);
        c.add(233);
        c.add(138);
        c.add(236);
        c.add(834);
        for (Iterator<Integer> iterator = c.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            //System.out.println(next);
        }

        // below is anonymous class
        Comparator com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }

        };

        
       // below is lambda expression of above anonymous class
        Comparator<Integer> com2 = ( o1,  o2)->{
            return o1 % 10 > o2 % 10 ? 1:-1;
            };
        
        //Collections.sort(c, com);
        //Collections.sort(c, co2);
        Collections.sort(c, ( o1,  o2)->{ return o1 % 10 > o2 % 10 ? 1:-1;});
        for (Integer integer : c) {
            System.out.println(integer);
        }

        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(2);
        set.add(4);
        set.add(2);

        for (Integer integer : set) {
            //  System.out.println(integer);
        }
        //System.out.println("size:"+set.size());

//        A.B obj = new A().new B();
//        obj.j=12;
//        A obj1 = new A();
//        A.C obj2 = new A.C(); 
//        
//        System.out.println(obj2.Z);

        X xObj = ()-> {System.out.println("this is print method");};
       
        xObj.print();
        xObj.hello();
        X.hi();
        Z Zobj = new Z();
        Zobj.hello();
        Y.hi();
    }
}

class A{
    int i =5;
    // below class is member inner class
    class B{
        int j=10;
        
    }
    
    // below is static inner class
    static class C{
        int Z=12;
    }
}

@FunctionalInterface
interface X{
    void print();
    default void hello(){
            System.out.println("hello from interface");
    }
    static void hi(){
            System.out.println("hi from X");
    }
}

@FunctionalInterface
interface Y{
    void print();
    default void hello1(){
            System.out.println("hello from interface");
    }
    static void hi(){
            System.out.println("hi from Y");
    }
}

class Z implements X,Y{

    @Override
    public void print() {
        System.out.println("print from z class");
    }
    
    static void hi(){
            System.out.println("hi from Y");
    }
    
}