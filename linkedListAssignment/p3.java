/*3.Linked List Insertion
Create a link list of size N according to the given input literals. Each integer input is
accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the
beginning of the link list. If it is 1, insert the integer at the end of the link list.
Hint: When inserting at the end, make sure that you handle NULL explicitly.
Example 1:
Input:
LinkedList: 9->0->5->1->6->1->2->0->5->0
Output: 5 2 9 5 6

Expected Time Complexity: O(1) for insertAtBeginning() and O(N) for insertAtEnd().
Expected Auxiliary Space: O(1) for both.*/

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class LinkedList{
    Node head=null;

    void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
}
class p3{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
    }
}