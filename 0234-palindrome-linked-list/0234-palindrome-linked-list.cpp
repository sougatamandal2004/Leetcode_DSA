/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        if(!head) return false;
        ListNode* slow = head;
        ListNode* fast = head;
        while(fast && fast -> next){
            slow = slow -> next;
            fast = fast -> next -> next;
        }
        ListNode* head2 = nullptr;
        if(fast != nullptr){
            head2 = slow -> next;
        } else{
            head2 = slow;
        }
        // reversing the 2nd half
        ListNode* prev = nullptr;
        ListNode* curr = head2;
        while(curr != nullptr){
            ListNode* tmp = curr -> next;
            curr -> next = prev;
            prev = curr;
            curr = tmp;
        }
        // now checking part
        head2 = prev;
        while(head2 != nullptr){
            if(head -> val != head2 -> val) return false;
            head = head -> next;
            head2 = head2 -> next;
        }
        return true;
    }
};