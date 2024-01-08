/*9. Remove duplicate element from sorted Linked List
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with
duplicate values) from the given list (if exists).

Note: Try not to use extra space. The nodes are arranged in a sorted way.
Example 1:
Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 2 ->2 -> 4-> 5, only 2 occurs more than 1 time. So we need
to remove it once. */

 public ListNode deleteDuplicates(ListNode head) {
        ListNode t=head;
        if(t==null){
            return null;
        }
        while(t.next!=null){
            if(t.val==t.next.val){
                t.next=t.next.next;
            }
            else{
                t=t.next;
            }
        }
        return head;
        
    }
