public class p2 {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int ans=equiIndex(arr);
        System.out.println(ans);
    }
    static int equiIndex(int arr[]){
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++){
            int sum1=0;int sum2=0;
            for(int j=0;j<i;j++){
                sum1=sum1+arr[j];
            }
            for(int j=i+1;j<n;j++){
                sum2=sum2+arr[j];
            }
            if(sum1==sum2){
                index=i+1;
                break;
            }
        }
        return index;
    }
}
