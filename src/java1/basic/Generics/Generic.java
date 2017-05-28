/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.Generics;

/**
 *
 * @author yokukuma
 */
public class Generic {

    public static void main(String[] args) {
        Test<String> obj = new Test<String>() {
            @Override
            public void printString(String str) {
                System.err.println("String is: " + str);
            }
        };

        obj.printString("yogesh");

        TestClass<String, Integer> obj2 = new TestClass("yogesh", 24);
        System.out.println(obj2);

        TestMethod tm = new TestMethod();
        String str = tm.performAction("yogesh");
        System.out.println(str);
    }
}

class TestMethod {

    public <T,R> R performAction(final T action) {
        final R result = (R) action;
        // Implementation here
        return result;
    }
}


interface Test<T> {

    void printString(T str);
}

class TestClass<U, V> {

    U name;
    V age;

    public TestClass(U name, V age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestClass{" + "name=" + name + ", age=" + age + '}';
    }
}
