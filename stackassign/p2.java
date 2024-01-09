//2-stack implementation

class mystack{
    int arr[]=new int[5];
    int index=0;

    void push(int n){
        if(isfull()){
            System.out.println("stack is full");
        }
        else{
            arr[index]=n;
            index++;
            
        }
    }
    int peek(){
        if(index==0){
            System.out.println("stack is emply");
            return -1;
        }
        else{
            return arr[index-1];
        }
    }
    void pop(){
        if(index==0){
            System.out.println("stack is emply");
        }
        else{
            arr[index-1]=0;
            index--;
        }
    }
    void display(){
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void size(){
        System.out.println(index);
    }
    boolean isempty(){
        if(index==0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isfull(){
        if(index==arr.length){
            return true;
        }
        else{
            return false;
        }
    }
}
public class _2arrayImplementation {
    public static void main(String[] args) {
        mystack st=new mystack();
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(12);
        st.push(15);
        System.out.println(st.isempty());
        System.out.println(st.isfull());

        st.display();
        System.out.println();

        st.size();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println();
       
        

    }
}
