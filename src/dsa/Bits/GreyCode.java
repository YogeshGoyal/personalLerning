/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Bits;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class GreyCode {
    public static void main(String[] args) {
        System.out.println("grey code :"+ greycode(2));
    }

    private static List<Integer> greycode(int count) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1<<count; i++) {
            list.add(i ^ i>>1);
        }
        
        return list;
    }
}
