/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.observer.example2;

/**
 *
 * @author yokukuma
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float pressure;
    private float humidity;
    private Subject whetherData;

    public CurrentConditionDisplay(Subject whetherData) {
        this.whetherData = whetherData;
        whetherData.regiesterObserver(this);
    }
    

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("new current temp condition is: temp: "+ temp + " pressure:" 
            +pressure + " humidity: "+ humidity);
    }

}
