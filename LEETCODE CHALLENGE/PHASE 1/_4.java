//two sum--leetcode 1

class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int ans[]=new int[2];

        for(int i=0;i<arr.length;i++){
            hp.put(arr[i],i);
        }
        
        for(int i=0;i<arr.length;i++){
            int comple=target-arr[i];
            if(hp.containsKey(comple) && hp.get(comple)!=i){
                ans=new int[]{i,hp.get(comple)};
            }
        }
       return ans;
        

    }
}