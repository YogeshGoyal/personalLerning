/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.observer.example2;

import java.util.ArrayList;

/**
 *
 * @author yokukuma
 */
public class WhetherData implements Subject{
    final private ArrayList<Observer> observers;
    private float temp;
    private float pressure;
    private float humidity;

    public WhetherData() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void regiesterObserver(Observer o) {
        if(!observers.contains(o))
            observers.add(o);
    }

    @Override
    public void unRegiesterObserver(Observer o) {
        if(observers.contains(o))
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }
    
    public void measurementChanged(){
        notifyObservers();
    }
    // here I am writing logic to update data foracst 
    public void setMeasurement(float temp, float humidity, float pressure){
        this.temp= temp;
        this.humidity= humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
    
}
