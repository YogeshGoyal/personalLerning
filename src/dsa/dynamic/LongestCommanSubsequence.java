/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.dynamic;

import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class LongestCommanSubsequence {

    public static void main(String[] args) {
        String str1 = "ABRXX";
        String str2 = "ABRertXX";
        // all below implemantion only provide length not matched substring.
        
        System.out.println("max commnn subsequence:" + LCMRecursive(str1, str2, str1.length(), str2.length()));
        System.out.println("max commnn momoisation:" + LCMMomoiseDriver(str1, str2, str1.length(), str2.length()));
        System.out.println("max commnn bottom up:" + LCMBottomUp(str1, str2, str1.length(), str2.length()));
        System.out.println("max commnn bottom up optimized:" + LCMBottomUpSpaceOptimized(str1, str2, str1.length(), str2.length()));
        System.out.println(LCMBottomUpPrintMatchedString(str1, str2, str1.length(), str2.length()));
    }

    static int LCMRecursive(String a, String b, int m, int n) {
        if (n == 0 || m == 0) {
            return 0;
        } else if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return 1 + LCMRecursive(a, b, m - 1, n - 1);
        } else {
            int temp1 = LCMRecursive(a, b, m, n - 1);
            int temp2 = LCMRecursive(a, b, m - 1, n);
            return Integer.max(temp1, temp2);
        }
    }

    static int LCMMomoiseDriver(String a, String b, int m, int n) {
        int[][] arr = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        return LCMMomoise(a, b, m, n, arr);
    }

    // below approach is also top down approch  also called memoisation approach
    static int LCMMomoise(String a, String b, int m, int n, int[][] arr) {
        if (arr[m][n] != 0) {
            return arr[m][n];
        }
        if (n == 0 || m == 0) {
            return 0;
        } else if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return 1 + LCMRecursive(a, b, m - 1, n - 1);
        } else {
            int temp1 = LCMRecursive(a, b, m, n - 1);
            int temp2 = LCMRecursive(a, b, m - 1, n);
            int result = Integer.max(temp1, temp2);
            arr[m][n] = result;
            return result;
        }
    }

    // below solution is using tabulation , also called bottom up approach.
    // Time complecxity of tabulation and memoisation approach will be O(mn)
    
    static int LCMBottomUp(String a, String b, int m, int n) {
        int[][] arr = new int[m + 1][n + 1];
           for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else if (a.charAt(i-1) == b.charAt(j-1)) {
                    arr[i][j] = arr[i-1][j-1]+1;
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        return arr[m][n];
    }

    // below solution is using tabulation , also called bottom up approach.
    // Time complecxity of tabulation and memoisation approach will be O(mn)
    
    static int LCMBottomUpSpaceOptimized(String a, String b, int m, int n) {
        int[][] arr = new int[2][n + 1];
        int bi = 0;
        for (int i = 0; i <= m; i++) {
                    bi = i & 1;
            for (int j = 0; j <= n; j++) {
        
                if (i == 0 || j == 0) {
                    arr[bi][j] = 0;
                } else if (a.charAt(i-1) == b.charAt(j-1)) {
                    arr[bi][j] = arr[1-bi][j-1]+1;
                } else {
                    arr[bi][j] = Math.max(arr[1-bi][j], arr[bi][j-1]);
                }
            }
        }
        return arr[bi][n];
    }
    
    
        // below solution is using tabulation , also called bottom up approach.
    // Time complecxity of tabulation and memoisation approach will be O(mn)
    
    static String LCMBottomUpPrintMatchedString(String a, String b, int m, int n) {
        int[][] arr = new int[m + 1][n + 1];
           for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else if (a.charAt(i-1) == b.charAt(j-1)) {
                    arr[i][j] = arr[i-1][j-1]+1;
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        int matchedLen = arr[m][n];
        char[] matchedStr = new char[matchedLen+1];
        //Start from top and move in direction of top 
        // one by one store character in matchedStr.
        int i = m;
        int j = n;
        int index = matchedLen;
        while (i>0 && j>0){
            // if current character at a[i][j] and b[i][j] is same print it in output matchedStr
            // else move in direction of bigger entry.
            if (a.charAt(i-1) == b.charAt(j-1)) {
                matchedStr[index-1] = a.charAt(i-1);
                i--;
                j--;
                index--;
                
            }else if (a.charAt(i-1) > b.charAt(j-1)){
                i--;
            }else{
                j--;
            }
            
        }
        return  String.copyValueOf(matchedStr);
        
    }
}
