// - Given an integer array A containing N distinct integers, you have to find all
// the leaders in array A. An element is a leader if it is strictly greater than all
// the elements to its right side.
// NOTE: The rightmost element is always a leader.

public class p7 {

    //brute force
    /*public static void main(String[] args) {
        int a[]={16, 17, 4, 3, 5, 2};
        for(int i=0;i<a.length-1;i++){
            int flag=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.print(a[a.length-1]);
    }*/

    //optimized code
    public static void main(String[] args) {
         int a[]={16, 17, 4, 3, 5, 2};
         int max=Integer.MIN_VALUE;
         for(int i=a.length-1;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                System.out.print(a[i]+" ");
            }
         }
    }
}
