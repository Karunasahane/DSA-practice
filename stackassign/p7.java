import java.util.Stack;

class specialstack{
    Stack<Integer> s=new Stack<Integer>();
    int min=Integer.MAX_VALUE;

    int getMin(){
        return min;
    }

    void push(int n){
        s.push(n);
        if(n<min){
            min=n;
        }
    }

    int peek(){
        return s.peek();
    }

    void pop(){
        s.pop();
    }
 
    boolean isempty(){
        return s.isEmpty();
    }
}
public class p7{
    public static void main(String[] args) {
        specialstack st=new specialstack();
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(12);
        st.push(15);
        System.out.println(st.isempty());
        System.out.println(st.getMin());
        st.peek();
    }
}

