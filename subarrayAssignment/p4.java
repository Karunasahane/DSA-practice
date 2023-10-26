public class p4 {
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,-3,1,6};
        boolean ans=zerosum(arr);
        System.out.println(ans);
        
    }
    static boolean zerosum(int[]arr){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    }
}
