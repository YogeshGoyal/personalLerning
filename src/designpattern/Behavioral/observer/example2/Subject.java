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
public interface Subject {
    public void regiesterObserver(Observer o);
    public void unRegiesterObserver(Observer o);
    public void notifyObservers();
}
