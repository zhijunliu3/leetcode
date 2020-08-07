package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-13 17:47
 **/
public class T437 {
    int result = 0;
    int leftSum = 0;
    int rightSum = 0;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int pathSum(TreeNode root, int sum) {
        int result = 0;
        int leftSum = 0;
        int rightSum = 0;
        TreeNode start = root;
        TreeNode left = root.left;
        TreeNode right = root.right;
        while(start != null){
            leftSum = start.val + left.val;
            rightSum = start.val + right.val;
        }
        return 0;
    }

    public void calcSum(TreeNode root){
        if(root != null){
            leftSum += root.left.val;
            rightSum += root.right.val;
            if(leftSum < 8){

            }
        }
    }
}
