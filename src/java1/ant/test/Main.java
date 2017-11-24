/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ant.test;

import java1.ant.src.MyMath;

/**
 *
 * @author yokukuma
 */
public class Main {

    public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println("Result is: " + math.multi(5, 10));
    }
}
