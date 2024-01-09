//queue imple using 2 stacks

import java.util.Stack;

class quetimple{
    
    Stack<Integer> s=new Stack<>();
    Stack<Integer> t=new Stack<>();
    
    void add(int n){
       s.push(n);
    }
    int remove(){
        while(s.size()>1){
            t.push(s.pop());
        }
        int x=s.peek();
        s.pop();
        while(t.size()>0){
            s.push(t.pop());
        }
        return x;
        
    }

    int peek(){
     
        while(s.size()>1){
            t.push(s.pop());
        }
        int x=s.peek();
        while(t.size()>0){
            s.push(t.pop());
        }
        return x;
            
        
    }
    boolean isEmpty(){
        if(size()==0) return true;
        else return false; 
    }
    
    int size(){
       return s.size();
    }
    void display(){
        
        while(s.size()>1){
            t.push(s.pop());
        }
        System.out.print(s.peek()+" ");
        while(t.size()>0){
            System.out.print(t.peek()+" ");
            s.push(t.pop());
        }
       
            
    }
   

}

public class QueueImple {
    
    public static void main(String[] args) {
        queimple c=new queimple();
        System.out.println(c.isEmpty());
        c.add(3);
        c.add(5);
        c.add(9);
        c.add(12);
        c.add(15);
        c.display();
        System.out.println();
        System.out.println(c.size());

        c.remove();        //same as c.pop()  --FIFO
        c.display();
        System.out.println();
        
        System.out.println(c.peek());
        System.out.println(c.size());
        System.out.println(c.isEmpty());

    }
}

 
