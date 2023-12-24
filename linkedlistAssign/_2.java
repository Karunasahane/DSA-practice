//length of loop

//count nodes in ll 

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedListDemo{
  
    int nodesInLoop(Node head){
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
                int num=0;                        //loop mdhle node mojayla
                while(temp.next!=slow){
                    temp=temp.next;
                    num++;
                }
                num++;
                return num;
                  
            }
        }
        return 0;
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
        System.out.println(ll.nodesInLoop(head));
    }
}