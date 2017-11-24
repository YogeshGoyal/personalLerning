/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa2.misc;

/**
 *
 * @author yokukuma
 */
public class myDeadlock {

    public static void main(String[] args) {
        String str1 = "string1";
        String str2 = "string2";
        Thread t1 = new Thread("Thread1") {
            @Override
            public void run() {
                while (true) {
                    synchronized (str1) {
                        synchronized (str2) {
                            System.out.println(str1 + str2);
                        }
                    }
                }
            }
        };
        Thread t2 = new Thread("Thread2") {
            @Override
            public void run() {
                while (true) {
                    synchronized (str2) {
                        synchronized (str1) {
                            System.out.println(str2 + str1);
                        }
                    }
                }
            }
        };
        
        
        t2.start();
        t1.start();
        
    }
}
