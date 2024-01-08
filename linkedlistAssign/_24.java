/*24. Check if Linked List is Palindrome
Given a singly linked list of size N of integers. The task is to check if the given linked list is
palindrome or not.
Example 1:
Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.
Example 2:
Input:
N = 4
value[] = {1,2,3,4}
Output: 0
Explanation: The given linked list
is 1 2 3 4 , which is not a palindrome
and Hence, the output is 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space Usage: O(1) (ie, you should not use the recursive stack space as*/

class palindrome{
    Node reverse(Node head){
          Node prev=null;
          Node fast=null;
          Node curr=head;
          while(curr!=null){
              fast=curr.next;
              curr.next=prev;
              prev=curr;
              curr=fast;
          }
          return prev;
    }

    Node mid(){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    boolean palindrome(){
        Node t1=mid();
        Node t2=reverse(t1.next);
        t1.next=t2;
    
        Node temp1=head;
        Node temp2=t2;
        while(temp2!=null){
            if(temp1.data!=temp2.data){
                return false;
            }
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return true;
    }
}
