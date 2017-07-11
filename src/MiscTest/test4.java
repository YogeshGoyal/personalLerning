/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.math.BigDecimal;

/**
 *
 * @author yokukuma
 */
public class test4 {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("2.15");
        BigDecimal d2 = new BigDecimal("1.05");
        
        BigDecimal d3 = d1.subtract(d2);
        System.out.println(d3);
    }
}
