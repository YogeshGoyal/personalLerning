/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Factory;

/**
 *
 * @author yokukuma
 */
public class AndroidOS implements OSInterface{

    @Override
    public void message() {
        System.out.println("i am most frequst used OS");
    }
}
