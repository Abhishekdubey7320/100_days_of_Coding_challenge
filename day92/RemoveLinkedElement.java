class Solution {
public ListNode removeElements(ListNode head, int val) {
if(head == null){
return head;
}

    ListNode result = new ListNode(0);
    ListNode current_node = result;

    while(head != null){

        if(head.val != val){
            current_node.next = head;
            current_node = current_node.next;
        }
        head = head.next;
    }
    current_node.next = null;
    return result.next;
}
}
