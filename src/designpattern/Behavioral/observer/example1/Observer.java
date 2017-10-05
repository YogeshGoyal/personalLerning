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
interface Observer {
    
    //the observer update method will call when Subject changes
    public void update(double ibmPrice, double applPrice, double googPrice);
}
