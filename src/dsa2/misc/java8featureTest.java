/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa2.misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class java8featureTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(33);
        list.add(13);
        list.add(9);
        
        list.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1>o2?1:-1;
            }
            
        });
        
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
