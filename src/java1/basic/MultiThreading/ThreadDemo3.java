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
public class ThreadDemo3 implements Runnable {

    public static void main(String[] args) throws Exception{
        Thread myThread = new Thread(new ThreadDemo3(), "myThread");
        myThread.start();
        System.out.println("[" + Thread.currentThread().getName() + "] Sleeping in main thread for 5s...");
        Thread.sleep(5000);
        System.out.println("[" + Thread.currentThread().getName() + "] Interrupting myThread");
        myThread.interrupt();
        System.out.println("[" + Thread.currentThread().getName() + "] Sleeping in main thread for 5s...");
        Thread.sleep(5000);
        System.out.println("[" + Thread.currentThread().getName() + "] Interrupting myThread");
        myThread.interrupt();

    }

    @Override
    public void run() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[" + Thread.currentThread().getName() + "] Interrupted by exception!");
        }
        while (!Thread.interrupted()) {

        }
        System.out.println("[" + Thread.currentThread().getName() + "] Interrupted for the second time.");

    }
}
