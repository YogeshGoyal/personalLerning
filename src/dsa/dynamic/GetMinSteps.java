/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.dynamic;

/**
 * problem is that, for given number to reach 1 find total steps. allowed
 * operation are n-1,n/2 and n/3
 *
 * @author yokukuma
 */
public class GetMinSteps {

    public static void main(String[] args) {
        int step = bottomUpGetMinStep(100);
        System.out.println("total step for number 100 : " + step);
    }

    private static int bottomUpGetMinStep(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = 1 + dp[i - 1];// this step for n-1
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], 1 + dp[i / 2]); // this steps for n/2
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], 1 + dp[i / 3]); // this step is for n/3
            }
        }
        return dp[n];
    }

    private static int topDownGetMinStep(int n) {
        int[] memoization = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memoization[i] = -1;
        }
        return topDownGetMinStepHelper(n, memoization);
        // this is memoization

    }

    private static int topDownGetMinStepHelper(int n, int[] memoization) {
        if (n == 1) {
            return 0;
        }
        if (memoization[n] != -1) {
            return memoization[n];
        }

        int r = 1 + topDownGetMinStepHelper(n - 1,memoization);
        if (n % 2 == 0) {
           r = Math.min(r, 1 + topDownGetMinStepHelper(n/2,memoization)); // this steps for n/2
        }
        if (n % 3 == 0) {
            r= Math.min(r, 1 + topDownGetMinStepHelper(n/3,memoization)); // this step is for n/3
        }
        memoization[n]=r;
        return r;
    }
}
