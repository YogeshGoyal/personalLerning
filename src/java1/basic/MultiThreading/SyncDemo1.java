/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.MultiThreading;

/**
 *
 * @author yokukuma
 */
public class SyncDemo1 implements Runnable {

    public static int counter = 0;
    private static Integer sync = 0;
    @Override
    public void run() {
        while (counter < 10) {
            synchronized (sync) {
                System.err.println("Before Current thread: " + Thread.currentThread().getName() + " counter: " + counter);
                counter++;
                System.err.println("After Current thread: " + Thread.currentThread().getName() + " counter: " + counter);
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] tarr = new Thread[5];
        for (int i = 0; i < tarr.length; i++) {
            tarr[i] = new Thread(new SyncDemo1(), "thread-"+ i);
            tarr[i].start();
        }
        for (int i = 0; i < tarr.length; i++) {
            tarr[i].join();
        }
    }

}
