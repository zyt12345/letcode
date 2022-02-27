package com.letcode.integer;

public class ReverseInteger {

    public int reverse(int x) {
        //123
        int reverse = 0;
        while (x != 0) {
            if (reverse < Integer.MIN_VALUE / 10 || reverse > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x = x / 10;
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.printf(new ReverseInteger().reverse(123) + "");
    }
}
