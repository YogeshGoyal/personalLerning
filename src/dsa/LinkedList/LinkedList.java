/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.LinkedList;

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

    public Boolean isEmpty() {
        return head == null;
    }

    public void addFirst(E element) {
        Link<E> link = new Link<>(element);
        if (head == null) {
            last = head = link;
        } else {
            link.setNext(head);
            head = link;
        }
    }

    public void addLast(E element) {
        Link<E> link = new Link<>(element);
        if (last != null) {
            last.setNext(link);
            last = link;
        } else {
            last = head = link;
        }
    }

    public void printList() {
        Link<E> currentLink = head;
        while (currentLink != null) {
            System.err.println("value are: " + currentLink.getElement());
            currentLink = currentLink.getNext();
        }
    }

    public E getNth(Integer index) {
        Link<E> current = head;
        int counter = 0;
        while (current != null) {
            if (index == counter) {
                return current.getElement();
            }
            counter++;
            current = current.getNext();
        }

        return null;
    }

    void delete(int index) {
        Link<E> current = head;
        int counter = 1;
        if (current == null) {
            return;
        }
        if (index == 0) {
            head = head.getNext();
        }
        while (current.getNext() != null) {
            if (index == counter) {
                current.setNext(current.getNext().getNext());
                return;
            }
            counter++;
            current = current.getNext();
        }
    }

    //iterative approch to revesre linkedList
    void reverse() {
        Link<E> current = head;
        Link<E> next, prev = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;

    }

    void reverseRec() {

        head = reverseRec(head);
    }

    private Link<E> reverseRec(Link<E> h) {
        if (h == null || h.getNext() == null) {
            return h;
        } else {
            Link<E> temp = reverseRec(h.getNext());
            Link<E> temp2 = h.getNext();
            temp2.setNext(h);
            h.setNext(null);
            return temp;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Link<E> temp;
        public LinkedListIterator() {
            temp = head;
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

class Link<E> {

    E element;
    private Link<E> next;

    public Link(E element) {
        this.element = element;
        this.next = null;
    }

    public void setNext(Link<E> next) {
        this.next = next;
    }

    public Link<E> getNext() {
        return next;
    }

    public E getElement() {
        return element;
    }

}
