// 13.nth node from end of ll



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

    //=======genereal method------------
    int nthnode1(int n){
        int m=countNode()-n+1;
        Node temp=head;
        for(int i=1;i<m;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    //-----------better approach---------------
    int nthnode2(int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }
}


class _13{
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(9);
        System.out.println(ll.nthnode2(4));
    }
}
