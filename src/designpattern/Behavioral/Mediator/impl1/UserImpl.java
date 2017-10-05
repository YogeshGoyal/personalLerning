/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.Mediator.impl1;

/**
 *
 * @author yokukuma
 */
public class UserImpl extends User{

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message: "+ msg);
        chatMediator.sendMessage(msg, this); 
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Receiving Message: "+ msg);
    }
    
}
