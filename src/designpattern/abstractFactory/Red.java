/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.abstractFactory;
 
import designpattern.abstractFactory.Color;
/**
 *
 * @author yokukuma
 */
public class Red extends Color{

    @Override
    public void fill() {
        System.out.println("filling with red color");
    }
    
}
