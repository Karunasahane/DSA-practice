//15. remove duplicate



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

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    void removedupli(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head.next==null){
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
}


class p15{
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        ll.add(9);
        ll.add(2);
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.print();
        ll.removedupli();
        ll.print();
    }
}