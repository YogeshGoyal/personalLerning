/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.String;

import java.util.Date;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author yokukuma
 */
public class StringDemo {

    public static void main(String[] args) {

//        String name = "yogesh|divya|saket|vijay|ashish";
//        String[] strarr  = name.split("\\|");
//        for (String string : strarr) {
//            System.out.println(string);
//        }
//        String str1 = "yogesh kumar goyal";
//        String str2 = str1.substring(0, 2);
//        System.out.println(str2);
//        String formattedString = String.format("Order with OrdId : %d and Amount: %d is missing", 40021, 3000);
//        System.out.println(formattedString);
//        System.out.printf("Order with OrdId : %d  and Amount: %d is missing \n", 40021, 3000);
//        
//        String str  = String.format("Today is date %tD", new Date());
//        Date today = new Date();
//        System.out.printf("Date in dd/mm/yy format %td/%tm/%ty %n", today,today,today );
//        System.err.println(str);
        Date d = new Date();
        System.out.println(d.toString());
    }
}
