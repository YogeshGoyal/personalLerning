/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.observer.javainbuildobserver;

/**
 *
 * @author yokukuma
 */
public class WhetherStation {

    public static void main(String[] args) {
        WhetherData whetherData = new WhetherData();
        CurrentConditionDisplay current = new CurrentConditionDisplay(whetherData);
        whetherData.setMeasurement(12, 13, 23);
        whetherData.setMeasurement(12, 13, 23);
        whetherData.setMeasurement(12, 13, 23);

    }
}
