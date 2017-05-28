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
public class LockDemo {

    public static void main(String[] str) throws InterruptedException {
        //Counter counter = new Counter();
        CounterReEntered counter = new CounterReEntered();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    counter.increment();
                    System.out.println("thread name: " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(LockDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r1, "B");
        Thread t3 = new Thread(r1, "C");
        Thread t4 = new Thread(r1, "D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

class Counter {

    private Lock lock = new Lock();
    private int cnt;

    public int increment() throws InterruptedException {
        lock.lock();
        cnt = cnt + 1;
        printCounter();
        lock.unlock();
        return cnt;
    }

    public void printCounter() throws InterruptedException {
        lock.lock();
        System.out.println("counter is: " + cnt);
        lock.unlock();
    }

}

class CounterReEntered {

    private ReenteredLock lock = new ReenteredLock();
    private int cnt;

    public int increment() throws InterruptedException {
        lock.lock();
        cnt = cnt + 1;
        printCounter();
        lock.unlock();
        return cnt;
    }

    public void printCounter() throws InterruptedException {
        lock.lock();
        System.out.println("counter is: " + cnt);
        lock.unlock();
    }
}
