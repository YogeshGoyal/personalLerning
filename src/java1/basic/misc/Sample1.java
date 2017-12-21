/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class Sample1 {

    public static void main(String[] args) {
        //        A obj = new B("yogi", 28);
        //        obj.ShowName();
        //        
        //        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //        for (Integer integer : arr) {
        //            System.out.println(integer);
        //        }
        //        
        //        String[] str = new String[20];
        //        str = Arrays.copyOf(str, str.length*2);
        //        System.out.println("Size is: "+ str.length);
        //        
        //        for (String string : str) {
        //            //System.out.println(string);
        //        }

        //        Integer i1 = 10000;
        //        Integer i2 = 10000;
        //        
        //        if(i1 != i2){
        //            System.out.println("Different");
        //        }
        //        
        //        if(i1 == i2){
        //            System.out.println("Same Object");
        //        }
        //        
        //        Sample1 s1 = new Sample1();
        //        Integer i = 12;
        //        s1.print(i);

                LOGGER.INSTANT1.setStr1("A");
                LOGGER.INSTANT1.setStr2("B");
                LOGGER.INSTANCE2.show();

//        String str = "yogesh";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your Age: ");
//        int value = scanner.nextInt();
//        assert value>=18:" Not valid";  
//        System.out.println("value is "+value);  
        
    }

    private static void printName(char[] name) {
         String nam = name.toString();
        System.out.println("name is:"+nam);
    }

    public void print(int val) {
        int t1 = 12;
        System.out.println(t1 + val);
    }

}

enum LOGGER {
    INSTANT1,
    INSTANCE2;

    String str1;
    String str2;

//    private LOGGER(String str1, String str2) {
//        this.str1 = str1;
//        this.str2 = str2;
//    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    void show() {
        System.out.println("value are: " + str1 + "   " + str2);
    }

}

class GenericTest<E> {

    private E name;

    public GenericTest(E name) {
        this.name = name;
    }

    public static <E> void showName(E name) {
        System.out.println("Name is: " + name);
    }

}

interface A {

    void ShowName();
}

class B implements A {

    private String name;
    private int age;

    public B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void ShowName() {
        System.err.println("Name is: " + name);
    }

    public void ShowAge() {
        System.err.println("age is: " + age);
    }
}
