/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Creational.DataInjection.example1;

import java.util.Calendar;

/**
 *
 * @author yokukuma
 */
public class Demo {
    public static void main(String[] args) {
        myApplication app = new myApplication();
        
        app.sendMail("message", "yogesh kumar");
        
        String str = String.valueOf("yogesh");
        Integer i = Integer.valueOf("1");
        Calendar c = Calendar.getInstance();
        System.out.println(str);
    }
}
