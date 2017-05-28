/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class SyncEx1 {

    public static void main(String[] args) {
        Counting counting = new Counting();
        
        RunnableImpl r1 = new RunnableImpl(counting);
        //RunnableImpl r2 = new RunnableImpl(counting);

        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r1, "B");
        Thread t3 = new Thread(r1, "C");
        //Thread t4 = new Thread(r2, "D");
        t1.start();
        t2.start();
        t3.start();
        //t4.start();

    }
}

class RunnableImpl implements Runnable {
    
    Counting counting;

    public RunnableImpl(Counting counting) {
        this.counting = counting;
    }
    
    
    @Override
    public void run() {
        System.out.println("current thread is: " + Thread.currentThread().getName());
        System.out.println(" before Current counter vaue is: " + counting.printCounter());
        counting.increment();
        System.out.println(" after Current counter vaue is: " + counting.printCounter());
    }

}

class Counting {

    static int counter = 0;

    public static void increment() {
        synchronized (Counting.class) {
            counter++;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Counting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized int printCounter() {
        System.out.println("counter is: " + counter);
        return counter;
    }
}
