package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-09 17:40
 **/
public class T9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int x) {
        if(x<0 || (x%10 == 0 && x!=0)){
            return false;
        }
        int reverseVal = 0;
        while (reverseVal<x){
            reverseVal = reverseVal * 10 + x%10;
            x = x/10;
        }
        return x == reverseVal || x == reverseVal/10;
    }
}
