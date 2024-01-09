import java.util.Stack;
public class p14 {

    static void insertbottom(Object x,Stack st){
            Stack rt=new Stack();
            while(st.size()>0){
                rt.push(st.pop());
            }
            rt.push(x);
            while(rt.size()>0){
                st.push(rt.pop());
            }
            System.out.println(st);

    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(8);
        st.push(9);
        System.out.println(st);
        
        insertbottom(3, st); 
    }
}
