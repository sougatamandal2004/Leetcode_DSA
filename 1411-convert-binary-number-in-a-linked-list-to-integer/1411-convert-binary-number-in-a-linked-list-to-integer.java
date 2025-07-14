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
        ListNode temp = head;
        ArrayList<Integer> bin = new ArrayList<>();
        while(temp != null){
            bin.add(temp.val);
            temp = temp.next;
        }
        int ans = 0;
        int size = bin.size();
        for(int i=size - 1; i >= 0 ; i--){
            int x = bin.get(i);
            int exp = size - (i + 1);
            ans = ans + (int)(x * Math.pow(2, exp));
        }
        return ans;
    }
}