//majority element--leetcode 169
//The majority element is the element that appears more than ⌊n / 2⌋ times.

class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(!hp.containsKey(arr[i])){
                hp.put(arr[i],1);
            }
            else{
                hp.put(arr[i],hp.get(arr[i])+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hp.get(arr[i])>arr.length/2){
                return arr[i];
            }
        }
        return 0;

        
    }
}