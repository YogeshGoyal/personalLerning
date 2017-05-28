/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FactoryMethod;

import designpattern.FactoryMethod.*;

/**
 *
 * @author yokukuma
 */
public abstract class Color {
    public abstract void fill();
    public abstract Color getInstance();
}
