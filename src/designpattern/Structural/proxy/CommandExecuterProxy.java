/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Structural.proxy;

/**
 *
 * @author yokukuma
 */
public class CommandExecuterProxy implements CommandExecuter{
    
    private boolean isAdmin;
    private CommandExecuterImpl object;

    public CommandExecuterProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
        if(isAdmin){
            object = new CommandExecuterImpl();
        }
        
    }
    
    
    @Override
    public void executeCommand(String command) {
        if(isAdmin){
            object.executeCommand(command);
        }else{
            System.out.println("you are not admin We will not execute this: "+ command);
        }
        
    }
    
}
