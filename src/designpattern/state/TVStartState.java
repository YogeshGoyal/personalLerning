/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.state;

/**
 *
 * @author yokukuma
 */
public class TVStartState implements State{

    @Override
    public void doAction() {
        System.out.println("TV state is Turned ON");
    }
    
}
