/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa2.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 *
 * @author yokukuma
 */
public class LinkedList<E> implements Iterable<E>{

    private Link<E> head;
    private Link<E> last;

    public LinkedList() {
        this.head = null;
    }
    
    
    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }
    
    public Boolean isEmpty(){
        return head == null;
    }
    public void addLast(E element){
        Link<E> link = new Link<>(element);
        if(last!=null){
            last.setNext(link);
            last = link;
        }else{
            head = last = link;
        }
    }

    public void addFirst(E element){
        Link<E> link = new Link<>(element);
        if(head!=null){
            link.setNext(head);
            head = link;
        }else{
            head = last = link;
        }
    }
    
    public void printList(){
        Link<E> temp =head;
        while(temp != null){
            System.out.println("element:"+ temp.getElement());
            temp = temp.getNext();
        }
    }
    
    public void reverse(){
        Link<E> current = head;
        Link<E> next, prev = null;

        while(current !=null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;

    }
    private  class LinkedListIterator implements Iterator<E> {
        private Link<E> temp;
        public LinkedListIterator() {
            temp =  head;
        }
        
        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            E data = temp.getElement();
            temp = temp.getNext();
            return data;
        }
    }
    

    
}


class Link<E>{
    private E element;
    private Link<E> next;

    public Link(E element) {
        this.element = element;
        this.next = null;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Link<E> getNext() {
        return next;
    }

    public void setNext(Link<E> next) {
        this.next = next;
    }
     
    
}