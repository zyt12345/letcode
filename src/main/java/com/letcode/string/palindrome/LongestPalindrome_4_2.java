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
public class LongestPalindrome_4_2 {


    //1.p(i,i) true
    //2.p(i,i+1)=Si==Si+1
    //3.p(i,j)=P(i+1,j-1)^(Si==Sj)
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        //right-left+1-2
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.printf(new LongestPalindrome_4_2().longestPalindrome("ab"));
    }
}
