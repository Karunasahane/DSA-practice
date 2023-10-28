// - Given an array of integers A, find and return the product array
//  where the ith element of the product array will be equal to the
// product of all the elements -divided by the ith element 
// ip:[1,2,3,4,5]
// op:[120, 60, 40, 30, 24]

public class p6 {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        int prod[]=new int[a.length];

        //approach 1
        for(int i=0;i<a.length;i++){
            int pro=1;
            for(int j=0;j<a.length;j++){
                if(j!=i){
                    pro=pro*a[j];
                }
                else{
                    continue;
                }
            }
            System.out.print(pro+" ");
        }
        System.out.println();

        //optimized
        int product=1;
        for(int i=0;i<a.length;i++){
            product=product*a[i];
        }
        for(int i=0;i<a.length;i++){
            prod[i]=product/a[i];
            System.out.print(prod[i]+" ");
        }

    }
}
