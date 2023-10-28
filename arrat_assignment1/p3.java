// Problem Description
// - You are given an integer array A of length N.
// - You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
// - For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).

// Input 1:
// A = [2, 2, 2]
// B = [[0, 0], [1, 2]]

// Output:
// [2, 4]


public class p3 {
    public static void main(String[] args) {
        int a1[]=new int []{1, 2, 3, 4, 5};
        int b1[][]={{0,3},{1,2}};
        int a2[]=new int []{2,2,2};
        int b2[][]={{0,0},{1,2}};
        querysum(a1,b1);
        querysum(a2,b2);
    }
    static void querysum(int []a,int b[][]){
        int ps[]=new int[a.length];
        ps[0]=a[0];
        for(int i=1;i<a.length;i++){
            ps[i]=ps[i-1]+a[i];
        }
        for(int i=0;i<b.length;i++){
            int l=b[i][0]; int r=b[i][1];
            if(l==0){
                System.out.print(ps[r]+" ");
            }
            else{
                 System.out.print(ps[r]-ps[l-1]+" ");
            }
        }

    }
}
