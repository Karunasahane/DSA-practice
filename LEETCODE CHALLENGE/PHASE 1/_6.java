// return array with smallest and second smallest element in the array

class Compute 
{
    public long[] minAnd2ndMin(long arr[], long n){
        long min=Integer.MAX_VALUE;
        long smin=min;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]>min && arr[i]<smin){
                smin=arr[i];
            }
        }
        
        if(smin==Integer.MAX_VALUE){        //condition for handling if all elements are same and no smin exist
            return new long[]{-1};
        }
        
        return new long[]{min,smin};
        
    }
}
