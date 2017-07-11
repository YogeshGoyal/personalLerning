/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.observer.javainbuildobserver;

import java.util.Observable;
import java.util.Observer;



/**
 *
 * @author yokukuma
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float pressure;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("new current temp condition is: temp: "+ temp + " pressure:" 
            +pressure + " humidity: "+ humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WhetherData){
            WhetherData weatherData = (WhetherData)o;
            humidity = weatherData.getHumidity();
            pressure = weatherData.getPressure();
            temp = weatherData.getTemp();
            display();
        }
    }

}
