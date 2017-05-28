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
public class Demo {
    public static void main(String[] args) {
        myApplication app = new myApplication();
        
        app.sendMail("message", "yogesh kumar");
    }
}
