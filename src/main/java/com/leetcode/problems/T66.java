package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-13 17:06
 **/
public class T66 {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if(digit == 9){
                digit = 0;
            }else{
                digit += 1;
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
