/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.DataInjection.legecyWay.DI.injector;

import designpattern.DataInjection.legecyWay.DI.consumer.Consumer;
import designpattern.DataInjection.legecyWay.DI.consumer.DIApplication;
import designpattern.DataInjection.legecyWay.DI.services.EmailServices;

/**
 *
 * @author yokukuma
 */
public class EMailServiceInjector implements MessageServiceInjector{

    @Override
    public Consumer getConsumer() {
        DIApplication app = new DIApplication();
        app.setService(new EmailServices());
        return app;
    }
    
}
