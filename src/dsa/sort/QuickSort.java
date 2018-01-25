/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

import java.util.Collections;

/**
 *
 * @author yokukuma
 */
public class QuickSort {

    public void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public void sortDikstra3way(Comparable[] a) {
        sortDikstra3way(a, 0, a.length - 1);
    }

    private void sortDikstra3way(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt = lo;
        int gt = hi;
        Comparable v = a[lo];
        int i = lo;
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                Comparable temp = a[i];
                a[i] = a[lt];
                a[lt] = temp;
                lt++;
                i++;
            } else if (cmp > 0) {
                Comparable temp = a[gt];
                a[gt] = a[i];
                a[i] = temp;
                gt--;
            } else {
                i++;
            }
        }
        sortDikstra3way(a,lo,lt-1);
        sortDikstra3way(a,gt+1,hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {

        int i = lo;
        int j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) {
                if (i == hi) {
                    break;
                }
            }
            while (less(a[lo], a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }

             
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
    public static void main(String[] args) {
        Integer[] arr = {4, 3, 6, 1, 3, 9, 2, 6, 4};

        QuickSort sorting = new QuickSort();
        sorting.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
