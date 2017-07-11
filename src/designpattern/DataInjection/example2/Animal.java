/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.example2;

/**
 *
 * @author yokukuma
 */
public class Animal {
    SpeakBehaviour speak;

    public Animal(SpeakBehaviour speak) {
        this.speak = speak;
    }
    
    public void speak(){
        this.speak.speak();
    }
    
}
