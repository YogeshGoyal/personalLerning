/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.advance_topic.executorframework;

/**
 *
 * @author yokukuma
 */
public class OldWayThreadpool {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("before thread start from main class");
        Thread t1 = new Thread(new WorkerThread("1"));
        t1.start();
        
        System.out.println("after thread start from main class");
    }
}
