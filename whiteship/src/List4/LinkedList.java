package List4;

import javax.management.ListenerNotFoundException;
import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        LinkedNode node3 = new LinkedNode(3);
        list.add(node3);
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(5));
        list.add(node3);

//        list.print();
        System.out.println(list.hasCircle2());
    }

    /**
     * TODO 주어진 연결 리스트가 원형 연결 리스트인지 단일 연결 리스트인지 확인하는 함수를 구현하라.
     *  예) 1 -> 2 -> 3 -> 1   => true
     *  예) 1 -> 2 -> 3 -> 2   => true
     *  예) 1 -> 2 -> 3        => false
     * @return
     */
    private boolean hasCircle1() {
        Set<LinkedNode> nodeSet = new HashSet<>();
        LinkedNode current = this.head;
        while (current != null) {
            if (nodeSet.contains(current)) {
                return true;
            } else {
                nodeSet.add(current);
            }

            current = current.next;
        }

        return false;
    }

    private boolean hasCircle2() {
        LinkedNode slow = this.head;
        LinkedNode fast = this.head;

        while (fast != null) {
            if (fast.next == null && fast.next.next == null) {
                return false;
            }

            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

            slow = slow.next;
        }

        return false;
    }

    private void print() {
        LinkedNode nodeToPrint = this.head;
        while(nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }

}