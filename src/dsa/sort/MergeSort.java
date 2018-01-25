/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

/**
 *
 * @author yokukuma
 */
public class MergeSort {

    public void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    public void bottomUpMergeSort(Comparable[] a) {
        int N = a.length;
        Comparable[] aux = new Comparable[a.length];
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz+sz) {
                merge(a, aux, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    private void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);

        // no need to sort array if mid element is lower then mid+1;
        if (!less(a[mid + 1], a[mid])) {
            return;
        }
        merge(a, aux, lo, mid, hi);
    }

    private void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        // copy entire array in auxilary array
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid + 1;
        int k = lo;
        while (i <= mid && j <= hi) {
            if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
            k++;
        }
        while (i <= mid) {
            a[k] = aux[i];
            k++;
            i++;
        }

    }

    private void merge1(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        // copy entire array in auxilary array
        for (int m = lo; m <= hi; m++) {
            aux[m] = a[m];
        }

        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }

    private static boolean less(Comparable v, Comparable u) {
        return v.compareTo(u) < 0;
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 3, 6, 1, 3, 9, 2, 6, 4};

        MergeSort sorting = new MergeSort();
        sorting.bottomUpMergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
