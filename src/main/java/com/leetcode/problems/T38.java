package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-13 15:42
 **/
public class T38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        int p = 1;
        String result = "1";
        while (p<n){
            result = say(result);
            p++;
        }
        return result;
    }

    public static String say(String s){
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        char pre = chars[0];
        int p = 1;
        int count = 1;
        while(p < s.length()){
            if(pre == chars[p]){
                count++;
            }else{
                result.append(count).append(pre);
                pre = chars[p];
                count = 1;
            }
            p++;
        }
        result.append(count).append(pre);
        return result.toString();
    }
}
