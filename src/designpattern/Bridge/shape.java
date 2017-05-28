/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Bridge;

/**
 *
 * @author yokukuma
 */
public abstract class Shape {
    
    //Composition 
    protected Color color;
    
    public Shape(Color color){
        this.color = color;
    }
    
    abstract void applyColor();
}
