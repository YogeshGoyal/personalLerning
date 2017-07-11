/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.observer.javainbuildobserver;

import designpattern.observer.example2.*;
import java.util.ArrayList;
import javafx.beans.Observable;

/**
 *
 * @author yokukuma
 */
public class WhetherData extends java.util.Observable{
    private float temp;
    private float pressure;
    private float humidity;

    public WhetherData() {
    }

    
    public void measurementChanged(){
        setChanged();
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
