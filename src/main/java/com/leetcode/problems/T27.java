package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-13 10:40
 **/
public class T27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num != val){
                nums[result] = num;
                result++;
            }
        }
        return result;
    }
}
