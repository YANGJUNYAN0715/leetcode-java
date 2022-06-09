package leetcode;

public class leetcode61 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        ListNode res = rotateRight(head, k);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode p = head;
        int count = 1;
        while (p.next != null) {
            p = p.next;
            count++;
        }
        int realSkip = k % count;
        if (realSkip == 0) {
            return head;
        }
        p.next = head;
        for (int i = 0; i < count - realSkip; i++) {
            p = p.next;
        }
        head = p.next;
        p.next = null;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
