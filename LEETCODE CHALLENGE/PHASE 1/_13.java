//pivot index

class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        if(arr[n-1]-arr[0]==0) return 0;
        for(int i=1;i<n;i++){
            if((arr[n-1]-arr[i])==arr[i-1]){
                return i;
            }
        }
        return -1;
    }
}
