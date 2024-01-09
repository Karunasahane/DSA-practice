import java.util.Stack;

public class p6 {
    public static void main(String[] args) {
        String str="karuna";
        p6 obj=new p6();
        System.out.println(obj.reveString(str));
    }


    String reveString(String str){
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=s.pop();
        }

        return new String(arr);

    }
}
