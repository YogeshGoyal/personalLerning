/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Mediator.impl1;

/**
 *
 * @author yokukuma
 */
public abstract class  User {
    protected ChatMediator chatMediator ;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }
    
    public abstract void send(String msg);
    
    public abstract void receive(String msg);
    
}
