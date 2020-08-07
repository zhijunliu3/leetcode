package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-09 10:06
 **/
public class T1 {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i = 0; i < result.length; i++) {
            int i1 = result[i];
            System.out.println(i1);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int num1 = nums[j];
                if(i != j && num + num1 == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }
}
