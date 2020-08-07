package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-16 13:57
 **/
public class T124 {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        calcMax(root);
        return max;
    }

    public int calcMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftValue = Math.max(calcMax(root.left), 0);
        int rightValue = Math.max(calcMax(root.right), 0);
        max = Math.max(max, root.val + leftValue + rightValue);
        return root.val + Math.max(leftValue, rightValue);
    }
}
