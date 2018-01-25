/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author yokukuma
 */
public class MaxPQ <Key extends Comparable<Key>>  implements Iterable<Key>{
    private Key[] pq ;
    private int N;
    
    public MaxPQ(int size) {
        this.pq = (Key[])new Comparable[size+1];
        this.N = 0;
    }
    
    private void resize(int capicity){
        Key[] temp = (Key[]) new Comparable[capicity+1];
        for(int i =0; i<N ;i++){
            temp[i] = pq[i];
        }
        this.pq=temp;
    }
    
    public boolean isEmpty(){
        return N == 0;
    }
    
    public int size(){
        return N ;
    }
    
    public void insert(Key key){
        // double size of array if necessary
        if(N >= pq.length -1 ){
            resize(2*pq.length);
        }
        pq[++N] = key;
        swim(N); 
    }
    public Key delMax(){
        if(isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        Key max = pq[1];
        exchange(1,N--);
        sink(1);
        pq[N+1] = null;
        return max;
    }
    private void swim(int k){
        while( k > 1 && less(k/2,k) ){
            exchange(k/2,k);
            k = k/2;
        }
    }
    private void sink(int k){
        while(2*k <= N){
            int j = 2*k;
            if(j<N && less(j,j+1))j++;
            if(!less(k,j)){
                break;
            }
            exchange(k, j);
            k = j;
        }
    }
    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) < 0 ;
    }
    private void exchange(int i, int j){
        Key temp = pq[j];
        pq[j] = pq[i];
        pq[i] = temp;
    }
    
    public Iterator<Key> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<Key> {

        Key[] copy;
        int pos ;
        public HeapIterator() {
            pos =1;
            copy = (Key[]) new Comparable[N];
            for(int i =0; i<N ;i++){
                copy[i] = pq[i];
            }
        }
        
        @Override
        public boolean hasNext() {
            return pos != N;
        }

        @Override
        public Key next() {
            if (!hasNext()) throw new NoSuchElementException();
            pos++;
            return copy[pos-1];
        }
    }

    public static void main(String[] args) {
        MaxPQ<Integer> pq = new MaxPQ<>(10);
        pq.insert(23);
        pq.insert(43);
        pq.insert(13);
        pq.insert(23);
        pq.insert(23);
        pq.insert(2);
        pq.insert(100);
        while(!pq.isEmpty()){
            System.out.println(pq.delMax());
        }
    }
}
