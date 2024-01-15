
//key pair problem --GFG
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
	    HashMap<Integer,Integer> hp=new HashMap<>();
	    boolean ans=false;
	    
	    
	    for(int i=0;i<arr.length;i++){
	        hp.put(arr[i],i);
	    }
	    
	    
	    for(int i=0;i<arr.length;i++){
	        int comple=x-arr[i];
	        if(hp.containsKey(comple) && hp.get(comple)!=i){
	            ans=true;
	        }
	    }
	    return ans;
	    
	}
    
}
