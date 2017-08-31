/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode cur,ind;
        ListNode root = new ListNode(x-1);
        root.next = head;
        for(cur = root;cur.next!=null&&cur.next.val<x;cur = cur.next);
        if(cur.next == null) return head;
        for(ind = cur;ind != null && ind.next != null;){
            if(ind.next.val<x){
                ListNode tmp = ind.next;
                ind.next = tmp.next;
                tmp.next = cur.next;
                cur.next = tmp;
                cur = tmp;
            }else{
                ind = ind.next;
            }
        }
        return root.next;
    }
}