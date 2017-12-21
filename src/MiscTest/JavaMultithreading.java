/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class JavaMultithreading {

    public static void main(String[] args) {
        Thread[] tarr = new Thread[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            tarr[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JavaMultithreading.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("count:" + Thread.currentThread().getName());
                }
            },Integer.toString(count));
            count++;
        }
        for(int i =0;i<10;i++){
            tarr[i].start();    
        }
        

    }
}
