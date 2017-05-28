/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Stack;

/**
 *
 * @author yokukuma
 */
public class Demo {
    public static void main(String[] args) {
        
        StackWithArray<String> s1 = new StackWithArray<>(2);
        s1.push("A");
        s1.push("B");
        s1.push("C");
        s1.push("C");
        s1.push("C");
        s1.push("C");
        
//        System.out.println("A: "+ s1.pop());
//        System.out.println("A: "+ s1.pop());
//        System.out.println("A: "+ s1.pop());
//        s1.push("yofesh");
//        System.out.println("A: "+ s1.pop());
        for (String string : s1) {
            System.out.println(string);
        }
        
//        StackWithLinkedList<String> s = new StackWithLinkedList<>();
//        s.push("yoesh");
//        s.push("kumar");
//        s.push("goyal");
//        for (String string : s) {
//            System.out.println("value are "+ string );
//        }
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        s.push("123");
//        System.out.println(s.pop());
    }
}
