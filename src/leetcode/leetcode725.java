package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class leetcode725 {
    public static void main(String[] args) {
        ListNode head =new ListNode();
        head.val=1;
        head.next = new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))));
//        Stack<Integer> stack = new Stack<Integer>();
//        while(head!=null){
//            stack.push(head.val);
//            head = head.next;
//        }
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop()+" ");
//        }
        int k = 3;
        splitListToParts(head,k);
    }
    public static void splitListToParts(ListNode head, int k){
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int quotient = n / k, remainder = n % k;

        ListNode[] parts = new ListNode[k];
        ListNode curr = head;
        for (int i = 0; i < k && curr != null; i++) {
            parts[i] = curr;
            int partSize = quotient + (i < remainder ? 1 : 0);
            for (int j = 1; j < partSize; j++) {
                curr = curr.next;
            }
            ListNode next = curr.next;
            curr.next = null;
            curr = next;
        }
        for(int i = 0;i<parts.length;i++) {
            System.out.println(parts[i].val);
        }
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
