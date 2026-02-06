class MyLinkedList {
  ListNode* head;
public:
    MyLinkedList() {
        head = new ListNode(-1);
    }
    
    int get(int index) {
        if(index < 0) return -1;
        ListNode* temp =head -> next;
        int cnt = 0;
        while(temp != nullptr){
            if(cnt == index){
                return temp -> val;
            }
            temp = temp -> next;
            cnt++;
        }
        return -1;
    }
    
    void addAtHead(int val) {
        ListNode* node = new ListNode(val);
        node -> next = head -> next;
        head -> next = node;
    }
    
    void addAtTail(int val) {
        ListNode* newNode = new ListNode(val);
        ListNode* temp = head;
        while(temp->next){
            temp = temp -> next;
        }
        temp -> next = newNode;
    }
    
    void addAtIndex(int index, int val) {
        if(index < 0) return;
        ListNode* newNode = new ListNode(val);
        ListNode* temp = head;
        for(int i=0;i<index;i++){
            if(temp == NULL) return;
            temp = temp -> next;
        }
        if(temp == NULL) return;
        newNode -> next = temp -> next;
        temp -> next = newNode;
    }
    
    void deleteAtIndex(int index) {
        if(index < 0) return;
        ListNode* temp = head;
        for(int i=0;i<index;i++){
            if(temp == NULL) return;
            temp = temp -> next;
        }
        if(temp == NULL || temp -> next == NULL) return;
        ListNode* delNode = temp -> next;
        temp -> next = delNode -> next;
        delete delNode;
    }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */