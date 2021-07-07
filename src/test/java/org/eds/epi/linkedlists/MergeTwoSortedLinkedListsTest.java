package org.eds.epi.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLinkedListsTest {

    @Test
    public void basicTest() {

        Node first = new Node();
        first.item = 2;
        Node four = new Node();
        four.item = 4;
        first.next = four;

        Node second = new Node();
        second.item = 3;

        Node merged = MergeTwoSortedLinkedLists.merge(first, second);
        assertEquals(first.item, merged.item);
        assertEquals(second.item, merged.next.item);
        assertEquals(four.item, merged.next.next.item);
    }
}