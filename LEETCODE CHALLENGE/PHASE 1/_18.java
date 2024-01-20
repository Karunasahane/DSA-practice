//Chocolate Distribution Problem

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        
        int min=Integer.MAX_VALUE;
        int i=0;int j=m-1;
        
        while(j<a.size()){
            if(a.get(j)-a.get(i)<min){
                min=a.get(j)-a.get(i);
            }   
            i++; j++;
        }
        
        return min;
    }
}