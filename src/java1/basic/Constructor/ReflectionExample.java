/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.Constructor;

import java.lang.reflect.Method;

/**
 *
 * @author yokukuma
 */
public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("java1.basic.Constructor.Dog");
        Object dog = c.newInstance();
        String methodName = "setName";
        Method setNameMethod = dog.getClass().getMethod(methodName, String.class);
        setNameMethod.invoke(dog, "Mishka"); // pass arg
        
        // without parameters, return string
        methodName = "getName";
        Method getNameMethod = dog.getClass().getMethod(methodName);
        String name = (String) getNameMethod.invoke(dog); // explicit cast
        
        // with multiple parameters
        methodName = "printDog";
        Class<?>[] paramTypes = {String.class, int.class};
        Method printDogMethod = dog.getClass().getMethod(methodName, paramTypes);
        printDogMethod.invoke(dog, name, 3); // pass args        
        
    }
}

class Dog {
    private String name;
    private int age;

    public Dog() {
        // empty constructor
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDog(String name, int age) {
        System.out.println(name + " is " + age + " year(s) old.");
    }
}
