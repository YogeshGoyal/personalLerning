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
public class Demo {
    public static void main(String[] args) {
        Animal cow = new Animal(new CowSpeakBehaviour());
        Animal cat = new Animal(new CatSpeakBehaviour());
        cow.speak();
        cat.speak();
    }
}
