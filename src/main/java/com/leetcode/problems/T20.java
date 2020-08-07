package com.leetcode.problems;

import java.util.Map;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-08 16:01
 **/
public class T20 {
    public static void main(String[] args) {
        String s = "{}[{}]((){)(){}";
//        Map<String, String> map = new HashMap<>();
//        map.put("{", "}");
//        map.put("(", ")");
//        map.put("[", "]");
//        String str = s.replace(" ", "");
//        System.out.println(isAValid(str, map));
//        System.out.println(isBValid(str, map));
        String str = s.replace(" ", "");
        String a = "[]";
        String b = "()";
        String c = "{}";
        System.out.println(subIsValid(str, a, b, c));
    }

    public static boolean subIsValid(String str, String a, String b, String c){
        if(str.length() > 0){
            int ai = str.indexOf(a);
            int bi = str.indexOf(b);
            int ci = str.indexOf(c);
            if(ai > -1 || bi > -1 || ci > -1){
                str = str.replace(a, "");
                str = str.replace(b, "");
                str = str.replace(c, "");
                return subIsValid(str, a, b, c);
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    public static boolean isAValid(String str, Map<String, String> map){
        System.out.println(str);
        if(str.length()>0){
            String first = str.substring(0, 1);
            if(map.containsKey(first)){
                boolean flag = false;
                for (int i = 1; i < str.length(); i++) {
                    String sub =  str.substring(i, i+1);
                    if(map.get(first).equals(sub)){
                        flag = true;
                        if(!(isAValid(str.substring(1, i), map) || isBValid(str.substring(1, i), map))
                                || !(isAValid(str.substring(i+1, str.length()), map) || isBValid(str.substring(i+1, str.length()), map))){
                            return false;
                        }
                        break;
                    }
                }
                return flag;
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    public static boolean isBValid(String str, Map<String, String> map){
        if(str.length()>0){
            String first = str.substring(0, 1);
            if(map.containsKey(first)){
                boolean flag = false;
                for (int i = str.length()-1; i > 0; i--) {
                    String sub =  str.substring(i, i+1);
                    if(map.get(first).equals(sub)){
                        flag = true;
                        if(!(isBValid(str.substring(1, i), map) || isAValid(str.substring(1, i), map))
                                || !(isBValid(str.substring(i+1, str.length()), map) || isAValid(str.substring(i+1, str.length()), map))){
                            return false;
                        }
                        break;
                    }
                }
                return flag;
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}
