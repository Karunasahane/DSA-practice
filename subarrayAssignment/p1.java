//
import java.util.ArrayList;

class p1{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,7,5};
        int num=12;
        ArrayList ans=Arraysum(arr,num);
        System.out.println(ans);
    }
    static ArrayList<Integer> Arraysum(int arr[],int num){
        ArrayList<Integer> al=new ArrayList<>();
        int n=arr.length;
        int flag=0;
        int start=0;int end=0;

         for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum==num){
                    start=i+1;
                    end=j+1;
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                al.add(start);
                al.add(end);
                break;
            }
            
        }
        return al;
    }
}