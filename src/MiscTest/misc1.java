/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author yokukuma
 */
public class misc1 {

    private static void getSubsets(List<Integer> superSet, int k, int idx, List<Integer> current, List<List<Integer>> solution) {
        //successful stop clause
        if (current.size() == k) {
            solution.add(new ArrayList<>(current));
            return;
        }
        //unseccessful stop clause
        if (idx == superSet.size()) {
            return;
        }
        Integer x = superSet.get(idx);
        current.add(x);
        //"guess" x is in the subset
        getSubsets(superSet, k, idx + 1, current, solution);
        current.remove(x);
        //"guess" x is not in the subset
        getSubsets(superSet, k, idx + 1, current, solution);
    }

    public static List<List<Integer>> getSubsets(List<Integer> superSet, int k) {
        List<List<Integer>> res = new ArrayList<>();

        getSubsets(superSet, k, 0, new ArrayList<Integer>(), res);

        return res;
    }

    static int findMaximum(int[] a, int m) {
        List<Integer> numberList = new ArrayList<>();
        for (int num : a) {
            numberList.add(num);
        }
        
       List<List<Integer>> res = getSubsets(numberList, m);
       int globalMax = 0;
        for (List<Integer> re : res) {
            
            int curMin = Integer.MAX_VALUE;
            for (int i = 0; i < re.size(); i++) {
                for (int j = i + 1; j < re.size(); j++) {
                    int diff = Math.abs(re.get(i) - re.get(j));
                    if (diff < curMin) {
                        curMin = diff;
                    }
                }
            }
            if (curMin > globalMax) {
                globalMax = curMin;
            }
        }
        return globalMax;
    }
    public static void main(String[] args) {
        List<Integer> superSet = new ArrayList<>();
        int[] arr = {1,2,3,4,5};
        System.out.println(findMaximum(arr, 2));
    }
}
