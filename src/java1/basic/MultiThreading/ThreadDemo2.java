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
public class ThreadDemo2  {

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                // to access method on thread inside thread itself use Thread.currentThread() static method
                System.out.println(Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDemoUsingLambda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDemoUsingLambda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t1.setName("hi");
        t2.setName("hello");
        t1.setDaemon(true);
        System.err.println("name of thread 1:" + t1.getName());
        System.err.println("name of thread 2:" + t2.getName());
        System.err.println("name of thread 2:" + t2.isDaemon());
        System.err.println("name of thread 2:" + t1.isDaemon());
        t1.start();
        t2.start();
        
        //join method will wait for mentioned thread to complete before processing further
        t1.join();
        t2.join();
        
        // below method will check if given threa is alive or not 
        System.err.println(t1.isAlive());
        System.err.println("bye"); 
    }

}
