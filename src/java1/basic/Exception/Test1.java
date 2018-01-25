/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.Exception;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class Test1 {
    public synchronized void print(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                notify();
                wait();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Test1 t = new Test1();
        
        Thread t1 = new Thread(()->{
            t.print();
        });
        Thread t2 = new Thread(()->{
            t.print();
        });
        
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}


class A{
    public void hello() throws Exception{
        System.out.println("hello from A");
    }
}

class B extends A{
    @Override
    public void hello() throws IOException{
        System.out.println("hello from A");
    }
}