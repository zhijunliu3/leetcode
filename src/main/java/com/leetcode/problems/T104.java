package com.leetcode.problems;


import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-15 14:45
 **/
public class T104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    public int maxDepth(TreeNode root) {
//        return dfs(root);
//    }
//
//    public int dfs(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        int leftDepth = dfs(root.left) + 1;
//        int rightDepth = dfs(root.right) + 1;
//        return Math.max(leftDepth, rightDepth);
//    }

    public int maxDepth(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.poll();
            root = current.getKey();
            int current_depth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                stack.add(new Pair(root.left, current_depth + 1));
                stack.add(new Pair(root.right, current_depth + 1));
            }
        }
        return depth;
    }
}
