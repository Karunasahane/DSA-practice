//reverse
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

        reverse(c);
   
    }
    
    static void reverse(Queue c){
        Stack s=new Stack<>();
        while(c.size()>0){
            s.push(c.poll());
        }
        while(s.size()>0){
            c.add(s.pop());
        }
        System.out.println(c);
    }

}


 
