package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-13 14:49
 **/
public class T35 {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int middle = (start + end)/2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                end = middle - 1;
            }else if(nums[middle] < target){
                start = middle + 1;
            }
        }
        return start;
    }
}
