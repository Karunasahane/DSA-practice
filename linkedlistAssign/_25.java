//25.find right middle

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedListDemo{
    Node head=null;
    void add(int data){
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

    void middle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}


class _25{
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(9);
        ll.add(13);
        ll.add(67);
        ll.middle();
    }
}
