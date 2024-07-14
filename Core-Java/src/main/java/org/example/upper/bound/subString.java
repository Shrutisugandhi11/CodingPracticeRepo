package org.example.upper.bound;

public class subString {
    public static int subStr(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int max = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                char char1 = str1.charAt(i - 1);
                char char2 = str2.charAt(j - 1);

                if (char1 == char2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(subStr("chotu","chutku"));
    }
}
