package org.example;

public class Main
{

    static final int MOD = 1000000007;

    public static int countGoodSubsequences(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][26];

        // Initialize dp array
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 26; j++) {
                dp[i][j] = 0;
            }
        }

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            int charIndex = c - 'a';

            // Copy the previous row values
            for (int j = 0; j < 26; j++) {
                dp[i][j] = dp[i - 1][j];
            }

            // Update the current row value with the addition of the previous row's value for the current character
            for (int j = 0; j < 26; j++) {
                dp[i][charIndex] = (dp[i][charIndex] + dp[i - 1][j]) % MOD;
            }
        }

        int totalCount = 0;
        for (int j = 0; j < 26; j++) {
            totalCount = (totalCount + dp[n][j]) % MOD;
        }

        return totalCount;
    }

    public static void main(String[] args) {
        String input = "abca";
        int result = countGoodSubsequences(input);
        System.out.println(result); // Output: 13
    }
}