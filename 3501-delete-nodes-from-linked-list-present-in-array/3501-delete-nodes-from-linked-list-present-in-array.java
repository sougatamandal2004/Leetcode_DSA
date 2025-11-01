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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int size = nums.length;
        if(size == 0 || head == null) return head;
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        ListNode list = new ListNode(0);
        list.next = head;
        ListNode prev = list;
        ListNode curr = head;
        while(curr != null){
            if(st.contains(curr.val)){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return list.next;
    }
}