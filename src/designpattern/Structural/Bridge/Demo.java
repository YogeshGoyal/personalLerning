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
public class Demo {
    public static void main(String[] args) {
        Shape triangle = new Trangle(new RedColor());
        triangle.applyColor();
        
        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
