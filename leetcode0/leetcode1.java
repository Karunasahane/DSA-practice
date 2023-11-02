// Given a signed 32-bit integer x, return x with its digits reversed. If reversing
// x causes the value to go outside the signed 32-bit integer range [-231, 231
// - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed
// or unsigned).
// Example 1:
// Input: x = 123
// Output: 321

public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;arr[1]=j;
                        return arr;
                }
            }
        }
    return arr;
    }
}

