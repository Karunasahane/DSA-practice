class Solution {
    int getPairsCount(int[] arr, int n, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
            
        for(int i=0;i<n;i++){
            int b=k-arr[i];
            if(map.containsKey(b)){
                ans+=map.get(b);
            }
            
            if(!map.containsKey(arr[i])){
                 map.put(arr[i],1);
            }else {
               map.put(arr[i],map.get(arr[i])+1);
            }
        }
 
        return ans;
    }
}
