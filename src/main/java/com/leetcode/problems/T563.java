package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-21 17:57
 **/
public class T563 {
    public int findTilt(TreeNode root) {
        if(root != null){
            int leftVal = root.left == null ? 0 : root.left.val;
            int rightVal = root.right == null ? 0 : root.right.val;
            int abs = Math.abs(leftVal - rightVal);
            return findTilt(root.left) + findTilt(root.right) + abs;
        }
        return 0;
    }
}
