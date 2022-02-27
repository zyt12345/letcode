package com.letcode.arrary;

import java.util.Arrays;

public class ThreeNumClosest_16 {

    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        Arrays.sort(nums);
        int best = 1000;
        for (int i = 0; i < length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去掉重复情况

            int left = i + 1;
            int right = length - 1;
            //a+b+c>=target
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                } else {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }

            }
        }
        return best;
    }


    public static void main(String[] args) {
        int[] nums = {-1,0,1,1,55};
        System.out.println(new ThreeNumClosest_16().threeSumClosest(nums, 3));
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(new ThreeNumClosest_16().threeSumClosest(nums1, 2));
    }
}
