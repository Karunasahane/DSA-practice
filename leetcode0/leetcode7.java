// Given an array of integer numbers and an integer target, return indices of
// the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you
// may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

public class leetcode7 {
    public int reverse(int x) {
        long ans=0;
        while(x!=0){
            int n=x%10;
            ans=ans*10+n;
            x=x/10;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
            return 0;
        }
        else{
        return (int)ans;
        }
    }
}

