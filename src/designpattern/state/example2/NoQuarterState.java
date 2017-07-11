/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.state.example2;

/**
 *
 * @author yokukuma
 */
public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    
    @Override
    public void insertQuarter() {
        System.out.println("you insrted quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't insrted coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("your turn , but haven't insrted coin");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");
    }
    
}
