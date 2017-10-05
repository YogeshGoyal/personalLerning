/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.DataInjection.example1.DI.injector;

import designpattern.Creational.DataInjection.example1.DI.consumer.Consumer;
import designpattern.Creational.DataInjection.example1.DI.consumer.DIApplication;
import designpattern.Creational.DataInjection.example1.DI.services.SMSServices;

/**
 *
 * @author yokukuma
 */
public class SMSServiceInjector implements MessageServiceInjector{

    @Override
    public Consumer getConsumer() {
        return new DIApplication(new SMSServices());
    }
    
}
