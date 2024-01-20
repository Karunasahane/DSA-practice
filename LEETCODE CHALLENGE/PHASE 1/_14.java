
//Equal Left and Right Subarray Sum

class Solution{
	int equalSum(int [] arr, int n) {

        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        
        if(arr[n-1]-arr[0]==0) return 1;
        
        for(int i=1;i<n;i++){
            if((arr[n-1]-arr[i])==arr[i-1]){
                return i+1;
            }
        }
        
        return -1;
    }
}
