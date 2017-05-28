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
public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] myThread = new Thread[5];
        for (int i = 0; i< myThread.length;i++) {
            myThread[i] = new Thread(new SynchornizationMistakes());
            myThread[i].start();
        }
        for (int i = 0; i< myThread.length;i++) {
            myThread[i].join();
        }
    }
    

}

class SynchornizationMistakes implements Runnable{
    private  int count = 0;
  
    //locking on this object lock
    public synchronized int getCount(){
        return count;
    }
  
    //locking on .class object lock
    public synchronized void increment(){
        count++;
    }

    @Override
    public void run() {
        System.err.println("Current count in before incresing thread:" + Thread.currentThread().getName() + " is "+ count);
        increment();
        System.err.println("Current count in after incresing thread:" + Thread.currentThread().getName() + " is "+ count);
    }
    
}