public class p7 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int l=2;int r=4;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr,l,r);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //optimised------------
    static void reverse(int[]arr,int l,int r){
        int start=0;int end=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==l) start=i;
            if(arr[i]==r) end=i;
        }
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}
