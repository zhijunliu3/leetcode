package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-17 10:38
 **/
public class T392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sp = 0;
        int tp = 0;
        while (tp < tChars.length && sp < sChars.length){
            if(tChars[tp] == sChars[sp]){
                sp ++;
            }
            tp++;
        }
        if(sp == sChars.length){
            return true;
        }
        return false;
    }
}
