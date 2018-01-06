/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

/**
 *
 * @author yokukuma
 *
 */
public class Selection {

    public static Comparable select(Comparable[] a, int k) {
        int lo = 0;
        int hi = a.length - 1;
        while (hi > lo) {
            int j = partition(a,lo,hi);
             if (j < k) lo = j+1;
            else if (j>k) hi = j-1;
            else
                return a[k];
        }
        return a[k];
    }

    private static int partition(Comparable[] a, int lo, int hi) {

        int i = lo;
        int j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) {
                if (i == hi) {
                    break;
                }
            }
            while (less(a[lo], a[--j])) {
                if (i == hi) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }

            //swap i and j element
            Comparable temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }

        //swap i and lo element
        Comparable temp = a[j];
        a[j] = a[lo];
        a[lo] = temp;

        return j;
    }

    private static boolean less(Comparable v, Comparable u) {
        return v.compareTo(u) < 0;
    }

}
