public class p8 {
    public static void main(String[] args) {
        int arr[]=new int[]{6,-3,-10,0,2};
        int x=51;
        int ans=sum(arr,x);
        System.out.println(ans);
        
    }
    /*static int sum(int[]arr,int x){
        int maxProd=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=i;j<arr.length;j++){
                prod=prod*arr[j];
                if(prod>maxProd){
                    maxProd=prod;
                }
            }
        }
        return maxProd;
    }*///----------------------

    //optimized---------
    static int sum(int[]arr,int x){
        int maxProd=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<arr.length;i++){
                prod=prod*arr[i];
                if(prod>maxProd){
                    maxProd=prod;
                }
                if(prod==0){
                    prod=1;
                }
        }
        return maxProd;
    }
    
}



