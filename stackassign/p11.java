import java.util.Stack;

public class p11 {
    public static void main(String[] args) {
        String str="5+2*56-2/4";  //4/2-56*2+5
        p11 obj=new p11();
        System.out.println(obj.reveString(str));
    }


    String reveString(String str){
        Stack<Character> s=new Stack<Character>();
        Stack<Character> num=new Stack<Character>();


        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(ch=='+'|| ch=='-' || ch=='*'|| ch=='/'){
                while(!num.isEmpty()){
                   s.push(num.pop());
                }
                s.push(str.charAt(i));
            }
            else{
                num.push(str.charAt(i));
            }
        }

        while(!num.isEmpty()){
                    s.push(num.pop());
        }

        str="";
        while(!s.isEmpty()){
            str=str+s.pop();
        }
        return str;


    }
}
