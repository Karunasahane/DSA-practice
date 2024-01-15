//find single element --leetcode-136

class Solution {
    public int singleNumber(int[] arr) {
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=arr[i]^num;
        }
        return num;
    }
}