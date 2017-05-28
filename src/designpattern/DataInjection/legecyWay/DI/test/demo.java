/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.legecyWay.DI.test;

import designpattern.DataInjection.legecyWay.DI.consumer.Consumer;
import designpattern.DataInjection.legecyWay.DI.consumer.DIApplication;
import designpattern.DataInjection.legecyWay.DI.injector.EMailServiceInjector;
import designpattern.DataInjection.legecyWay.DI.injector.MessageServiceInjector;
import designpattern.DataInjection.legecyWay.DI.injector.SMSServiceInjector;

/**
 *
 * @author yokukuma
 */
public class demo {

    public static void main(String[] args) {
        String msg = "Hi Yogi";
        String email = "yogi@abc.com";
        String phone = "12345678";
        MessageServiceInjector injector=null;
        Consumer app = null;
        
        //Send EMail
        injector = new EMailServiceInjector();
        app = injector.getConsumer();
        app.ProcessMessage(msg, email);
        
        //send Message 
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.ProcessMessage(msg, phone);
    }
}
