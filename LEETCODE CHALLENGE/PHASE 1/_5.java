//remove elements from array with value equal to val --leetcode-27

class Solution {
    public int removeElement(int[] arr, int val) {
        int l=0;int r=arr.length-1;
        while(l<=r){
            if(arr[l]==val){
                if(arr[r]!=val){
                    int temp=arr[l];
                    arr[l]=arr[r];
                    arr[r]=temp;
                }
                else{
                    r--;
                }
            }
            else{
                l++;
            }
        }
        return l;
    }
}