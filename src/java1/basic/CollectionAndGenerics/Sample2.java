/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class Sample2 {

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(712);
        ls.add(711);
        ls.add(343);
        ls.add(421);
        ls.add(819);

        // Compartor is a Inteface need implemantation
        // CompImpl class compare 2 object based on last digit and if compare result is 1 then element
        // will be swapped else it will be same
        Comparator<Integer> cmp = new CompImpl();
        // below implemantation of Comparator interface will compare based on last 2 digit
        // below implemantation is basen on Anonymous class
        Comparator<Integer> cmp2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 100 > o2 % 100) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        
        
        // below implematation we are using lambda expression
        
       Comparator<Integer> cmp3 = (o1, o2) -> {
                if (o1 % 100 > o2 % 100) {
                    return 1;
                } else {
                    return -1;
                }
            };
        
        //Collections.sort(ls);
        //Collections.sort(ls, cmp);
        // Collections.sort(ls, cmp2);
        // Collections.sort(ls, cmp3);
        // even no need to create object of Comparator class seperatly can be
        // called in method itself
        
        Collections.sort(ls,(o1, o2) -> {
                if (o1 % 100 > o2 % 100) {
                    return 1;
                } else {
                    return -1;
                }
            });
        
        // there is another way to print list element is forEch wihchi si part Stream API of JAVA 1.8 (Lambda Expression)
        ls.forEach(System.out::println);

    }
}
