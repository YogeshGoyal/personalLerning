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
public class LSD {

    public static void sort(String[] arr, int W) { // fixed length W string
        int R = 256;
        int N = arr.length;
        String[] aux = new String[arr.length];

        for (int d = W-1; d >= 0; d--) {
            int[] count = new int[R + 1];
            for (int i = 0; i < N; i++) {
                count[arr[i].charAt(d) + 1]++;
            }

            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }

            for (int i = 0; i < N; i++) {
                aux[count[arr[i].charAt(d)]++] = arr[i];
            }

            for (int i = 0; i < N; i++) {
                arr[i] = aux[i];
            }
        }

    }

    public static void main(String[] args) {
        String[] strArr = new String[5];
        strArr[0] = new String("saket");
        strArr[1] = new String("sachn");
        strArr[2] = new String("sahil");
        strArr[3] = new String("ajayy");
        strArr[4] = new String("vijay");

        System.out.println("before sort");
        for (String string : strArr) {
            System.out.println(string);
        }
        sort(strArr, 5);
        System.out.println("after sort");
        for (int i = 0; i < 5; i++) {
            System.out.println(strArr[i]);
        }

    }
}
