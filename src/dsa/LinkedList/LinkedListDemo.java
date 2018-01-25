/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.LinkedList;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class LinkedListDemo {

    public static void main(String[] args) throws InterruptedException {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.addLast(10);
        ls.addLast(15);
        ls.addLast(12);
        ls.addLast(13);
        ls.addLast(20);
        ls.addLast(14);
        //       ls.delete(0);
        //ls.delete(0);
//        System.out.println("Before reverse: ");
//        Thread.sleep(100);
        for (Integer l : ls) {
            System.out.println(l);
        }
        ls.swapKey(12,20);
        System.out.println("After swapping");
        for (Integer l : ls) {
            System.out.println(l);
        }

//        ls.reverseRec();
//        System.out.println("After reverse: ");
        //ls.printList();

        for (Integer l : ls) {
            System.out.println(l);
        }

        //delete 3rd element 
//        System.out.println("value at 3rd position: " + ls.getNth(15));
//        for (Integer l : ls) {
//            System.out.println("values are: " + l);
//        }
//    List<Integer> list = new java.util.LinkedList<>();
//    list.add(1);
//    list.add(11);
//    list.add(2);
//    list.add(4);
//        for (Integer integer : list) {
//            System.out.println("values are: "+ integer);
//        }
    }
}
