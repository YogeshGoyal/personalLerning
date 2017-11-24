/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.Bridge;

/**
 *
 * @author yokukuma
 */
public abstract class Shape {
    public Color color;

    public Shape(Color c) {
        this.color = c;
    }
    

    /**
     *
     */
    abstract  void applyColor();
}
