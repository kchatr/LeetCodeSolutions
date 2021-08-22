
public class MergeTwoSortedLists {

    // Definition for singly-linked list.
    public class ListNode {
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

    ListNode ans = new ListNode();

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode cur = new ListNode();

        if (l1 == null) {
            if (l2 == null) {
                cur = null;
                return cur;
            } else {
                cur = l2;
                return cur;
            }
        } else if (l2 == null) {
            if (l1 == null) {
                cur = null;
                return cur;
            } else {
                cur = l1;
                return cur;
            }
        } else {
            if (l1.val <= l2.val) {
                cur.val = l1.val;
                cur.next = mergeTwoLists(l1.next, l2);
            } else {
                cur.val = l2.val;
                cur.next = mergeTwoLists(l1, l2.next);
            }

            ans = cur;

            return ans;
        }
    }
}