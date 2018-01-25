/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author yokukuma
 */
public class ExecutorWithInputArgument  implements Callable<Integer>{
    Integer x;
    Integer y;

    public ExecutorWithInputArgument(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
       
        Callable<Integer> callable1 = new ExecutorWithInputArgument(12,34);
        Callable<Integer> callable2 = new ExecutorWithInputArgument(11,33);
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> future1 =  es.submit(callable1);
        Future<Integer> future2 =  es.submit(callable2);
        
        es.shutdown();
        
        System.out.println("first output1 "+ future1.get());
        System.out.println("first output2 "+ future2.get());
        
    }

    @Override
    public Integer call() throws Exception {
        return this.x + this.y;
                
    }
            
}



