package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-10 14:14
 **/
public class T14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"c","c"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }else if(strs.length == 1){
            return strs[0];
        }else{
            String result = "";
            for (int i = 0; i < strs[0].length(); i++) {
                String pre = strs[0].substring(0, i+1);
                for (int j = 1; j < strs.length; j++) {
                    String str = strs[j];
                    if(str.indexOf(pre) != 0){
                        return result;
                    }
                }
                result = pre;
            }
            return result;
        }
    }
}
