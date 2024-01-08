/*4.Doubly linked list Insertion at given position
Given a doubly-linked list, a position p, and an integer x. The task is to add a new node with
value x at the position just after p

th node in the doubly linked list.

Example 1:
Input:
LinkedList: 2<->4<->5
p = 2, x = 6
Output: 2 4 5 6
Explanation: p = 2, and x = 6. So, 6 is inserted after p, i.e, at position 3 (0-based indexing).*/

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
    }
}

class LinkedList{
    Node head=null;

    int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
   }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
   }

    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    void addat(int data,int pos){
        Node newNode =new Node(data);
        Node temp=head;
        if(pos<0 || pos>size()){
            System.out.println("invalid index");
            return;
        }
        else if(pos==0){
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
        else if(pos==size()){
            while(temp.next!=null){
                temp=temp.next;
            }
            newNode.prev=temp;
            temp.next=newNode;
        }
        else{
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next.prev=newNode;
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next=newNode;
        }
    }
}

class _4{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(2);
        ll.add(5);
        ll.add(12);
        ll.add(5);
        ll.print();

        ll.addat(7, 0);
        ll.print();
    }
}
