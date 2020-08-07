package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-09 14:29
 **/
public class T7 {
    public static void main(String[] args) {
//        System.out.println(reverse(123));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    public static int reverse(int x) {
        String s = String.valueOf(x).replaceAll("0+$", "");
        int result = 0;
        try{
            result = x>0 ? Integer.valueOf(reverseStr(s)) : Integer.valueOf("-" + reverseStr(s.substring(1)));
        }catch (Exception e){
            return result;
        }
        return result;
    }

    public static String reverseStr(String s){
        String result = "";
        for (int i = s.length() -1; i >=0 ; i--) {
             result += s.charAt(i);
        }

        return result;
    }
}
