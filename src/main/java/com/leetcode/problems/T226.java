package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-21 17:13
 **/
public class T226 {
    public TreeNode invertTree(TreeNode root) {
        revertTree(root);
        return root;
    }

    public void revertTree(TreeNode root){
        if(root != null){
            TreeNode left = root.left;
            root.right = root.left;
            root.left = left;
            revertTree(root.right);
            revertTree(root.left);
        }
    }
}
