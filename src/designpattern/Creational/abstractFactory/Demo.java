/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.abstractFactory;

import java.util.Calendar;

/**
 *
 * @author yokukuma
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        
        Shape s1 = shapeFactory.getShape("Rectangle");
        s1.draw();
        Shape s2 = shapeFactory.getShape("Square");
        s2.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        
        Color c1 = colorFactory.getColor("Red");
        c1.fill();
        Color c2 = colorFactory.getColor("Blue");
        c2.fill();
        
        Calendar.getInstance();
    }
}
