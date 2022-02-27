package com.letcode.arrary;

public class IntToRoman {

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            String symbol = symbols[i];
            while (num >= val) {
                buffer.append(symbol);
                num -= val;
            }

            if (num == 0) {
                break;
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IntToRoman().intToRoman(9));
    }
}
