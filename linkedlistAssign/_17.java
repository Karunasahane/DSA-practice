//17.detect loop

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedListDemo{
  
    boolean detectLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

}


class _17{
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
        //d.next=b;
        System.out.println(ll.detectLoop(head));
    }
}