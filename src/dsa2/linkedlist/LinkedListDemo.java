/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa2.linkedlist;

/**
 *
 * @author yokukuma
 */
public class LinkedListDemo {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("yogesh");
        list.addLast("kumar");
        list.addLast("goyal");
        list.addLast("mnit");
        list.addFirst("mr");
        list.reverse();
        //list.printList();
        for (String string : list) {
            System.out.println(string);
        }
    }
}
