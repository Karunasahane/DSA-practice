public class p5 {
    public static void main(String[] args) {
        int arr[]=new int[]{15,-2,2,-8,1,7,10,23};
        int ans=zerosum(arr);
        System.out.println(ans);
        
    }
    static int zerosum(int[]arr){
        int maxlen=Integer.MIN_VALUE;int length=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    length=j-1+1;
                    if(length>maxlen){
                        maxlen=length;
                    }
                }
            }
        }
        return maxlen;
    }
}
