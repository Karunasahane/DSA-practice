/*18. Remove loop in Linked List
Given a linked list of N nodes such that it may contain a loop.A loop here means that the last node of the link list is connected to the node at position
X(1-based index). If the link list does not have any loop, X=0.

Example 1: Input:N = 3 value[] = {1,3,4} X = 2
           Output: 1
Example 2: Input:N = 4 value[] = {1,8,3,4} X = 0
           Output: 1
*/

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedListDemo{
  
    void removeLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){       //mhnje loop ahe detect jhal
                Node temp=head;
                if(temp!=slow){                       
                    while(temp!=slow){              //slow and temp loop chya start point vr bhetatil
                        slow=slow.next;
                        temp=temp.next;
                    }
                }
                                     //loop mdhle node mojayla
                while(temp.next!=slow){
                    temp=temp.next;
                }
                temp.next=null;
            }
        }
    }
}
class _2{
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(8);
        Node d=new Node(12);
        Node head=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=a;
    }
}
X = 1
Output: 1
Explanation: The link list looks like
1 -> 2 -> 3 -> 4
^ |
|______________|
A loop is present.
If you remove it successfully,
the answer will be 1.
Expected time complexity: O(N)
Expected auxiliary space: O(1)*/
