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
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you cant insrt anther quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("your turn... enjoy");
        gumballMachine.setState(gumballMachine.getSoldState());
        
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
}
