//max product of three number in array

class Solution {
    public int maximumProduct(int[] arr) {

        //two possibilities--
        //1-- three largest positive number product 
        //2-- two smallest negative number*largest positive number product 

        int max1=Integer.MIN_VALUE;
        int max2=max1;
        int max3=max1;
        int min1=Integer.MAX_VALUE;
        int min2=min1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3){
                max3=arr[i];
            }

            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2){
                min2=arr[i];
            }
        }
        return Math.max(max1*max2*max3 , max1*min1*min2);
    }
     
}