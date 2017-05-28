/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.miscproblems;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author yokukuma
 */
public class Fibonacci {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("nth number is:" + findNthFibonacciNumberMemoization(40));
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken in milli seconds: " + (endTime - startTime));
    }

    public static int findNthFibonacciNumberRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return findNthFibonacciNumberRecursive(n - 1) + findNthFibonacciNumberMemoization(n - 2);
    }

    // top down approach (memoization solution) of dynalic programming
    public static int findNthFibonacciNumberMemoization(int n) {
        
        // Forst create Map for llokup and store nil value for all element
        Map<Integer, Integer> lookup = new TreeMap<>();
        for (int i = 0; i <= n; i++) {
            lookup.put(i, -1);
        }
        return findNthFibonacciNumberMemoization(n,lookup);
    }

    private static int findNthFibonacciNumberMemoization(int n, Map<Integer, Integer> lookup) {
        
        if(lookup.get(n) == -1){
            if(n<=1){
                lookup.put(n, n);
            }else{
                int value = findNthFibonacciNumberMemoization(n-1,lookup) + findNthFibonacciNumberMemoization(n-2,lookup);
                lookup.put(n, value);
                
            }
        }
        return lookup.get(n);
    }
    
    // bottom UP approach (tabulation solution) of dynalic programming
    public static int findNthFibonacciNumberTabulation(int n) {

        Map<Integer, Integer> map = new TreeMap<>();
        map.put(0, 0);
        map.put(1, 1);

        for (int i = 2; i <= n; i++) {
            int value = map.get(i - 1) + map.get(i - 2);
            map.put(i, value);
        }

        return map.get(n);
    }



}
