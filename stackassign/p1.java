import java.util.Stack;

class p1{

    static void ImmeSmaller(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        st.push(-1);

        for(int i=arr.length-1;i>0;i--){
            st.push(arr[i]);
        }
        
        System.out.println(st); 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>st.peek()){
                arr[i]=st.peek();
            }
            else{
                arr[i]=-1;
            }
            st.pop();
        }
    }

    public static void main(String[] args) {
        int arr[]={4,2,1,5,3};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        ImmeSmaller(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}