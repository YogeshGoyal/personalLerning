/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FactoryMethod;

import designpattern.FactoryMethod.*;

/**
 *
 * @author yokukuma
 */
public class Green extends Color{

    @Override
    public void fill() {
        System.out.println("filling with Greeen color");
    }

    @Override
    public designpattern.FactoryMethod.Color getInstance() {
        return new Green();
    }
    
}
