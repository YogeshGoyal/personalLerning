/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.GeneralJava;


/**
 *
 * @author yokukuma
 */
public class Sample1 {

    public static void main(String[] args) throws InterruptedException {
        long starttime = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.err.println("");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.err.println("");
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.err.println("");
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.err.println("");
            }
        });
        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.err.println("");
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        long endtime = System.currentTimeMillis();
        System.err.println("total time taken: " + (endtime - starttime) + " in mili seconds");
    }

}
