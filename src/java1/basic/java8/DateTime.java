/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;


/**
 *
 * @author yokukuma
 */
public class DateTime {
    public static void main(String[] args) {
        // previously Date class was not thread safe
        // java 8 Date Time API is IMMUTABLE
        //Date d = new Date();
        LocalDate d  = LocalDate.of(1989, Month.APRIL, 1);
        System.err.println(d);
        LocalTime lt =  LocalTime.now();
        System.err.println(lt);
    }
}
