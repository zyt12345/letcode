package com.letcode.string.palindrome;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串
 * <p>
 * <p>
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * <p>
 * 示例 2：
 * 输入：s = "cbbd"
 * 输出："bb"
 *  
 * <p>
 * 提示：
 * 1.1 <= s.length <= 1000
 * 2.s 仅由数字和英文字母组成
 */
public class LongestPalindrome_4 {


    public String longestPalindrome(String s) {

        int start = 0, max = 1;
        int n = s.length();

        if (n < 2) {
            return s;
        }
        boolean[][] dp = new boolean[n][n];
        //初始化
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        //状态转移方程
        //P(i,j)=P(i+1,j−1)∧Si==Sj
        for (int L = 2; L <= n; L++) {
            for (int i = 0; i < n; i++) {
                // 由 L 和 i 可以确定右边界，即 j - i + 1 = L 得
                int j = L + i - 1;
                // 如果右边界越界，就可以退出当前循环
                if (j >= n) {
                    break;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + max);
    }

    public static void main(String[] args) {
        System.out.printf(new LongestPalindrome_4().longestPalindrome("ab"));
    }
}
