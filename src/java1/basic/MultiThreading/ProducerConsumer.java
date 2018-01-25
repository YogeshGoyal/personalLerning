/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.MultiThreading;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class ProducerConsumer {

    
    
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        producer.start();
        consumer.start();
        
        producer.join();
        consumer.join();
    }
    
    
    
    
    
    private LinkedList<Integer> list = new LinkedList<>();
    private int capicity = 3;
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capicity) {
                    System.err.println("I am producer waiting");
                    wait();
                }
                System.out.println("producer produde: " + value);
                list.add(value++);

                //notify the consumer thresd if any waiting
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                Thread.sleep(1000);
                while (list.size() == 0) {
                    System.err.println("I am consumer waiting");
                    wait();
                }
                Thread.sleep(100);
                int val = list.removeFirst();
                System.err.println("value consumed: " + val);
                // wait up producer 
                notify();
                Thread.sleep(1000);
            }
        }
    }

}
