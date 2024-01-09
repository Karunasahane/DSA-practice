//5 ll implementation


class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
class mystack{
    node head=null;
    node temp=null;

    void push(int n){
        node temp=new node(n);         //-------here we used addlast and dellast operations of ll
        if(head==null){
            head=temp;
        }
        else{
           node t=head;
           while(t.next!=null){
            t=t.next;
           } 
           t.next=temp;
        }

        /*------we can use addfirst and delfirst-----------*******more easy***********--------------------//
        node temp=new node(n);
        if(head==null){
            head=temp;
        }
        else{
           temp.next=head;
           head=temp;
        } 
        
         */
    }
    int peek(){
        if(head==null){
            System.out.println("stack is emply");
            return -1;
        }
        else{
             node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
           return temp.data;
        }
        /*
         if(head==null){
            System.out.println("stack is emply");
            return -1;
        }
        else{
            return head.data;
        }
        */
    }
    void pop(){
        if(head==null){
            System.out.println("stack is emply");
        }
        else{
            node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        /*
        if(head==null){
            System.out.println("stack is emply");
        }
        else{
            head=head.next;
        }
        */
         
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void size(){
        node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
    boolean isempty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    
}
public class _3LLimplementation {
    public static void main(String[] args) {
        mystack st=new mystack();
        System.out.println(st.isempty());
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(12);
        st.push(15);
        System.out.println(st.isempty());
        
        st.display();
        System.out.println();

        st.size();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println();
        
       
        

    }
}
