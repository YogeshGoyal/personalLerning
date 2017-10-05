/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.ChainOfResponsbility;

/**
 *
 * @author yokukuma
 */
public interface DispenseChain {
    void setNextDispense(DispenseChain d);
    void dispense(Currency amount);
}
