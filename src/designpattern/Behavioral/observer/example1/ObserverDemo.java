/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.observer.example1;

/**
 *
 * @author yokukuma
 */
public class ObserverDemo {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        // Create an Observer that will be sent updates from Subject
        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);
        StockObserver observer3 = new StockObserver(stockGrabber);
        stockGrabber.setApplPrice(23);
        stockGrabber.setGoogPrice(33);
        stockGrabber.setIbmPrice(43);
        stockGrabber.notifyObserver();

        stockGrabber.deRegister(observer3);
        stockGrabber.setApplPrice(2);
        stockGrabber.setGoogPrice(3);
        stockGrabber.setIbmPrice(4); 
        stockGrabber.notifyObserver();
        
        //create StockGrabber with help of thread.
        Runnable t1 = new DummyStockGenerator(stockGrabber, 2, "IBM", 23);
        Runnable t2 = new DummyStockGenerator(stockGrabber, 2, "APPLE", 33);
        Runnable t3 = new DummyStockGenerator(stockGrabber, 2, "GOOGLE", 43);
        
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();

    }
}
