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
// Represents each Observer that is monitoring changes in the subject
public class StockObserver implements Observer {

    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    // Static used as a counter
    private static int observerIDTracker = 0;

    // Used to track the observers
    private int observerID;
    
    // Will hold reference to the StockGrabber object
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }
    
    
    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.applPrice = applPrice;
        this.googPrice = googPrice;
        printThePrices();

    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +applPrice + "\nGOOG: " + googPrice + "\n");

    }
}
