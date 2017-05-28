/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.MultiThreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class SynchronizedKeyword {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        
        Thread t1 = new Thread(
        ()->{
            for(int i =0;i<10000;i++){
                c.increment();
            }
        });
        Thread t2 = new Thread(
         ()->{
            for(int i =0;i<10000;i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.getCount());
    }
}

class Counter{
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void increment(){
        count++;
    }
    
}