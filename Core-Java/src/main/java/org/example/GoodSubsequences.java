package org.example;

public class GoodSubsequences {
    static final int MOD = 1000000007;

    public static int countGoodSubsequences(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][26];
        int[] lastOccurrence = new int[26];
        int totalGoodSubsequences = 1;

        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            int charIndex = c - 'a';

            dp[i][charIndex] = totalGoodSubsequences;

            for (int j = 0; j < 26; j++) {
                if (j != charIndex) {
                    dp[i][j] = dp[i - 1][j];
                }
            }

            totalGoodSubsequences = 0;
            for (int j = 0; j < 26; j++) {
                totalGoodSubsequences = (totalGoodSubsequences + dp[i][j]) % MOD;
            }
        }

        return totalGoodSubsequences - 1; // Subtract 1 to exclude the empty subsequence
    }

    public static void main(String[] args) {
        String input = "abcd";
        int result = countGoodSubsequences(input);
        System.out.println(result); // Output: 13
    }
}
