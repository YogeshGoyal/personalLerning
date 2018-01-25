/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.MultiThreading;

import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int size = 4;
        Thread t1 = new Thread(new Producer(stack,size),"Producer");
        
        Thread t2 = new Thread(new Consumer(stack ,size), "Consumer");
        
        t1.start();
        t2.start();
        
        LinkedHashMap
    }
}

class Producer implements Runnable{

    private final Stack<Integer> stack;
    private final int SIZE;

    public Producer(Stack<Integer> stack, int SIZE) {
        this.stack = stack;
        this.SIZE = SIZE;
    }

    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Produced: "+ produce(i));
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //wait if queue is full
    private int produce(int i) throws InterruptedException {
        while(stack.size() == SIZE){
            synchronized(stack){
                System.out.println("Queue is full " + Thread.currentThread().getName()
                + " is waiting for next consumer to consume ");
                stack.wait();    
            }
            
        }
        
        synchronized(stack){
            stack.add(i);
            stack.notifyAll();
        }
        return i;
    }

}


class Consumer implements Runnable{
    private final Stack<Integer> stack;
    private final int SIZE;

    public Consumer(Stack<Integer> stack, int SIZE) {
        this.stack = stack;
        this.SIZE = SIZE;
    }
    
    @Override
    public void run() {
        while(Boolean.TRUE){
            
            try {
                System.out.println("Consumed: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private int consume() throws InterruptedException {
        while(stack.isEmpty()){
            synchronized (stack) {
                System.out.println("Queue is empty " + Thread.currentThread().getName());
                stack.wait();
            }

        }
        
        synchronized(stack){
            stack.notifyAll();
            return stack.pop();
        }
    }
    
}