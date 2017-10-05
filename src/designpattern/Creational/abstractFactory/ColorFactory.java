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
public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        
        if("RED".equalsIgnoreCase(color)){
            return new Red();
        }else         if("GREEN".equalsIgnoreCase(color)){
            return new Green();
        }else         if("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }else {
            return null;
        }
        
    }

    @Override
    public Shape getShape(String shape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
