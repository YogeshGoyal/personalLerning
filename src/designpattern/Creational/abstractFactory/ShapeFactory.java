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
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shape getShape(String shape) {
                if(shape == null){
            return null;
        }
        
        if("RECTANGLE".equalsIgnoreCase(shape)){
            return new Rectangle();
        }else         if("SQUARE".equalsIgnoreCase(shape)){
            return new Square();
        }else         if("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        }else {
            return null;
        }
    }
    
}
