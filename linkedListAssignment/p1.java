//count nodes in ll 

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

    int countNode(){
        int count=0;
        Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
    }
}


class p1{
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(9);
        
        System.out.println(ll.countNode());
    }
}