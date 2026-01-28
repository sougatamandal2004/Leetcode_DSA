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
    ListNode* oddEvenList(ListNode* head) {
        if(head == nullptr || head -> next == nullptr) return head;
        ListNode* root1 = new ListNode(-1);
        ListNode* temp1 = root1;
        ListNode* root2 = new ListNode(-1);
        ListNode* temp2 = root2;
        int cnt  = 1;
        ListNode* temp = head;
        while(temp != nullptr){
            if(cnt%2) {
                temp1 -> next = temp;
                temp1 = temp1 -> next; 
            } else{
                temp2 -> next = temp;
                temp2 = temp2 -> next;
            }
            temp = temp -> next;
            cnt++;
        }
        temp2 -> next = nullptr;
        temp1 -> next = root2 -> next;
        return root1 -> next;
    }
};