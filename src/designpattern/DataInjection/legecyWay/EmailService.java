/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.legecyWay;

/**
 *
 * @author yokukuma
 */
public class EmailService {
    public void sendMail(String message, String receiver){
        System.out.println("Email sent to: "+ receiver + " Message: "+ message);
    }
}
