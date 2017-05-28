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
public interface ChatMediator {
    public void sendMessage(String msg, User user);
    void addUser(User user);
}
