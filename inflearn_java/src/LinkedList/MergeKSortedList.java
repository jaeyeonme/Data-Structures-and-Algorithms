package LinkedList;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * K개의 소팅된 LinkedList의 배열 lists가 주어집니다.
 * 각각의 LinkedList는 오름차순으로 정렬되어 있습니다.
 * ...
 */
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        this.val = x;
    }
}

public class MergeKSortedList {
    public static void main(String[] args) {
        MergeKSortedList a = new MergeKSortedList();

        ListNode1 l1 = new ListNode1(1);
        l1.next = new ListNode1(4);
        l1.next.next = new ListNode1(5);

        ListNode1 l2 = new ListNode1(1);
        l2.next = new ListNode1(3);
        l2.next.next = new ListNode1(4);

        ListNode1 l3 = new ListNode1(2);
        l3.next = new ListNode1(7);

        ListNode1[] list = new ListNode1[3];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;
        ListNode1 result = a.solve(list);
        a.print(result);
    }

    public ListNode1 solve(ListNode1[] lists) {

        // 1. ds
        Queue<ListNode1> q = new PriorityQueue<>((a, b) -> a.val - b.val);

        ListNode1 head = new ListNode1(0);
        ListNode1 res = head;

        // 2. for while
        for (ListNode1 list : lists) {
            if (list != null)
                q.offer(list);
        }

        while (!q.isEmpty()) {
            ListNode1 node = q.poll();
            res.next = node;
            res = res.next;

            if (node.next != null)
                q.offer(node.next);
        }
        return head.next;
    }


    private void print(ListNode1 node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
