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
public class GreenColor implements Color{

    @Override
    public void applyColor() {
        System.out.println("Green ");
    }
    
}
