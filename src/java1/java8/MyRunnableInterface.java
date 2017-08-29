/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.java8;

/**
 *
 * @author yokukuma
 */
public class MyRunnableInterface {

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread:" + i);
            }
        };

        Thread t1 = new Thread(r);
        t1.start();
        
        t1.join();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("parent thread:" + i);
        }
    }
}
