/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.advance_topic.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author yokukuma
 */
public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread(""+i);
            //executor.execute(new WorkerThread(""+i));
            executor.submit(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){
            
        }
        System.out.println("Finished all thread");
    }
}
