/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os;

import java.util.concurrent.Semaphore;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma ATM design so only 4 person can enter at a time
 */
public class SemaphoreTest {

    // max 4 person 
    static Semaphore semaphore = new Semaphore(4);

    static class MyThread extends Thread {

        String threadName = "";

        public MyThread(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {

            try {
                System.out.println(threadName + ": acquairng lock...");
                System.out.println(threadName + ": avaialble locks are: " + semaphore.availablePermits());
                semaphore.acquire();

                System.out.println(threadName + ": got permit.");

                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(threadName + " : is performing operation " + i
                                + ", available Semaphore permits : "
                                + semaphore.availablePermits());

                        // sleep 1 second
                        Thread.sleep(1000);
                    }
                } finally {
                    System.out.println(threadName + " : releasing lock...");
                    semaphore.release();
                    System.out.println(threadName + " available Semaphore permits now : "
                            + semaphore.availablePermits());
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(SemaphoreTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    };
    
    public static void main(String... str){
        System.out.println("total avaialbe semaphores are: "+ semaphore);
        
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        MyThread t3 = new MyThread("C");
        MyThread t4 = new MyThread("D");
        MyThread t5 = new MyThread("E");
        MyThread t6 = new MyThread("F");
        MyThread t7 = new MyThread("G");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
