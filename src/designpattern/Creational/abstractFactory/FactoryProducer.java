/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.abstractFactory;

/**
 *
 * @author yokukuma
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if("SHAPE".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if("COLOR".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        
        return null;
    }
}
