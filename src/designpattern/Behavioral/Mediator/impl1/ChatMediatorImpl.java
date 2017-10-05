/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Behavioral.Mediator.impl1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class ChatMediatorImpl implements ChatMediator{

    private List<User> users;

    public ChatMediatorImpl() {
        users = new ArrayList<>();
    }
    
    
    
    @Override
    public void sendMessage(String msg, User user) {
        for (User user1 : users) {
            if(user1 != user){
                user1.receive(msg); 
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
    
}
