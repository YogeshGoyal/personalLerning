/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.miscproblems;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author yokukuma
 */
public class LongestIncresingSubsequence {
    public static void main(String[] args) {
        Integer[] arr = {10,22,9,33,21,50,41,60};
         int longest = findLongestIncresingSubSequence(arr);
         System.out.println("longest sub sequence: " + longest);
    }

    private static int findLongestIncresingSubSequenceCount(Integer[] arr) {
        Map<Integer,Integer> LIS = new TreeMap<>();
        for(int i = 0; i< arr.length;i++){
            LIS.put(i, 1);
        }
        
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                if(arr[j]<arr[i]){
                    if(LIS.get(j)+1 > LIS.get(i)){
                        LIS.put(i, LIS.get(j)+1);
                    }
                }
            }
        }
        
        int max = 0;
        for(int i =0;i<LIS.size();i++){
            if(max< LIS.get(i)){
                max = LIS.get(i);
            }
        }
        return max;
    }
    
    private static int findLongestIncresingSubSequence(Integer[] arr) {
        Map<Integer,Integer> LIS = new TreeMap<>();
        Map<Integer,String> Sequence = new TreeMap<>();
        for(int i = 0; i< arr.length;i++){
            LIS.put(i, 1);
            String value = arr[i] + "";
            Sequence.put(i, value);
        }
        
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                if(arr[j]<arr[i]){
                    if(LIS.get(j)+1 > LIS.get(i)){
                        LIS.put(i, LIS.get(j)+1);
                        String val = Sequence.get(j)+ " "+arr[i];
                        Sequence.put(i, val);
                    }
                }
            }
        }
        
        int max = 0;
        int index =0;
        for(int i =0;i<LIS.size();i++){
            if(max< LIS.get(i)){
                max = LIS.get(i);
                index = i;
            }
        }
        System.out.println("longest sequence is: "+ Sequence.get(index));
        return max;
    }
    
    
}
