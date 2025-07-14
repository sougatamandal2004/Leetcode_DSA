/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        int length = findLength(node);
        int ans = 0;
        while(node != null){
           if(node.val == 1){
            ans += Math.pow(2, length-1);
           }
           node = node.next;
           length--;
        }
        return ans;
    }
    public int findLength(ListNode node){
        int len = 1;
        while( node.next != null){
            len++;
            node = node.next;
        }
        return len;
    }
}