/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.Bridge;

import designpattern.Bridge.Shape;

/**
 *
 * @author yokukuma
 */
public class Trangle extends Shape{

    public Trangle(Color color) {
        super(color);
    }

    
    @Override
    void applyColor() {
        System.out.print("Trinagle Filled with color ");
        color.applyColor();
    }
    
}
