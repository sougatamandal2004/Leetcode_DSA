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
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if(lists.size() == 0) return NULL;
        while(lists.size() > 1){
            lists.push_back(mergeTwoLists(lists[0], lists[1]));
            lists.erase(lists.begin());
            lists.erase(lists.begin());
        }
        return lists.front();
    }
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(list1 == nullptr) return list2;
        if(list2 == nullptr) return list1;
        ListNode* curr = new ListNode(-1);
        ListNode* temp = curr;
        while(list1 != nullptr && list2 != nullptr){
            if(list1 -> val < list2 -> val){
                temp -> next = list1;
                list1 = list1 -> next;
                temp = temp -> next;
            }
            else{
                temp -> next = list2;
                list2 = list2 -> next;
                temp = temp -> next;
            }
        }
        while(list1){
            temp -> next = list1;
            list1 = list1 -> next;
            temp = temp -> next;
        }
        while(list2){
            temp -> next = list2;
            list2 = list2 -> next;
            temp = temp -> next;
        }
        return curr -> next;
    }
};