//4-delete middle element

import java.util.Stack;

public class p4 {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(8);
        st.push(9);
        System.out.println(st);

         deleteatbottom(st);
    }

    static void deleteatbottom(Stack st){
         Stack rt=new Stack();
         int val=st.size()/2;
         while(st.size()>val){
            rt.push(st.pop());
         }
         rt.pop();
         while(st.size()>0){
            rt.push(st.pop());
         }
        while(rt.size()>0){
            st.push(rt.pop());
         }
         System.out.println(st);
    }
}
