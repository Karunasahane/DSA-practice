//8-evaluation of postfix


import java.util.Stack;
public class postfix {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<Integer> num=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(48<=ascii && ascii<=57){
                // //0-9 chya value num chya stack madhi
                num.push(ascii-48);
            }
            else{
                 // kaam
                int v2=num.pop();
                int v1=num.pop();
                if(ch=='+') num.push(v1+v2);
                if(ch=='-') num.push(v1-v2);
                if(ch=='*') num.push(v1*v2);
                if(ch=='/') num.push(v1/v2);
            }
        }
        System.out.println(num.peek());
    }
}

