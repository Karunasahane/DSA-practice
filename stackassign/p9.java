import java.util.Stack;

class p9{

    static void getmin(int arr[],int idx){
        int min=Integer.MAX_VALUE;
        int index=idx;
        Stack<Integer> st=new Stack<>();
    
        for(int i=idx;i<arr.length;i++){
            st.push(arr[i]);
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        
        System.out.println(st); 
        for(int i=0;i<arr.length;i++){
            if(i<=index){
                System.out.println(min);
                st.pop();
            }
            else{
                System.out.println(st.pop());
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,2,1,5,3};
       
        getmin(arr,0);
      
    }
}