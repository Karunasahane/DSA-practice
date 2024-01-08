/*5. Reverse a linked list
Given a linked list of N nodes. The task is to reverse this list.
Example 1:
Input:
LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
Explanation: After reversing the list, elements are 6->5->4->3->2->1. */

void reverse(){
        Node curr=head;
        forw=null;
        Node prev=null;

       while(curr!=null){
           forw=curr.next;
           curr.next=prev;
           prev=curr;
           curr=forw;
       }
}
