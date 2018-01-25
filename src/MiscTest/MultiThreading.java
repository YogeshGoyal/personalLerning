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
public class MultiThreading {

    public static void main(String[] args) {
        Customer c = new Customer();
        Thread t1 = new Thread(() -> {
            c.withdraw(15000);
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
            }
            c.deposit(2000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
            }
            c.deposit(2000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
            }
            c.deposit(2000);
            
        });
        //t1.start();
        //t2.start();
        MultiThreading mt = new MultiThreading();
        //mt.deadlock();
        
        Table t = new Table();
        t.printTable(10);
        
    }
    
     void deadlock(){
               String resource1 = "STR1";
        String resource2 = "STR2";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1  
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
        
        Thread thread = new Thread(new Runnable() {
                   @Override
                   public void run() {
                       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                   }
               });
    }
}

class Table {

    void printTable(int num) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num * i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    void printTableWithSyncBlock(int num) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num * i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    synchronized void printTableWithSynconStaticMethod(int num) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num * i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    synchronized void printTableWithSynchMethod(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

class Customer {

    int amount = 12000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        while (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
}
