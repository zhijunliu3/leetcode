package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-13 10:48
 **/
public class T28 {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        if(haystack.equals(needle) || needle.length()==0){
            return 0;
        }
        int p = 0;
        int q = 0;
        int result = -1;
        while (p<haystack.length() && q<needle.length()){
            if(haystack.charAt(p) == needle.charAt(q)){
                if(q++ == 0){
                    result = p;
                }
            }else{
                q=0;
                if(result > -1){
                    p = result;
                    result = -1;
                }
            }
            p++;
        }
        if(q!=needle.length()){
            return -1;
        }
        return result;
    }
}
