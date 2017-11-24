/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa2.misc;

import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class MyArrayList {
    private Object[] storage;
    private int actSize = 0;

    public MyArrayList() {
        storage = new Object[10];
    }
    
    public Object get(int index){
        if(index<actSize){
            return storage[index];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public void add(Object obj){
        if(storage.length-actSize <5){
            increseSizeOfArray();
        }
        storage[actSize++]=obj;
    }

    public Object remove(int index){
        if(index<actSize){
            Object element = storage[index];
            storage[index] = null;
            int tmp = index;
            while(tmp<actSize){
                storage[tmp] = storage[tmp+1];
                storage[++tmp] = null;
            }
            return element;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    private void increseSizeOfArray() {
        storage = Arrays.copyOf(storage, storage.length*2);
        System.out.println("new capicity is: "+ storage.length*2);
        
    }
    public int size(){
        return actSize;
    }
    
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        arr.add(new Integer(23));
        arr.add(new Integer(46));
        arr.add(new Integer(67));
        arr.remove(1);
        System.out.println("element at 1 st place is"+ arr.get(1));
    }
}
