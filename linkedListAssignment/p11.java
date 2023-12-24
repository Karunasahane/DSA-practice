/*11. Insert in Middle of Linked List
Given a linked list of size N and a key. The task is to insert the key in the middle of the linked
list.
Example 1:   Input:   LinkedList = 1->2->4  key = 3  Output: 1 2 3 4
Example 2:   Input:   LinkedList = 10->20->40->50    key = 30       Output: 10 20 30 40 50
Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)*/

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

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void insertAtMiddle(int data){
        Node newNode=new Node(data);
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        newNode.next=slow.next;
        slow.next=newNode;
    }
}

class p11{

    public static void main(String[] args) {
        
        LinkedList ll=new LinkedList();
        ll.addlast(2);
        ll.addlast(4);
        //ll.addlast(7);
        ll.addlast(45);
        ll.addlast(23);
        ll.print();
        ll.insertAtMiddle(77);
        ll.print();
    }
        
}
    
