public class p9 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,1,4,5,2,3,6};
        int k=3;
        maxSub(arr,k);
    }
    static void maxSub(int arr[],int k){
        for(int i=0;i<=arr.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.print(max+" ");
        }
    }

    
}
