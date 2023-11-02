// Given a sorted array of distinct integers and a target value, return the index
// if the target is found. If not, return the index where it would be if it were
// inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2

class leetcode35 {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        if(target>arr[n-1])return n;
        else{
            int ans=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target|| arr[i]>target){
                    ans=i;
                    break;
                }
            }
            return ans;
        }
    }
}