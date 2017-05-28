/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.CollectionAndGenerics;

import java.util.Comparator;

/**
 *
 * @author yokukuma
 */
public class CompImpl implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%10> o2%10){
            return 1;
        }else{
            return -1;
        }
    }
    
}
