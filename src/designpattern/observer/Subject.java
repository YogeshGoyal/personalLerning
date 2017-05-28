/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.observer;

/**
 *
 * @author yokukuma
 * This interface will handle adding new observer and deleting them
 */
public interface Subject {
    public void register(Observer o);
    public void deRegister(Observer o);
    public void notifyObserver();
}
