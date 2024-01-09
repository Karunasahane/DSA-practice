import java.util.Stack;

class p12{

    static void pushpop(int arr[]){
        
        Stack<Integer> st=new Stack<>();
    
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={4,2,1,5,3};
       
        pushpop(arr);
      
    }
}