package org.eds.codesignal;

import java.util.Stack;

public class IsListPalindrome {

    boolean isListPalindromeStackSolution(ListNode<Integer> l) {
        ListNode<Integer> slow = l;
        ListNode<Integer> fast = l;
        Stack<Integer> firstHalf = new Stack<>();

        if (slow == null) {
            return true;
        }

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            firstHalf.push(slow.value);
            slow = slow.next;
        }

        // check for odd or even, if even push slow
        if (fast.next != null) {
            firstHalf.push(slow.value);
        }

        while (slow.next != null) {
            slow = slow.next;
            if (!firstHalf.pop().equals(slow.value)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1000000000);
        ListNode c = new ListNode(-1000000000);
        ListNode d = new ListNode(-1000000000);
        ListNode e = new ListNode(1000000000);
        ListNode f = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        IsListPalindrome ilp = new IsListPalindrome();
        ilp.isListPalindromeStackSolution(a);
    }
}

class ListNode<T> {
    ListNode(T x) {
        value = x;
    }
    T value;
    ListNode<T> next;
}
