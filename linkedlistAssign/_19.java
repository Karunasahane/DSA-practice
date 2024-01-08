/*19. Intersection Point in Y Shaped Linked Lists
Given two singly linked lists of size N and M, write a program to get the point where two linked
lists intersect each other.
Example 1:
Input:
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)*/

class InterPoint{
    public int getIntersectionNode(Node headA, Node headB) {
            Node ans=null;
            int m;int n; Node temp1; Node temp2;
            if(size(headA)>size(headB)){
                n=size(headA);
                m=size(headB);
                temp1=headA;
                temp2=headB;
            }
            else{
                n=size(headB);
                m=size(headA);
                temp2=headA;
                temp1=headB;
            }
                
            for(int i=1;i<=n-m;i++){
                temp1=temp1.next;
            }

            while(temp1!=temp2){
                    temp1=temp1.next;
                    temp2=temp2.next;
            }
        return temp1.data;
    }

    int size(Node head){
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
