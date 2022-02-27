package com.letcode.integer;

import java.util.ArrayList;
import java.util.List;

public class StringToInteger {

    public int myAtoi(String s) {
        s = s.trim();
        s = s.replaceAll(" ", "");
        char[] chars = s.toCharArray();
        // /^([0-9]|\)
        if (chars.length > 0) {
            int state = getState(chars[0]);
            if (state == 0 || state == 3) {
                return 0;
            }
        }

        long ret = 0l;
        boolean neg = false;
        //boolean sign = false;
        List<Character> head = new ArrayList<>();
        for (char ch : chars) {
            if (head.size() > 2) {
                return 0;
            }
            if (ch == '-' || ch == '+') {
                neg = ch == '-';
                //sign = true;
                head.add(ch);
            } else if (ch >= '0' && ch <= '9') {
                int ox = ch - 48;
                ret = ret * 10 + ox;
                //System.out.println(" ret:" + ret);
            } else if (ch == '.') {
                break;
            }
        }

        int actual;
        if (neg) {
            ret = ret * -1;
            if (ret < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        } else {
            if (ret > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        actual = (int) ret;
        return actual;
    }

    public int getState(char c) {
        if (c == ' ') {
            return 0;
        }
        if (c == '+' || c == '-') {
            return 1;
        }
        if (Character.isDigit(c)) {
            return 2;
        }
        return 3;
    }

//    public static void main(String[] args) {
//        System.out.println(new StringToInteger().myAtoi("+3.14159"));
//    }
}
