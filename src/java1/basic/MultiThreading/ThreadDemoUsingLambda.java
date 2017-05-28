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
public class ThreadDemoUsingLambda {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i = 0;i<5;i++){
                System.out.println("hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDemoUsingLambda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        };
        Thread t1 = new Thread(r);
        t1.start();
    }
}
