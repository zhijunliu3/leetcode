package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-10 17:16
 **/
public class T26 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,1,2}, 1));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0)  return 0;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[result] = nums[i];
                result ++;
            }
        }
        return result;
    }
}
