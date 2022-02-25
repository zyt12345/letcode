package com.letcode.array;

import com.letcode.arrary.TowSum_1;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

public class TowSum_1_Test {

    @Test
    public void towSum() {
        TowSum_1 t = new TowSum_1();

        // * 示例 1：
        // * 输入：nums = [2,7,11,15], target = 9
        // * 输出：[0,1]
        // * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
        int[] a1 = {2, 7, 11, 15};
        int t1 = 9;
        int[] ret1 = t.twoSum(a1, t1);
        int[] ret11 = t.twoSum2(a1, t1);
        int[] expect = {0, 1};

        System.out.println("输入:" + Arrays.toString(a1) + " target:" + t1);
        System.out.println("expect:" + Arrays.toString(expect));
        System.out.println("f1输出:" + Arrays.toString(ret1));
        System.out.println("f2输出:" + Arrays.toString(ret11));
        assertTrue(Arrays.equals(ret1, expect));
        assertTrue(Arrays.equals(ret11, expect));

        // * 输入：nums = [3,2,4], target = 6
        // * 输出：[1,2]
        a1 = new int[]{3, 2, 4};
        t1 = 6;
        ret1 = t.twoSum(a1, t1);
        ret11 = t.twoSum2(a1, t1);
        expect = new int[]{1, 2};

        System.out.println("输入:" + Arrays.toString(a1) + " target:" + t1);
        System.out.println("expect:" + Arrays.toString(expect));
        System.out.println("f1输出:" + Arrays.toString(ret1));
        System.out.println("f2输出:" + Arrays.toString(ret11));
        assertTrue(Arrays.equals(ret1, expect));
        assertTrue(Arrays.equals(ret11, expect));


        // * 输入：nums = [3,3], target = 6
        // * 输出：[0,1]
        a1 = new int[]{3, 3};
        t1 = 6;
        ret1 = t.twoSum(a1, t1);
        ret11 = t.twoSum2(a1, t1);
        expect = new int[]{0, 1};

        System.out.println("输入:" + Arrays.toString(a1) + " target:" + t1);
        System.out.println("expect:" + Arrays.toString(expect));
        System.out.println("f1输出:" + Arrays.toString(ret1));
        System.out.println("f2输出:" + Arrays.toString(ret11));
        assertTrue(Arrays.equals(ret1, expect));
        assertTrue(Arrays.equals(ret11, expect));

        // * 输入：nums = [3,2,3], target = 6
        // * 输出：[0,1]
        a1 = new int[]{3, 2, 3};
        t1 = 6;
        ret1 = t.twoSum(a1, t1);
        ret11 = t.twoSum2(a1, t1);
        expect = new int[]{0, 2};

        System.out.println("输入:" + Arrays.toString(a1) + " target:" + t1);
        System.out.println("expect:" + Arrays.toString(expect));
        System.out.println("f1输出:" + Arrays.toString(ret1));
        System.out.println("f2输出:" + Arrays.toString(ret11));
        assertTrue(Arrays.equals(ret1, expect));
        assertTrue(Arrays.equals(ret11, expect));
    }
}
