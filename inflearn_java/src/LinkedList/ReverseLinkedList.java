package LinkedList;

/**
 * 단일 연결 리스트가 주어집니다. 리스트를 reverse 해서 reversed lists를 리턴하세요.
 */
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) {
        this.val = x;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode3 l1 = new ListNode3(1);
        l1.next = new ListNode3(2);
        l1.next.next = new ListNode3(3);

        printNode(l1);
//      ListNode3 head = reverseList(l1);
//      printNode(head);
    }

    public static ListNode3 reverseList(ListNode3 cur) {

        // 1. ds
        ListNode3 next = null;
        ListNode3 prev = null;

        // 2. for while
        while (cur != null) {
            next = cur.next;  // cur 다음 step 2n-30
            cur.next = prev;
            prev = cur;
            cur = next;       // cur 다음 step 2n-30
        }
        return prev;
    }

    public static void printNode(ListNode3 head) {
        System.out.println("printNode : ");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println();
    }
}
