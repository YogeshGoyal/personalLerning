/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.Factory;

/**
 *
 * @author yokukuma
 */
public class IOS implements OSInterface{

    
    @Override
    public void message() {
        System.out.println("i am most secure OS");
    }
}
