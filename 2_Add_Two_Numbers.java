/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1,l2,false);
    }
    private ListNode addTwoNumbers(ListNode l1,ListNode l2,boolean carry){
    	if(null == l1&&null == l2){
    		if(carry)
    			return new ListNode(1);
    		else
    			return null;
    	}
    	int res;
    	if(null == l1||null == l2){
    		res = (carry?1:0)+(l1 == null?0:l1.val)+(l2 == null?0:l2.val);
    	}else{
    		res = l1.val + l2.val + (carry?1:0);
    	}
    	ListNode ln = new ListNode(res%10);
    	ln.next = addTwoNumbers(l1 == null?l1:l1.next,l2 == null?l2:l2.next,res>=10);
    	return ln;
    }
}