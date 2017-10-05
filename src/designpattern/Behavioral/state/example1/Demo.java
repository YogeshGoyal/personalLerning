/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.state.example1;

/**
 *
 * @author yokukuma
 */
public class Demo {
    public static void main(String[] args) {
        State turnedOnState = new TVStartState();
        State tunedOffState = new TVStopState();
        
        TVContext tv = new TVContext();
        tv.setState(turnedOnState);
        tv.doAction();

        tv.setState(tunedOffState);
        tv.doAction();        
    }
}
