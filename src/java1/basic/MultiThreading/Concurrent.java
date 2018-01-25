/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.MultiThreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author yokukuma
 */
public class Concurrent {
    static Map<String ,Integer> orders = new ConcurrentHashMap<>();
    
    
    static void processOrders(){
        for (String city : orders.keySet()) {
            for (int i = 0; i < 10; i++) {
                synchronized(Concurrent.class){
                    Integer oldID= orders.get(city);
                    orders.put(city, oldID+1);
                }
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        orders.put("delhi", 1);
        orders.put("mumbai", 1);
        orders.put("kolkata", 1);
        orders.put("chennail", 1);
        
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(Concurrent::processOrders);
        service.submit(Concurrent::processOrders);
        
        service.awaitTermination(1, TimeUnit.SECONDS);
        service.shutdown();
        
        System.out.println(orders);
    }
}
