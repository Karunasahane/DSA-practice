//next greater element --gfg,leetcode-496

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            
            int j=0;
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    break;
                }
            }
            for(int k=j;k<nums2.length;k++){
                if(nums2[k]>nums2[j]){
                    arr[i]=nums2[k];
                    break;
                }
                else arr[i]=-1;
            }  
        }
        return arr;
    }
}