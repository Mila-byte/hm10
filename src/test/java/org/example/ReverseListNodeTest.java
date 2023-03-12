package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseListNodeTest {
    @Test
    public void ReverseListNodeTest() {
        Main main = new Main();
        int[] head = {1, 2, 33, 7, 1};
        main.init(head);
        int[] result = headToArray(main.getHead());
        int[] reversedHead = {1, 7, 33, 2, 1};
        Assert.assertArrayEquals(reversedHead, result);
    }

    public static int[] headToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
