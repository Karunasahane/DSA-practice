public class p6 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,4,45,6,0,19};
        int x=51;
        int ans=sum(arr,x);
        System.out.println(ans);
        
    }
    static int sum(int[]arr,int x){
        int minlen=Integer.MAX_VALUE;int length=0;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>x){
                    length=j-i+1;
                    flag=1;
                    if(length<minlen){
                        minlen=length;
                    }
                }
            }
        }
        if(flag==1) return minlen;
        else return 0;
    }


}
