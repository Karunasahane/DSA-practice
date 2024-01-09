//reverse the queue till k elements
import java.util.*;

public class reverse {
    
    public static void main(String[] args) {
        Queue c=new ArrayDeque<>();
        System.out.println(c.isEmpty());
        c.add(3);
        c.add(5);
        c.add(9);
        c.add(12);
        c.add(15);
        System.out.println(c);
        reversetillindex(2,c);
    }
    
    

    //reverse till index x
    static void reversetillindex(int index,Queue c){
        Stack s1=new Stack<>();
        int z=c.size()-index;
        for(int i=0;i<=index;i++){
            s1.push(c.poll());
        }
        while(s1.size()>0){
            c.add(s1.pop());
        }
        for(int i=1;i<z;i++){
            c.add(c.remove());
        }
        System.out.println(c);
    }
}


 
