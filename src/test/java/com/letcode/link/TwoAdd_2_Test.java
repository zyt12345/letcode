package com.letcode.link;

import com.letcode.base.ListNode;
import org.junit.Test;

public class TwoAdd_2_Test {

    public ListNode toNode(int[] array) {
        ListNode root = null;
        for (int a : array) {
            if (root == null) {
                root = new ListNode(a);
            } else {
                root.addNode(a);
            }
        }
        return root;
    }

    @Test
    public void towAdd() {

        //l1 = [2,4,3], l2 = [5,6,4]
        //[7,0,8]
        //342 + 465 = 807.
        TwoAdd_2 towAdd = new TwoAdd_2();
        ListNode a = toNode(new int[]{5});
        ListNode b = toNode(new int[]{5});
        System.out.println(towAdd.addTwoNumbers(a,b));


        //* 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        // * 输出：[8,9,9,9,0,0,0,1]
        ListNode a3 = toNode(new int[]{9,9,9,9,9,9,9});
        ListNode b3 = toNode(new int[]{9,9,9,9});
        System.out.println(towAdd.addTwoNumbers(a3,b3));


        ListNode a4 = toNode(new int[]{9});
        ListNode b4 = toNode(new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9});
        System.out.println(towAdd.addTwoNumbers(a4,b4));



        ListNode a5 = toNode(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9
        });
        ListNode b5 = toNode(new int[]{1});
        System.out.println(towAdd.addTwoNumbers(a5,b5));

    }
}
