package com.letcode.integer;

public class PalindromeNumber {

    //1221
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        int old = x;
        int d = 0;
        while (x != 0) {
            d = d * 10 + x % 10;
            x = x / 10;
        }
        //System.out.println("old:" + old + " d:" + d + "x:" + x);
        return old == d;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(10));
    }
}
