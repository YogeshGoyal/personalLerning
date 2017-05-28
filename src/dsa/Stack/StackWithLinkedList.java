/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Stack;

import java.util.Iterator;

/**
 *
 * @author yokukuma
 */
public class  StackWithLinkedList<Item> implements Iterable<Item>{

    private Node top ;
    
    public void push(Item value){
        Node node = new Node();
        node.data = value;
        node.next = top;
        top = node;
    }
    
    public Item pop(){
        if(isEmpty()){
            return null;
        }else{
            Item item  = top.data;
            top = top.next;
            return item;
        }
    }
    
    public Boolean isEmpty(){
        return top == null;
    }
    

    private class Node{
        Item data;
        Node next;
    }
    
    public Item peek(){
        if(isEmpty()){
            return null;
        }
        return top.data;
    }
    
    @Override
    public Iterator iterator() {
        return new NestedIterator();
    }
    
    class NestedIterator implements Iterator<Item>{
        Node current = top;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item data = current.data;
            current = current.next;
            return data;
        }
        
    }
}
