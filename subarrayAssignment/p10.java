public class p10 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,2,5,1,7};
        int arr2[]=new int[]{1,2,2,4};
        int ans=maxsum(arr2);
        System.out.println(ans);
    }

    //optimized code--O(N)
    static int maxsum(int[]arr){
        int maxsumm=Integer.MIN_VALUE;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
            if(sum>maxsumm){
                maxsumm=sum;
            }
            if(j<arr.length-1 && arr[j]>=arr[j+1]){
                sum=0;
            }
        }
        return maxsumm;
    }
}

//gfcdsas