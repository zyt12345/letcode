package com.letcode.arrary;

import java.util.*;

public class ThreeNum_15 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (length < 3) {
            return result;
        }
        Arrays.sort(nums);
        //int pa, pb;
        for (int i = 0; i < length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去掉重复情况

            int pa = i + 1;
            int pb = length - 1;
            int target = -nums[i];
            while (pa < pb) {
                if (nums[pa] + nums[pb] == target) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[pa], nums[pb])));
                    pa++;
                    pb--;
                    while (pa < pb && nums[pa] == nums[pa - 1]) pa++;
                    while (pa < pb && nums[pb] == nums[pb + 1]) pb--;
                } else if (nums[pa] + nums[pb] < target) {
                    pa++;
                } else {
                    pb--;
                }

            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
        System.out.println(new ThreeNum_15().threeSum(nums));
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(new ThreeNum_15().threeSum(nums1));
    }
}
