//leader in the array


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
       ArrayList<Integer> ans=new ArrayList<>();
       int max=Integer.MIN_VALUE;
       for(int i=arr.length-1;i>=0;i--){
           if(arr[i]>=max){
               ans.add(arr[i]);
               max=arr[i];
           }
       }
       Collections.reverse(ans);
       return ans;
    }
}

