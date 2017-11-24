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
public class ChatClient {
    public static void main(String[] args) {
        ChatMediatorImpl cmi = new ChatMediatorImpl();
        User u1 = new UserImpl(cmi, "A");
        User u2 = new UserImpl(cmi, "B");
        User u3 = new UserImpl(cmi, "C");
        User u4 = new UserImpl(cmi, "D");
        
        cmi.addUser(u1);
        cmi.addUser(u2);
        cmi.addUser(u3);
        cmi.addUser(u4);
        u1.send("this is first meesage"); 
        
        u2.send("this is first meesage"); 
    }
}
