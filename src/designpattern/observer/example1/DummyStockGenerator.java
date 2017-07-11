/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.observer.example1;

import com.sun.org.apache.bcel.internal.generic.D2F;
import java.text.DecimalFormat;

/**
 *
 * @author yokukuma
 */
public class DummyStockGenerator implements Runnable{

    private String stock;
    private double price;
    private Subject stockGrabber;
    private int startTime;

    public DummyStockGenerator(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
        this.stockGrabber =stockGrabber;
        this.price = newPrice;
        this.stock = newStock;
        this.startTime =  newStartTime;
    }
    
    @Override
    public void run() {
        for(int i = 0; i< 10;i++){
            try{
                Thread.sleep(2000);
                
            }catch(Exception e){
            }
            double ranNum = Math.random()*(.06) - (.03);
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(price+ranNum));
            if(stock == "IBM") ((StockGrabber)stockGrabber).setIbmPrice(price);
            if(stock == "GOOGLE") ((StockGrabber)stockGrabber).setGoogPrice(price);
            if(stock == "APPLE") ((StockGrabber)stockGrabber).setApplPrice(price);
            
            System.out.println(stock + ": " + df.format((price + ranNum)) + " " + df.format(ranNum));
            System.out.println();


        }
    }
    
}
