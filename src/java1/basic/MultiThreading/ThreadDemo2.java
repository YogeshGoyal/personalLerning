/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.MultiThreading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileWriteEvent;
import jdk.jfr.events.FileWriteEvent;
/**
 *
 * @author yokukuma
 */
public class ThreadDemo2  {

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\java1\\basic\\MultiThreading\\testing.txt")));
            } catch (IOException ex) {
                Logger.getLogger(ThreadDemo2.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {
                    bw.write("hi");
                    bw.flush();
                    bw.newLine();
                } catch (IOException ex) {
                    Logger.getLogger(ThreadDemo2.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        t1.setDaemon(true);
        //t2.setDaemon(true);
        t1.start();
        //t2.start();
        Thread.sleep(1000);
        //join method will wait for mentioned thread to complete before processing further
        //t1.join();
        //t2.join();
        
        // below method will check if given threa is alive or not 
        
//        new WorkerThread().start();
//
//        try {
//            Thread.sleep(7500);
//        } catch (InterruptedException e) {
//            // handle here exception
//        }
//
//        System.out.println("Main Thread ending") ;
//        
        System.err.println(t1.isAlive());
        System.err.println("bye"); 
    }

}

class WorkerThread extends Thread {

    public WorkerThread() {
        // When false, (i.e. when it's a user thread),
        // the Worker thread continues to run.
        // When true, (i.e. when it's a daemon thread),
        // the Worker thread terminates when the main 
        // thread terminates.
        setDaemon(true); 
    }

    public void run() {
        int count = 0;

        while (true) {
            System.out.println("Hello from Worker "+count++);

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                // handle exception here
            }
        }
    }
}