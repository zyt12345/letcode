package com.letcode.string;

public class ZigzagConversion {

    public String convert(String s, int numbers) {
        if (numbers < 2) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numbers];
        for (int i = 0; i < numbers; i++) {
            StringBuilder row = new StringBuilder();
            rows[i] = row;
        }
        char[] chars = s.toCharArray();
        int i = 0, flag = -1;
        for (char c : chars) {
            rows[i].append(c);
            //System.out.println("c=" + c + " i=" + i + " flag=" + flag);
            if (i == 0 || i == numbers - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder buffer = new StringBuilder();
        for (StringBuilder row : rows) {
            buffer.append(row);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
//        System.out.println(new ZigzagConversion().convert("PAYPALISHIRING", 3));
        System.out.println(new ZigzagConversion().convert("AB", 1));
    }
}
