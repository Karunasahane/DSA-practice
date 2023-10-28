/* Given an array A of size N.
You need to find the sum of the Maximum and Minimum elements in the given array.

*/class p1{
    public static void main(String[] args) {
        int arr[]=new int[]{2,5,34,87,90};
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max+min);

    }

}
