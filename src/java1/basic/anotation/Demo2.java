/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.anotation;

import java.lang.reflect.Modifier;
import java.nio.file.WatchEvent;
import jdk.nashorn.internal.objects.annotations.Constructor;

/**
 *
 * @author yokukuma
 */
public class Demo2 {
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        Class obj1 = obj.getClass();
        int i = obj1.getModifiers();
        System.out.println("Class modifier is: " + Modifier.toString(i));
        java.lang.reflect.Constructor[] cs = obj1.getConstructors();
        for (java.lang.reflect.Constructor c : cs) {
            System.err.println("constructor is: "+c.toString());
        }
    }
}
