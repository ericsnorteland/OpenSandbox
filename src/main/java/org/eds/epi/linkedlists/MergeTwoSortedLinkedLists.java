package org.eds.epi.linkedlists;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLinkedLists {

    public static Node merge(Node first, Node second) {
        Node mergeNode = null;

        if (first == null) {
            return second;
        }

        if (second == null) {
            return first;
        }

        if (first.item < second.item) {
            mergeNode = first;
            mergeNode.next = merge(first.next, second);
        } else {
            mergeNode = second;
            mergeNode.next = merge(first, second.next);
        }
        return mergeNode;
    }
}

