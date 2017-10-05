/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.DataInjection.example2;

/**
 *
 * @author yokukuma
 */
public class CowSpeakBehaviour implements SpeakBehaviour{

    @Override
    public void speak() {
        System.out.println("Cow speaking");
    }
    
}
