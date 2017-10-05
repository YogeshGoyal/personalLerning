/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.observer.example1;

import java.util.ArrayList;

/**
 *
 * @author yokukuma Uses the Subject interface to update all Observers
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;

    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber() {
        // Creates an ArrayList to hold all observers
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        // Adds a new observer to the ArrayList
        observers.add(o);
    }

    @Override
    public void deRegister(Observer o) {
        // Get the index of the observer to delete
        int index = observers.indexOf(o);
        System.out.println("Observer" + index + 1 + " deleted");
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, applPrice, googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
    }

    // Change prices for all stocks and notifies observers of changes
    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
    }
}
