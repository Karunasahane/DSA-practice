import java.util.*;
public class _12 {
    
    public static void main(String[] args) {
        long arr[]=new long[]{-4 ,83 ,72, 86};
        System.out.println(arrangeOddAndEven(arr, 4));
    }

    static class Solution
    {
        ArrayList<Long> arrangeOddAndEven(long arr[], int n){
            ArrayList<Long> odd=new ArrayList<>();
            ArrayList<Long> even=new ArrayList<>();
            ArrayList<Long> ans=new ArrayList<>();
            
            int count1=0;int count2=1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    even.add(arr[i]);
                }
                else{
                    odd.add(arr[i]);
                }
            }
            int idx1=0;int idx2=0;
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    if(even.size()>idx1){
                        ans.add(even.get(idx1));
                        idx1++;
                    }
                    else{
                        ans.add(odd.get(idx2));
                        idx2++;
                    }
                }
                else{
                    if(odd.size()>idx2){
                        ans.add(odd.get(idx2));
                        idx2++;
                    }
                    else{
                        ans.add(even.get(idx1));
                        idx1++;
                    }
                }
            }
            return ans;
        }
    }
}
    
