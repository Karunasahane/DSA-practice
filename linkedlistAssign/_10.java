/*10. Identical Linked Lists
Given two Singly Linked List of N and M nodes respectively. The task is to check whether two
linked lists are identical or not.
Two Linked Lists are identical when they have the same data and with the same arrangement
too.
Example 1:
Input:
LinkedList1: 1->2->3->4->5->6
LinkedList2: 99->59->42->20
Output: Not identical
Example 2:
Input:
LinkedList1: 1->2->3->4->5
LinkedList2: 1->2->3->4->5

Output: Identical
Constraints:
1 <= N <= 10^3
Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1) */



class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedListDemo{
    boolean identical(Node head1,Node head2){
        Node t1=head1;
        Node t2=head2;
        while(t1!=null && t2!=null){
            if(t1.data!=t2.data){
                return false;
            }
            else{
                t1=t1.next;
                t2=t2.next;
            }
        }
        if(t1==null && t2==null){
            return true;
        }
        else{
            return false;
        }    
    }
}

class p10{
    public static void main(String[] args) {
    }
}
