// - Given an array A of N integers.
// - Construct the prefix sum of the array in the given array itself.

public class p5 {
    public static void main(String[] args) {
        int a[]={2,3,5,6,7};
        int ps[]=new int[a.length];
        ps[0]=a[0];
        for(int i=1;i<a.length;i++){
            ps[i]=ps[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(ps[i]+" ");
        }
    }
}
