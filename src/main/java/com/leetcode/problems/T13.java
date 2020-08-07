package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-10 11:15
 **/
public class T13 {

    private Map<Character, Integer> map = null;

    public T13(){
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static void main(String[] args) {
        T13 test13 = new T13();
        System.out.println(test13.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int result = 0;
        int pre = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
             int suf = map.get(s.charAt(i));
             result += pre >= suf ? pre : (-pre);
             pre = suf;
        }
        result += pre;
        return result;
    }
}
