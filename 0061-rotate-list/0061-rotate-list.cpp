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
    ListNode* rotateRight(ListNode* head, int k) {
         if (!head || !head->next || k == 0) return head;
        int size = 1;
        ListNode* tail = head;
        while(tail -> next){
            tail = tail -> next;
            size++;
        }
         k = k % size;
         if(k == 0) return head;
         tail -> next = head; // making the list circular
        ListNode* newTail = head;
        for(int i=1;i<size-k;i++){
            newTail = newTail -> next;
        }
        head = newTail -> next;
        newTail -> next = nullptr;
        return head;
    }
};