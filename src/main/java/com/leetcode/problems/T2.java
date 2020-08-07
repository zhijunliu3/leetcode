package com.leetcode.problems;

/**
 * @description:
 * @author: LiuZhiJun
 * @create: 2020-07-10 15:41
 **/
public class T2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int isPlusOne){
        if(l1 == null && l2 == null){
            return isPlusOne>0 ? new ListNode(1) : null;
        }else {
            ListNode result = null;
            if(l1==null) l1 = new ListNode(0);
            if(l2==null) l2 = new ListNode(0);
            int i = l1.val + l2.val + isPlusOne;
            if(i>9){
                result = new ListNode(i%10);
                result.next = addTwoNumbers(l1.next, l2.next, 1);
            }else{
                result = new ListNode(i);
                result.next = addTwoNumbers(l1.next, l2.next, 0);
            }
            return result;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
