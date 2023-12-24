/*8. Delete without head pointer

You are given a pointer/ reference to the node which is to be deleted from the linked list of N
nodes. The task is to delete the node. Pointer/ reference to the head node is not given.
Note: No head reference is given to you. It is guaranteed that the node to be deleted is not a tail
node in the linked list.
Example 1:
Input:
N = 2
value[] = {1,2}
node = 1
Output: 2 */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class _8{
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(8);
        Node d=new Node(12);
        Node head=a;
        a.next=b;
        b.next=c;
        c.next=d;
        print(head);
        delete(d);
        print(head);

    }

    static void delete(Node temp){
        if(temp==null){
            return;
        }
        else if(temp.next==null){
            temp=null;
            return;
        }
        temp.data=temp.next.data;
        temp.next=temp.next.next;
    }

    static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}