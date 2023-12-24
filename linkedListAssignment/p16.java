/*16. Rotate a Linked List
Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a
given positive integer smaller than or equal to length of the linked list.
Example 1:
Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Example 2:
Input:
N = 8
value[] = {1, 2, 3, 4, 5, 6, 7, 8}
k = 4
Output: 5 6 7 8 1 2 3 4
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).*/

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head=null;
 
    void addlast(int data){
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

    void Rotate(int k){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;

    }

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}

class p16{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addlast(2);
        ll.addlast(4);
        ll.addlast(7);
        ll.addlast(45);
        ll.addlast(23);
        ll.print();
        ll.Rotate(3);
        ll.print();
    }
}