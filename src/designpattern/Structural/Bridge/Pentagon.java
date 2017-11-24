/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.Bridge;
import designpattern.Structural.Bridge.Shape;

/**
 *
 * @author yokukuma
 */
public class Pentagon extends Shape{

    public Pentagon(Color color) {
        super(color);
    }

    
    @Override
    void applyColor() {
        System.out.print("Pentagon Filled with color ");
        color.applyColor();
    }
    
}