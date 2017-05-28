/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Stack;

import java.util.Iterator;

/**
 *
 *
 * @author yokukuma
 *
 *
 */
public class StackWithArray<Item> implements Iterable<Item> {

    private int top;
    private int capicity;
    private Item[] array;

    public StackWithArray(int capicity) {
        this.capicity = capicity;
        array = (Item[]) new Object[capicity];
    }

    public StackWithArray() {
    }

    public void push(Item value) {
        if (top == capicity) {
            resizeArray(2 * top);
        }
        array[top++] = value;
    }

    public Item pop() {
        if (isEmpty()) {
            return null;
        }
        if (top < capicity / 4) {
            resizeArray(capicity / 4);
        }
        Item temp = array[--top];
        array[top + 1] = null;
        return temp;
    }

    public Boolean isEmpty() {
        return top == 0;
    }

    private void resizeArray(int size) {
        Item[] temp = (Item[]) new Object[size];
        for (int i = 0; i < top; i++) {
            temp[i] = array[i];
        }
        array = temp;
        capicity = size;
    }

    @Override
    public Iterator iterator() {
        return new NestedIterator();
    }

    class NestedIterator implements Iterator<Item> {

        private int current = top;

        @Override
        public boolean hasNext() {
            return current != 0;
        }

        @Override
        public Item next() {
            return array[--current];
        }

    }

}
