/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.legecyWay.DI.services;

/**
 *
 * @author yokukuma
 */
public class SMSServices implements MessageService {

    @Override
    public void sendMail(String message, String receiver) {
        System.out.println("SMS sent to: " + receiver + " Message: " + message);
    }
}
