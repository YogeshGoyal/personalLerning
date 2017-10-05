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
public class WindowsOS implements OSInterface{

    @Override
    public void message() {
        System.out.println("dont worry i am here to DIE :P ");
    }
    
}
