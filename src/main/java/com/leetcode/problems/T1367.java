package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-16 09:27
 **/
public class T1367 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        return check(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean check(ListNode head, TreeNode node) {
        if (head == null) {
            return true;
        }
        if (node == null) {
            return false;
        }
        if (head.val != node.val) {
            return false;
        }
        return check(head.next, node.left) || check(head.next, node.right);
    }


}
