import java.util.*;

class stackimple{
    Queue<Integer> cc=new ArrayDeque<>();
    
    void push(int n){
       cc.add(n);
    }
    int pop(){
        for(int i=0;i<cc.size()-1;i++){
            cc.add(cc.remove());
        }
        int x=cc.peek();
        cc.remove();
        return x;
        
    }

    int peek(){
        for(int i=1;i<cc.size();i++){
            cc.add(cc.remove());
        }
        int x=cc.peek();
        cc.add(cc.remove());
        return x;
        
    }
    boolean isEmpty(){
        if(size()==0) return true;
        else return false;
        
    }
    
    int size(){
       return cc.size();
    }
    void display(){
    
        for(int i=1;i<=size();i++){
            int x=cc.peek();
            cc.add(cc.remove());
            System.out.print(x+" ");
        }
        System.out.println();
    }

}

public class p4 {
    
    public static void main(String[] args) {
        stackimple s=new stackimple();
        System.out.println(s.isEmpty());
        s.push(3);
        s.push(8);
        s.push(12);
        s.push(13);
        s.push(23);
        s.display();
        System.out.println(s.size());

        s.pop();      
        s.display();
        
        System.out.println(s.peek());
        System.out.println(s.size());
        s.pop();
        s.display();

    }
}

 
