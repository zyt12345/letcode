package com.letcode.string;

public class LongestCommonPrefix_14 {

    public String lcp(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int p = 0;
        while (p < len && a.charAt(p) == b.charAt(p)) {
            p++;
        }
        return a.substring(0, p);
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                prefix = strs[i];
            }
            prefix = lcp(prefix, strs[i]);
            if ("".equals(prefix)) {
                return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(new LongestCommonPrefix_14().longestCommonPrefix(strs));
    }
}
