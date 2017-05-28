/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.String;

import static java.lang.Class.forName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Base64;

/**
 *
 * @author yokukuma
 */
public class StringDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException {
        String str = "String for base64 encoding";
        String encoded = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println("Encoded string is: " + encoded);

        byte[] decoded = Base64.getDecoder().decode(encoded);
        System.out.println("Decoded String is: " + new String(decoded));

        A obj = new A("hello");
        Field privateStringField = A.class.getDeclaredField("str");
        Method[] methods = A.class.getMethods();

        for (Method method : methods) {
            System.out.println("method: " + method.getName());
        }
        privateStringField.setAccessible(true);
        String fieldValue = (String) privateStringField.get(obj);
        System.out.println("fieldValue = " + fieldValue);

        Class<?> c = Class.forName("A");
        Method method = c.getDeclaredMethod("sayHello", new Class[] {});
        
    }

}

class A {

    private String str = null;

    public A(String str) {
        this.str = str;
    }
    
    public String sayHello(String str) {
        System.out.println("Say hello to: " + str);
        return "you got it ";
    }
}
