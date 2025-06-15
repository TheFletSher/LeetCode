import java.util.ArrayList;
import java.util.LinkedList;

public class leet2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode l3 = new ListNode(9);

        int num1 = 0, exp = 0;
        ListNode curr = l1;
        while (curr != null) {
            num1 += curr.val * Math.pow(10, exp++);
            curr = curr.next;
        }

        ListNode result = addTwoNumbers(l3, l1);

        System.out.println();

        curr = result;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> num1 = new LinkedList<>(), num2 = new LinkedList<>();

        ListNode curr = l1;
        while (curr != null) {
            num1.addFirst(curr.val);
            curr = curr.next;
        }

        curr = l2;
        while (curr != null) {
            num2.addFirst(curr.val);
            curr = curr.next;
        }

        LinkedList<Integer> smaller;
        if (num1.size() < num2.size()) {
            smaller = num1;
        } else {
            smaller = num2;
        }

        ListNode result = new ListNode();
        curr = result;

        return result;
    }
}
