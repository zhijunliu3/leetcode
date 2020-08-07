package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-15 15:05
 **/
public class T404 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(sumOfLeftLeaves(root));
    }


    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + (root.left != null   ? root.left.val : 0);
    }
}
