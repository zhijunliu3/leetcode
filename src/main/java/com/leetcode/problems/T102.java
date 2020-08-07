package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-16 10:23
 **/
public class T102 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        current(root, result, 0);
        return result;
    }

    public void current(TreeNode root, List<List<Integer>> result,Integer currentLevel){
        if(root != null){
            if(result.size() < currentLevel+1){
                result.add(new ArrayList<>());
            }
            result.get(currentLevel).add(root.val);
            current(root.left, result, currentLevel+1);
            current(root.right, result, currentLevel+1);
        }
    }
}
